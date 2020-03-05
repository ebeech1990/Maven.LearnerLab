package io.zipcoder.interfaces;

public class Person {
    private  long id = 0;
    private String name = "";

    public Person(long id, String name){
        this.name = name;
        this.id = id;

    }

    public Person(){

    }

    public  void setId(long id) {
        this.id = id;
    }
    public long getId(){
        return id;
    }

    public  void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

}
