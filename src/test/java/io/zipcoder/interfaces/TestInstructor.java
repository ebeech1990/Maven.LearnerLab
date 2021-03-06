package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    @Test
    public void testImplementation(){
        Teacher instructor = new Instructor(0,"james");

        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance(){
        Person instructor = new Student(1,"bill");

        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach(){
        Student student = new Student(1,"bill");
        Instructor instructor = new Instructor(0,"james");
        instructor.teach(student,4.0);
        Double actual = student.getTotalStudyTime();
        Double expected = 4.0;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testLecture(){
        Student bill = new Student(1,"bill");
        Student bob = new Student(2,"bob");
        Learner[] learners = new Learner[]{bill,bob};

        Instructor instructor = new Instructor(0,"james");
        instructor.lecture(learners,6.0);
        Double actualBill = bill.getTotalStudyTime();
        Double expectedBill = 3.0;
        Assert.assertEquals(expectedBill, actualBill);

    }
}
