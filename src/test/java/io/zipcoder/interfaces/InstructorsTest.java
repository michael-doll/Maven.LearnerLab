package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class InstructorsTest {
    @Test
    public void testGetInstance() {
        Instructors instructors = Instructors.getInstance();

        Integer expected = 3;
        Integer actual = instructors.count();

        Assert.assertEquals(expected,actual);
    }
}