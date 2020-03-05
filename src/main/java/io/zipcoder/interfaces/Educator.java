package io.zipcoder.interfaces;

public enum Educator implements Teacher {
   LESLIE(0, "leslie"),
    APRIL(1, "april"),
    RON(2, "ron")
    ;

   private final Instructor instructor;
   private Double timeWorked;

   Educator(long id, String name){
        this.instructor = new Instructor(id,name);
        this.timeWorked = 0.0;
        Instructors.getInstance().add(this.instructor);
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
