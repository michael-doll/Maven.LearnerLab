package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void testImplementation(){
        String name = "Archie";
        Long id = Long.MIN_VALUE;
        Student student = new Student(id, name);
        Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void testInheritance(){
        String name = "Archie";
        Long id = Long.MIN_VALUE;
        Student student = new Student(id, name);
        Assert.assertTrue(student instanceof Person);
    }

    @Test
    public void learn() {
        String name = "Archie";
        Long id = Long.MIN_VALUE;
        Double expected = 10.;
        Student student = new Student(id, name);

        student.learn(expected);
        Double actual = student.getTotalStudyTime();

        Assert.assertEquals(expected, actual);
    }
//
//    @Test
//    public void getTotalStudyTime() {
//    }
}