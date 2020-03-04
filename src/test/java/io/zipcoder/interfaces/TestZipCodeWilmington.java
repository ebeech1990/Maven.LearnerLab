package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestZipCodeWilmington {
    Students cohort;
    Instructors staff;
    ZipCodeWilmington all;

    @Test
    public void testHostLecture(){
        cohort = Students.getInstance();
        Student bill = new Student("bill");
        bill.setId(4);
        bill.learn(2.0);
        cohort.add(bill);
        Student bob = new Student("bob");
        bob.setId(5);
        bob.learn(2.0);
        cohort.add(bob);
        staff = Instructors.getInstance();
        Instructor james = new Instructor("james");
        james.setId(2);
        staff.add(james);
        Instructor sam = new Instructor("sam");
        sam.setId(3);
        staff.add(sam);
        all = ZipCodeWilmington.getInstance();
        all.hostLecture(sam,4.0);
//        all.getStudyMap();
//        System.out.println(all.getStudyMap());
//        int expected = 3;
//        int actual = staff.count();
//        Assert.assertEquals(expected, actual);
    }
}
