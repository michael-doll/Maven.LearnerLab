package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class InstructorsTest {
    @Test public void tesGetInstance() {
        Instructors instructors = Instructors.getInstance();
        for (int i = 0; i <4 ; i++) {
        instructors.add(new Instructor(i,"Instructor" + i));
        }

        Integer expected = 4;
        Integer actual = Instructors.getInstance().count();

        Assert.assertEquals(expected,actual);
    }
//    @Test
//    public void InstructorTest(){
//        Integer expected = 4;
//        Integer actual = Instructors.getInstance().count();
//        Assert.assertEquals(expected, actual);
//    }


}