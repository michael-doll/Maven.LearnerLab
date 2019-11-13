package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;

import static org.junit.Assert.*;

public class StudentsTest {
    @Test
    public void testGetInstance(){
        Students students = Students.getInstance();

        for (int i = 0; i <34 ; i++) {
           students.add(new Student(i,"student" + i));
        }
        Integer expected = 34;
        Integer actual = Students.getInstance().count();
        Assert.assertEquals(expected,actual);
    }

}