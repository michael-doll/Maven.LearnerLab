package io.zipcoder.interfaces;

 public class Students extends People {
     private static final Students INSTANCE = new Students();
     private Students() {
//        INSTANCE.add(new Person(Long.MAX_VALUE,"Alfred" ));
//        INSTANCE.add(new Person(Long.MAX_VALUE -1,"Gretchen"));
//        INSTANCE.add(new Person(Long.MAX_VALUE -2,"Gertrude"));
     }
     public static Students getInstance() {
         return INSTANCE;
     }

}
