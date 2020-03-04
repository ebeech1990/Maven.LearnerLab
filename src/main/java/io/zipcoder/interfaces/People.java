package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People implements Iterable<Person> {
    private List<Person> personList = new ArrayList<Person>();



    public void add(Person p) {
        personList.add(p);
    }

    public Person findById(long id){
        for(Person p : personList) {
            if(p.getId() == id){
                return p;
            }
        }
       return null;
    }

    public Boolean contains(Person person) {
        if(personList.contains(person)) {
            return true;
        }
        return false;
    }

    public void remove(Person p){
        if(contains(p)){
            personList.remove(p);
        }
    }

    public void remove(long id){
        for(Person p : personList) {
            if(p.getId() == id){
                remove(p);
            }
        }
    }

    public void removeAll(){
        personList.clear();
    }

    public Integer count(){
        return personList.size();
    }

    public Person[] toArray(){
        Person[] result = new Person[personList.size()-1];
        return personList.toArray(result);
    }


    public Iterator iterator() {
        return null;
    }
}
