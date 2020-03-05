package io.zipcoder.interfaces;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ZipCodeWilmington extends People {
    private static Students studentsInstance;
    private static Instructors instructorsInstance;
    private static ZipCodeWilmington zipCodeWilmingtonInstance;

    private ZipCodeWilmington(){

    }

    public static ZipCodeWilmington getInstance(){
        return zipCodeWilmingtonInstance;
    }


    public  void hostLecture(Teacher teacher, Double numberOfHours){

        teacher.lecture(studentsInstance.toArray(),numberOfHours);
    }

    public  void hostLecture(long id, Double numberOfHours){
        (instructorsInstance.findById(id)).lecture( studentsInstance.toArray(),numberOfHours);
    }

    public  Map<Student,Double> getStudyMap(){
        Map<Student,Double> newMap = new HashMap<Student, Double>();
        for(Iterator i = studentsInstance.iterator(); i.hasNext();){
             Student s = (Student)i.next();
             newMap.put(s,s.getTotalStudyTime());
        }
        return newMap;
    }

    public Person[] toArray() {
        return new Person[0];
    }
}
