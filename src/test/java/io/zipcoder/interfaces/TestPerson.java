package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructor(){
        Person p = new Person("Emma");

        String actualName = p.getName();
        long actualId = p.getId();

        String expectedName = "Emma";
        long expectedId = 0;

        Assert.assertEquals(expectedName,actualName);
        Assert.assertEquals(expectedId,actualId);
    }

    @Test
    public void testSetName(){
        Person p = new Person();
        p.setName("Emma");

        String expectedName = "Emma";
        String actualName = p.getName();

        Assert.assertEquals(expectedName,actualName);
    }

}
