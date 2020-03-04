package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudents {
Students cohort;
    @Test
    public void test(){
       cohort = Students.getInstance();
       cohort.add(new Student("bill"));
        cohort.add(new Student("bob"));
        int expected = 2;
        int actual = cohort.count();
        Assert.assertEquals(expected, actual);
    }
}
