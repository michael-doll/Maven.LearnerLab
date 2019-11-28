package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ZipCodeWilmington {
    //Create a ZipCodeWilmington singleton
    //The class should declare a field that references the instance of Students called students
    //The class should declare a field that references the instance of Instructors called instructors
    //The class should define a method hostLecture which makes use of a Teacher teacher, double numberOfHours parameter to host a lecture to the composite personList field in the students reference.
    //The class should define a method hostLecture which makes use of a long id, double numberOfHours parameter to identify a respective Instructor to host a lecture to the composite personList field in the cohort reference
    //The class should define a method getStudyMap which returns a new instance of a mapping from Student objects to Double objects, representative of each respective student's totalStudyTime

   private static Students students;
   private static Instructors instructors;

   //
    public ZipCodeWilmington(){
        students = Students.getInstance();
        instructors = Instructors.getInstance();
    }
    public void hostLecture(Teacher teacher, double numberOfHours){
        teacher.lecture(students.toArray(), numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours){
        Teacher teacher = Instructors.getInstance().findById(id);
        hostLecture(teacher,numberOfHours);
    }

    public Map<Student, Double> getStudyMap() {
        Map<Student, Double> studyMap = new HashMap<Student, Double>();
        for (int i = 0; i < students.count(); i++) {
            Student current =  students.findById(Long.MAX_VALUE -i);
            studyMap.put(current, current.getTotalStudyTime());
        }
        return studyMap;
    }
}
