package com.google.gson.ProjectTest261P;
import static org.mockito.Mockito.*;

import com.google.gson.Gson;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;
import org.mockito.Mockito.*;
import org.mockito.Spy;
import org.mockito.MockitoAnnotations;



public class MockTest {
    private StringPerson testPerson;
    private Gson gson;

    // String only object
    class StringPerson {
        private String first;
        private String last;

        StringPerson(String firstName, String lastName) {
            this.first = firstName;
            this.last = lastName;
        }

    }

    @Test
    public void gsonMockTest() {
        gson = Mockito.mock(Gson.class);
        testPerson = new StringPerson("Hello", "World");
        String actualJSON = gson.toJson(testPerson);
        MockitoAnnotations.initMocks(this);
        String expectedJSON = "{\"first\":\"hello\",\"last\":\"world\"}";

        verify(gson, times(1)).toJson(testPerson);

    }
}
