package io.zipcoder.interfaces;

import sun.jvm.hotspot.oops.Instance;

public final class Students extends People<Student> {
     private static final Students INSTANCE = new Students();
     private Students() {
        super.add(new Student(Long.MAX_VALUE,"Alfred" ));
        super.add(new Student(Long.MAX_VALUE -1,"Gretchen"));
        super.add(new Student(Long.MAX_VALUE -2,"Gertrude"));
     }
     public static Students getInstance() {
         return INSTANCE;
     }

     public Student[] toArray() {
         return new Student[0];
     }

 }
