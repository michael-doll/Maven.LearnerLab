package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class InstructorTest {
    @Test
    public void testImplementation(){
        String expectedName = "Toby";
        Long expectedId = Long.MIN_VALUE;
        Instructor instructor = new Instructor(expectedId,expectedName);
        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance(){
        String expectedName = "Toby";
        Long expectedId = Long.MIN_VALUE;
        Instructor instructor = new Instructor(expectedId,expectedName);
        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach() {
        String name = "Archie";
        Long id = Long.MIN_VALUE;
        Double expected = 10.;
        Instructor instructor = new Instructor(id,name);
        Student student = new Student(Long.MIN_VALUE, "Harry");

        instructor.teach(student,expected);
        Double actual = student.getTotalStudyTime();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testLecture() {
        String name = "Archie";
        Long id = Long.MIN_VALUE;
        Double lectureHours = 10.;
        Double expected = 5.;
        Instructor instructor = new Instructor(id,name);
        Student[] students = new Student[2];
       students[0] = new Student(Long.MIN_VALUE,"Toby");
       students[1] = new Student(Long.MAX_VALUE,"Ernie");

        instructor.lecture(students,lectureHours);
        Double studyTime1 = students[0].getTotalStudyTime();

        Assert.assertEquals(studyTime1, expected);
        Assert.assertEquals(studyTime1, expected);


    }
}