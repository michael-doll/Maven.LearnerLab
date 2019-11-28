package io.zipcoder.interfaces;

import sun.jvm.hotspot.oops.Instance;

public final class Students extends People<Student> {
     private static final Students INSTANCE = new Students();
     private Students() {
        super.add(new Student(Long.MAX_VALUE,"Alfred" ));
        super.add(new Student(Long.MAX_VALUE -1,"Gretchen"));
        super.add(new Student(Long.MAX_VALUE -2,"Gertrude"));
         super.add(new Student(Long.MAX_VALUE -3,"Harold"));
     }
     public static Students getInstance() {
         return INSTANCE;
     }

     public Student[] toArray() {
         Student[] returnArray = new Student[getInstance().count()];
         int count = 0;
         for(Object student : INSTANCE){
             returnArray[count++] = (Student) student;
         }
         return returnArray;
     }

 }
