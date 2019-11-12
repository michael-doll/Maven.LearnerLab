package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {
    @Test
    public void testConstructor(){
        String expectedName = "Toby";
        Long expectedId = Long.MIN_VALUE;
        Person person = new Person(expectedId,expectedName);

        String actualName = person.getName();
        Long actualId = person.getId();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(actualId, actualId);
    }
    @Test
    public void testSetName(){
        String expectedName = "Toby";
        Long expectedId = Long.MIN_VALUE;
        Person person = new Person(expectedId, null);

        person.setName(expectedName);

        String actualName = person.getName();
        Long actualId = person.getId();
        Assert.assertEquals(expectedName, actualName);

    }

}
