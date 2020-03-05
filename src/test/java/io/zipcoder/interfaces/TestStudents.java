package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudents {
Students cohort;
    @Test
    public void test(){
       cohort = Students.getInstance();
       cohort.add(new Student(0,"bill"));
        cohort.add(new Student(1,"bob"));
        int expected = 2;
        int actual = cohort.count();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testToArray(){
        cohort = Students.getInstance();
        cohort.add(new Student(0,"bill"));
        cohort.add(new Student(1,"bob"));

        System.out.println(cohort.toArray());
    }
}
