package io.zipcoder.interfaces;

public final class Students extends People {
    private static  Students INSTANCE = new Students();

    private Students(){

    }

    public static Students getInstance(){

        return INSTANCE;
    }


}
