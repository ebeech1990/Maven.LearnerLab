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
        Student bill = new Student(0,"bill");
        bill.setId(4);
        bill.learn(2.0);
        cohort.add(bill);
        Student bob = new Student(1,"bob");
        bob.setId(5);
        bob.learn(2.0);
        cohort.add(bob);

        Educator leslie = Educator.LESLIE;

//        Educator ron = Educator.RON;
//        all = ZipCodeWilmington.getInstance();
//        all.hostLecture(ron,4.0);
//        Double expected = 4.0;
//        Double actual = bill.getTotalStudyTime();
//        Assert.assertEquals(expected, actual);
    }
}
