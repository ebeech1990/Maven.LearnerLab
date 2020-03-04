package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void testImplementation(){
        Learner student = (Learner) (Object)new Student("bill");

        Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void testInheritance(){
        Person student = (Person) (Object)new Student("bill");

        Assert.assertTrue(student instanceof Person);
    }

    @Test
    public void testLearn(){
        Student student = new Student("bill");
        Double beforeStudy = student.getTotalStudyTime();
        student.learn(5.0);
        Double afterStudy = student.getTotalStudyTime();
        Double expected = 5.0;

        Assert.assertEquals(expected,afterStudy);
    }
}
