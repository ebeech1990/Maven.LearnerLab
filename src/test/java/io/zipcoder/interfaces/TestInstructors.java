package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {
    Instructors staff;

    @Test
    public void test(){
        staff = Instructors.getInstance();
        staff.add(new Instructor(0,"james"));
        staff.add(new Instructor(1,"sam"));
        staff.add(new Instructor(2,"fred"));
        int expected = 3;
        int actual = staff.count();
        Assert.assertEquals(expected, actual);
    }
}
