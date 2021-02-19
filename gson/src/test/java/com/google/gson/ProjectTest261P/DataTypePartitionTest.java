package com.google.gson.ProjectTest261P;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;


public class DataTypePartitionTest {
    // Char only object
    class CharPerson {
        private char first;
        private char last;

        CharPerson(char first, char last) {
            this.first = first;
            this.last = last;
        }
    }

    // String only object
    class StringPerson {

        private String first;
        private String last;

        StringPerson(String firstName, String lastName) {
            this.first = firstName;
            this.last = lastName;
        }

    }

    // Double only object
    class DoublePerson {
        private double first;
        private double last;

        DoublePerson(double first, double last) {
            this.first = first;
            this.last = last;
        }
    }

    // Boolean only object
    class BooleanPerson {
        private boolean first;
        private boolean last;

        BooleanPerson(boolean first, boolean last) {
            this.first = first;
            this.last = last;
        }
    }


    // Long only object
    class LongPerson {
        private long first;
        private long last;

        LongPerson(long first, long last) {
            this.first = first;
            this.last = last;
        }
    }


    // float only object
    class FloatPerson {
        private float first;
        private float last;

        FloatPerson(float first, float last) {
            this.first = first;
            this.last = last;
        }
    }

    // Array only object
    class ArrayPerson {
        private int[] first;
        private int[] last;

        ArrayPerson(int[] first, int[] last) {
            this.first = first;
            this.last = last;
        }
    }

    // Long only object
    class ListPerson {
        private List<Object> first;
        private List<Object> last;

        ListPerson(List first, List last) {
            this.first = first;
            this.last = last;
        }
    }

    // Mixed data object
    class MixedPerson {
        private String first;
        private int second;
        private boolean third;
        private List<Object> fourth;

        MixedPerson(String first, int second, boolean third, List<Object> fourth) {
            this.first = first;
            this.second = second;
            this.third = third;
            this.fourth = fourth;
        }
    }

    @Test
    public void testCharPerson() {
        CharPerson person = new CharPerson('a', 'z');
        String json = new Gson().toJson(person);
        String expectedJSON = "{\"first\":\"a\",\"last\":\"z\"}";
        Assert.assertEquals(expectedJSON, json);

    }

    @Test
    public void testStringPerson() {
        StringPerson person = new StringPerson("hello", "world");
        String json = new Gson().toJson(person);
        String expectedJSON = "{\"first\":\"hello\",\"last\":\"world\"}";
        Assert.assertEquals(expectedJSON, json);
    }


    @Test
    public void testDoublePerson() {
        // Maximum 18 digit input (including the ".")
        // Cut off Leading zeros
        DoublePerson person = new DoublePerson(1.00, 1.23456789123456789);
        String json = new Gson().toJson(person);
        String expectedJSON = "{\"first\":1.00,\"last\":1.23456789123456789}";
        Assert.assertEquals(expectedJSON, json);
    }

    @Test
    public void testBooleanPerson() {
        BooleanPerson person = new BooleanPerson(true, false);
        String json = new Gson().toJson(person);
        String expectedJSON = "{\"first\":true,\"last\":false}";
        Assert.assertEquals(expectedJSON, json);
    }

    @Test
    public void testLongPerson() {
        LongPerson person = new LongPerson(1L, 0L);
        String json = new Gson().toJson(person);
        String expectedJSON = "{\"first\":1,\"last\":0}";
        Assert.assertEquals(expectedJSON, json);
    }

    @Test
    public void testFloatPerson() {
        // Maximum 10 digit input (including the ".")
        // Cut off Leading zeros
        FloatPerson person = new FloatPerson(2.00f, 155448.256654f);
        String json = new Gson().toJson(person);
        String expectedJSON = "{\"first\":2.00,\"last\":155448.256654}";
        Assert.assertEquals(expectedJSON, json);
    }


    @Test
    public void testArrayPerson() {
        ArrayPerson person = new ArrayPerson(new int[]{1,2,3}, new int[]{});
        String json = new Gson().toJson(person);
        String expectedJSON = "{\"first\":[1,2,3],\"last\":[]}";
        Assert.assertEquals(expectedJSON, json);
    }


    public ArrayList<Object>list1=new ArrayList<Object>() {{
        add(1); add("b"); add(1L);
    }};

    public ArrayList<Object>list2=new ArrayList<Object>() {{
        add('a');  add(3.0); add(true);
    }};


    @Test
    public void testListPerson() {
        ListPerson person = new ListPerson(list1,list2);
        String json = new Gson().toJson(person);
        String expectedJSON = "{\"first\":[1,\"b\",1],\"last\":[\"a\",3.0,true]}";
        Assert.assertEquals(expectedJSON, json);
    }

    @Test
    public void testMixedPerson() {
        MixedPerson person = new MixedPerson("hello", 9000, false, list1);
        String json = new Gson().toJson(person);
        String expectedJSON = "{\"first\":\"hello\",\"second\":9000,\"third\":false,\"fourth\":[1,\"b\",1]}";
        Assert.assertEquals(expectedJSON, json);
    }
}
