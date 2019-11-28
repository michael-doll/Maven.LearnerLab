package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.awt.image.Kernel;

import static org.junit.Assert.*;

public class EducatorTest {

@Test
public void testImplementation(){
    Assert.assertTrue(Educator.ROBERTO instanceof Teacher);
    Assert.assertTrue(Educator.CHRIS instanceof Teacher);
    Assert.assertTrue(Educator.FROILAN instanceof Teacher);
}

@Test
    public void testTeach(){
    Student student = new Student(1L,"Bilbo");
    Educator.ROBERTO.teach(student,10);
    Assert.assertEquals(10, Educator.ROBERTO.getHoursWorked(),.01);
}

@Test
    public void testLecture(){
    Student student = new Student(1L,"Bilbo");
    Student student2 = new Student(2L, "Frodo");
    Student[] students = {student,student2};
    Educator.ROBERTO.lecture(students,10);
    Assert.assertEquals(10, Educator.ROBERTO.getHoursWorked(),.01);
}
}