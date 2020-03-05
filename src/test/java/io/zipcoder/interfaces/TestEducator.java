package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestEducator {

    @Test
    public void testImplementation(){
        Educator leslie = Educator.LESLIE;

        Assert.assertTrue(leslie instanceof Teacher);
    }
    @Test
    public void testInheritance(){
        Person instructor = new Student(1,"bill");

        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach(){
        Student student = new Student(1,"bill");
        Educator april = Educator.APRIL;
        april.teach(student,4.0);
        Double actual = student.getTotalStudyTime();
        Double expected = 4.0;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testLecture(){
        Student bill = new Student(1,"bill");
        Student bob = new Student(2,"bob");
        Learner[] learners = new Learner[]{bill,bob};

        Educator ron = Educator.RON;
        ron.lecture(learners,6.0);
        Double actualBill = bill.getTotalStudyTime();
        Double expectedBill = 3.0;
        Assert.assertEquals(expectedBill, actualBill);

    }
}
