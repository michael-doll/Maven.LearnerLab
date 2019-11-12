package io.zipcoder.interfaces;

public class Student extends Person implements  Learner {
    private Double totalStudyTime = 0.;

    public Student(long id, String name) {
        super(id, name);
    }

    public void learn(double numberOfHours) {
        for (int i = 0; i < numberOfHours ; i++) {
            totalStudyTime++;
        }
    }

    public Double getTotalStudyTime() {
        return totalStudyTime;
    }
}
