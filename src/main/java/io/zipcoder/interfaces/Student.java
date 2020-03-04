package io.zipcoder.interfaces;

public class Student extends Person implements Learner {

    private Double totalStudyTime;



public Student(String name) {
    super(name);
    totalStudyTime = 0.0;
}

    public void learn(Double numberOfHours) {

        totalStudyTime+=numberOfHours;
    }

    public Double getTotalStudyTime() {
        return totalStudyTime;
    }
}
