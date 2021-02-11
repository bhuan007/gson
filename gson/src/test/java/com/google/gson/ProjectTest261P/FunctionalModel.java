package com.google.gson.ProjectTest261P;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import org.junit.Test;
import org.junit.Assert;

import java.math.BigDecimal;

public class FunctionalModel {

    private class TestPerson {
        String fullName;
        Integer age;
        boolean isMale;
        Double balance;

        public TestPerson(String fullName, int age, boolean isMale, Double balance) {
            this.fullName = fullName;
            this.age = age;
            this.isMale = isMale;
            this.balance = balance;
        }

        public String toString() {
            return String.format("fullName: %s, age: %s, isMale: %s, balance: %s", this.fullName, this.age, this.isMale, this.balance);
        }

        public Class<?> checkBalanceType() {
            return this.balance.getClass();
        }
    }

    @Test
    public void objectToString() {
        // With zero or without zero before decimal: limit is 19
        // Non zero before decimal: limit is 18
        TestPerson person1 = new TestPerson("Jane Doe", 29, false, 0.12345678901234567890 );
        String actualJSON = new Gson().toJson(person1);
        String expectedJSON = "{\"fullName\":\"Jane Doe\",\"age\":29,\"isMale\":false,\"balance\":0.12345678901234567890}";
        Assert.assertEquals(expectedJSON, actualJSON);
    }

    @Test
    public void stringToObject() {
        // There is no limit on length because the input is a String and GSON uses a stream reader
        String jsonString = "{\"fullName\":\"Jane Doe\",\"age\":29,\"isMale\":false,\"balance\":123.123456789}";
        TestPerson actualPerson = new Gson().fromJson(jsonString, TestPerson.class);
        TestPerson expectedPerson  = new TestPerson("Jane Doe", 29, false, 123.123456789);
        Assert.assertEquals(expectedPerson.toString(), actualPerson.toString());
    }

    @Test
    public void stringToObjectAndBack() {
        String jsonString = "{\"fullName\":\"Jane Doe\",\"age\":29,\"isMale\":false,\"balance\":123.123456789012345}";
        TestPerson person = new Gson().fromJson(jsonString, TestPerson.class);
        String actualString = new Gson().toJson(person);
        Assert.assertEquals(jsonString, actualString);
    }

    @Test
    public void nullStringToObject() {
        String s = null;
        TestPerson actualPerson = new Gson().fromJson(s,TestPerson.class);
        TestPerson expectedPerson = null;
        Assert.assertEquals(expectedPerson, actualPerson);
    }

    @Test
    public void nullObjectToString() {
        TestPerson nullPerson = null;
        String expected = null;
        Assert.assertEquals(String.valueOf(expected), new Gson().toJson(nullPerson));
    }
}
