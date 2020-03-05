package io.zipcoder.interfaces;

public final class Students extends People<Student> {
    private static  Students INSTANCE = new Students();

    private Students(){

    }

    public static Students getInstance(){

        return INSTANCE;
    }


    public Student[] toArray() {
        Student[] students = Students.getInstance().toArray();
        return students;
    }
}
