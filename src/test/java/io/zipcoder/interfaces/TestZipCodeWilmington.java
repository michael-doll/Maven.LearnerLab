package io.zipcoder.interfaces;

import org.junit.Test;

import java.util.Map;

public class TestZipCodeWilmington {
    @Test
    public void testHostLecture(){
        ZipCodeWilmington zcw = new ZipCodeWilmington();
        Double lectureHours = 10d;
        Students students = Students.getInstance();
        Instructor instructor = new Instructor(Long.MIN_VALUE,"Archie");

        for (int i = 0; i <34 ; i++) {
            students.add(new Student(i,"student" + i));
        }
        zcw.hostLecture(instructor, lectureHours);
        Map actualMap = zcw.getStudyMap();

        for (int i = 0; i <actualMap.size() ; i++) {
            System.out.println(actualMap.get(i));

        }
    }
}
