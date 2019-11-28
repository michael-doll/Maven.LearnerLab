package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class TestZipCodeWilmington {
    @Test
    public void testHostLecture(){
    ZipCodeWilmington zcw = new ZipCodeWilmington();
    zcw.hostLecture(Long.MAX_VALUE,20);

        Map<Student,Double> map = zcw.getStudyMap();

        for(Student student : map.keySet()){
            Assert.assertEquals(5,student.getTotalStudyTime(),.01);
        }
    }

}
