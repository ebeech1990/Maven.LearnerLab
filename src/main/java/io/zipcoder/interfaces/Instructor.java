package io.zipcoder.interfaces;

public class Instructor extends Person implements Teacher {


    public Instructor(String name) {
        super(name);
    }

    public void teach(Learner learner, Double numberOfHours) {
        learner.learn(numberOfHours);
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        double numberOfHoursPerLearner = numberOfHours / learners.length;
        for(int i = 0; i < learners.length-1; i++) {
            learners[i].learn(numberOfHoursPerLearner);
        }
    }
}
