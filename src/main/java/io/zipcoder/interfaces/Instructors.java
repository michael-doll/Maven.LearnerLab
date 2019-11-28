package io.zipcoder.interfaces;

public final class Instructors extends People<Instructor> {
    private static final Instructors INSTANCE = new Instructors();
    private Instructors() {
        super.add(new Instructor(Long.MAX_VALUE,"F" ));
        super.add(new Instructor(Long.MAX_VALUE -1,"R"));
        super.add(new Instructor(Long.MAX_VALUE -2,"C"));
    }
    public static Instructors getInstance() {
        return INSTANCE;
    }

    public Instructor[] toArray() {
        Instructor[] returnArray = new Instructor[getInstance().count()];
        int count = 0;
        for(Object instructor : INSTANCE){
            returnArray[count++] = (Instructor) instructor;
        }
        return new Instructor[0];
    }
}
