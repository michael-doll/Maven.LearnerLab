package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class TestZipCodeWilmington {
    @Test
    public void testHostLecture(){
        ZipCodeWilmington zcw = new ZipCodeWilmington();
        Double lectureHours = 10d;
        Students students = Students.getInstance();
        Instructor instructor = new Instructor(Long.MIN_VALUE,"Archie");

//        for (int i = 0; i <3 ; i++) {
//            students.add(new Student((long)i,"student" + i));
//        }

        zcw.hostLecture(instructor, lectureHours);
        Map actualMap = zcw.getStudyMap();

        for (int i = 0; i <actualMap.size() ; i++) {
            System.out.println(actualMap.get(i));
        }
        Assert.assertEquals(actualMap.get(0),);
    }
//    @Test
//    public void tesHostLecture(){
//        ZipCodeWilmington zcw = new ZipCodeWilmington();
//        Double lectureHours = 10d;
//        Students students = Students.getInstance();
//        Instructor instructor = new Instructor(Long.MIN_VALUE,"Archie");
//
//        zcw.hostLecture(Long.MIN_VALUE, 10);
//        Map actualMap = zcw.getStudyMap();
//
//        for (int i = 0; i <actualMap.size() ; i++) {
//            System.out.println(actualMap.get(i));
//        }
//    }
}
