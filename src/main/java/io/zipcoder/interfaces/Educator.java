package io.zipcoder.interfaces;

public enum Educator implements Teacher {
    FROILAN(Long.MAX_VALUE,"Froilan"),ROBERTO(Long.MAX_VALUE-1,"Roberto"),CHRIS(Long.MAX_VALUE-2,"Chris");



    private Long id;
    private String name;
    private Double timeWorked;

    Educator(Long id, String name){
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getHoursWorked() {
        return timeWorked;
    }


    public void teach(Learner learner, double numbeOfHours) {
        Instructors.getInstance().findById(id).teach(learner,numbeOfHours);
        this.timeWorked = numbeOfHours;
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        Instructors.getInstance().findById(id).lecture(learners, numberOfHours);
        this.timeWorked = numberOfHours;
    }
}
