package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class People<E extends Person> implements Iterable<E> {
    private List<E> personList = new ArrayList<E>();



    public void add(E p) {
        personList.add(p);
    }

    public E findById(long id){
        for(E p : personList) {
            if(p.getId() == id){
                return p;
            }
        }
       return null;
    }

    public Boolean contains(E person) {
        if(personList.contains(person)) {
            return true;
        }
        return false;
    }

    public void remove(E p){
        if(contains(p)){
            personList.remove(p);
        }
    }

    public void remove(long id){
        for(E p : personList) {
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

    public abstract E[] toArray();


    public Iterator iterator() {
        return null;
    }
}
