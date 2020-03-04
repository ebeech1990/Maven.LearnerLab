package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    @Test
    public void testImplementation(){
        Teacher instructor = (Teacher) (Object)new Instructor("james");

        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance(){
        Person instructor = (Person) (Object)new Student("bill");

        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach(){
        Student student = new Student("bill");
        Instructor instructor = new Instructor("james");
        instructor.teach(student,4.0);
        Double actual = student.getTotalStudyTime();
        Double expected = 4.0;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testLecture(){
        Student bill = new Student("bill");
        Student bob = new Student("bob");
        Learner[] learners = new Learner[]{bill,bob};

        Instructor instructor = new Instructor("james");
        instructor.lecture(learners,6.0);
        Double actualBill = bill.getTotalStudyTime();
        Double expectedBill = 3.0;
        Assert.assertEquals(expectedBill, actualBill);

    }
}
