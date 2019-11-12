package io.zipcoder.interfaces;

public interface Teacher {
    void teach(Learner learner, double numbeOfHours);
    void lecture(Learner[] learners, double numberOfHours);
}
