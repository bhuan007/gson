package com.google.gson.ProjectTest261P;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import org.junit.Test;
import org.junit.Assert;

import java.util.List;

public class TestableDesignTest {

    @Test
    public void testDoubleAdapterFalse() {
        Gson gson = new Gson();
        TypeAdapter<Number> type = gson.doubleAdapter(false);
        String expectedString = "1.25";
        String actualString = type.toJson(1.25);
        Assert.assertEquals(expectedString, actualString);
    }

    @Test
    public void testDoubleAdapterTrue() {
        Gson gson = new Gson();
        TypeAdapter<Number> type = gson.doubleAdapter(true);
        String expectedString = "1.25";
        String actualString = type.toJson(1.25);
        Assert.assertEquals(expectedString, actualString);
    }
}
