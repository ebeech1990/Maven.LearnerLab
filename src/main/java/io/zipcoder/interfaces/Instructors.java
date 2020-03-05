package io.zipcoder.interfaces;

public class Instructors extends People<Instructor> {
    private static  Instructors INSTANCE = new Instructors();

    private Instructors(){

    }

    public static Instructors getInstance(){

        return INSTANCE;
    }

    public Instructor[] toArray() {
        return new Instructor[0];
    }
}
