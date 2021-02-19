package com.google.gson.ProjectTest261P;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import junit.runner.Version;
import org.junit.Test;
import org.junit.Assert;
import org.junit.rules.ExpectedException;

import java.math.BigDecimal;
import java.math.BigInteger;


public class StructuralTestProjectTest261P {
    class NewJsonElement extends JsonElement {
        @Override
        public JsonElement deepCopy() {
            return null;
        }
    }

    @Test(expected = UnsupportedOperationException.class)
    public void jsonElementGetAsBoolean() {
        NewJsonElement element = new NewJsonElement();
        boolean e = element.getAsBoolean();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void jsonElementGetAsNumber() {
        NewJsonElement element = new NewJsonElement();
        Number num = element.getAsNumber();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void jsonElementGetAsString() {
        NewJsonElement element = new NewJsonElement();
        String string = element.getAsString();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void jsonElementGetAsDouble() {
        NewJsonElement element = new NewJsonElement();
        double d = element.getAsDouble();
    }


    @Test(expected = UnsupportedOperationException.class)
    public void jsonElementGetAsFloat() {
        NewJsonElement element = new NewJsonElement();
        Float f  = element.getAsFloat();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void jsonElementGetAsLong() {
        NewJsonElement element = new NewJsonElement();
        Long longy = element.getAsLong();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void jsonElementGetAsInt() {
        NewJsonElement element = new NewJsonElement();
        // This method below will throw exception
        int e = element.getAsInt();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void jsonElementGetAsByte() {
        NewJsonElement element = new NewJsonElement();
        Byte bytey = element.getAsByte();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void jsonElementGetAsCharacter() {
        NewJsonElement element = new NewJsonElement();
        // This method below will throw exception
        char c = element.getAsCharacter();
    }


    @Test(expected = UnsupportedOperationException.class)
    public void jsonElementGetAsBigInteger() {
        NewJsonElement element = new NewJsonElement();
        BigInteger b  = element.getAsBigInteger();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void jsonElementGetAsBigDecimal() {
        NewJsonElement element = new NewJsonElement();
        BigDecimal bigDecimal = element.getAsBigDecimal();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void jsonElementGetAsShort() {
        NewJsonElement element = new NewJsonElement();
        Short shorty = element.getAsShort();
    }

    @Test(expected = IllegalStateException.class)
    public void jsonElementGetAsJsonNull() {
        JsonObject element = new JsonObject();
        element.getAsJsonNull();
    }

    JsonArray myArray = new JsonArray();
    JsonArray myArray2 = new JsonArray();



    @Test
    public void jsonArrayIsEmpty() {
        boolean mybool = myArray.isEmpty();
        Assert.assertTrue(mybool);
    }

    @Test(expected = IllegalStateException.class)
    public void jsonArrayGetAsNumber() {
        myArray.getAsNumber();
    }

    @Test(expected = IllegalStateException.class)
    public void jsonArrayGetAsString() {
        myArray.getAsString();
    }

    @Test(expected = IllegalStateException.class)
    public void jsonArrayGetAsDouble() {
        myArray.getAsDouble();
    }

    @Test(expected = IllegalStateException.class)
    public void jsonArrayGetAsBigDecimal() {
        myArray.getAsBigDecimal();
    }

    @Test(expected = IllegalStateException.class)
    public void jsonArrayGetAsBigInteger() {
        myArray.getAsBigInteger();
    }

    @Test(expected = IllegalStateException.class)
    public void jsonArrayGetAsFloat() {
        myArray.getAsFloat();
    }

    @Test(expected = IllegalStateException.class)
    public void jsonArrayGetAsLong() {
        myArray.getAsLong();
    }

    @Test(expected = IllegalStateException.class)
    public void jsonArrayGetAsInt() {
        myArray.getAsInt();
    }

    @Test(expected = IllegalStateException.class)
    public void jsonArrayGetAsByte() {
        myArray.getAsByte();
    }

    @Test(expected = IllegalStateException.class)
    public void jsonArrayGetAsCharacter() {
        myArray.getAsCharacter();
    }

    @Test(expected = IllegalStateException.class)
    public void jsonArrayGetAsShort() {
        myArray.getAsShort();
    }
    @Test(expected = IllegalStateException.class)
    public void jsonArrayGetAsBoolean() {
        myArray.getAsBoolean();
    }

    @Test
    public void jsonArrayGetAsNumberReturn() {
        Number num = 52;
        myArray2.add(num);
        Number actual = myArray2.getAsNumber();
        Assert.assertEquals(num, actual);
    }


    @Test
    public void jsonArrayGetAsStringReturn() {
        String myString = "hello";
        myArray2.add(myString);
        String actual = myArray2.getAsString();
        Assert.assertEquals(myString, actual);
    }

    @Test
    public void jsonArrayGetAsDoubleReturn() {
        Double myDouble = 25d;
        myArray2.add(myDouble);
        Double actual = myArray2.getAsDouble();
        Assert.assertEquals(myDouble, actual);
    }

    @Test
    public void jsonArrayGetAsBigDecimalReturn() {
        BigDecimal bigDec = new BigDecimal(123);
        myArray2.add(bigDec);
        BigDecimal actual = myArray2.getAsBigDecimal();
        Assert.assertEquals(bigDec, actual);
    }

    @Test
    public void jsonArrayGetAsBigIntegerReturn() {
        BigInteger num = new BigInteger("25");
        myArray2.add(num);
        Number actual = myArray2.getAsBigInteger();
        Assert.assertEquals(num, actual);
    }

    @Test
    public void jsonArrayGetAsFloatReturn() {
        Float f = 2.5f;
        myArray2.add(f);
        Float actual = myArray2.getAsFloat();
        Assert.assertEquals(f, actual);
    }

    @Test
    public void jsonArrayGetAsLongReturn() {
        long num = 52L;
        myArray2.add(num);
        long actual = myArray2.getAsLong();
        Assert.assertEquals(num, actual);
    }

    @Test
    public void jsonArrayGetAsIntReturn() {
        int num = 52;
        myArray2.add(num);
        Number actual = myArray2.getAsInt();
        Assert.assertEquals(num, actual);
    }


    @Test
    public void jsonArrayGetAsByteReturn() {
        Byte b = (byte) 55;
        myArray2.add(b);
        Byte actual = myArray2.getAsByte();
        Assert.assertEquals(b, actual);
    }


    @Test
    public void jsonArrayGetAsCharacterReturn() {
        char c = 'd';
        myArray2.add(c);
        char actual = myArray2.getAsCharacter();
        Assert.assertEquals(c, actual);
    }

    @Test
    public void jsonArrayGetAsShortReturn() {
        short num = 52;
        myArray2.add(num);
        short actual = myArray2.getAsShort();
        Assert.assertEquals(num, actual);
    }

    @Test
    public void jsonArrayGetAsBooleanReturn() {
        boolean myBool = true;
        myArray2.add(myBool);
        boolean actual = myArray2.getAsBoolean();
        Assert.assertEquals(myBool, actual);
    }
}
