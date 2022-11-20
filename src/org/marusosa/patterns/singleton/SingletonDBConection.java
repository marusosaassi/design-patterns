package org.marusosa.patterns.singleton;

public class SingletonDBConection {
    // RULE #1: PRIVATE CONSTRUCTOR
    private SingletonDBConection() {
        System.out.println("Connection to a db management system...");
    }

    // RULE #2: STATIC METHOD THAT RETURNS THE INSTANCE
    private static SingletonDBConection instance;
    // we will have one instance of the class that will be saved here

    // RULE #3: we need to obtain the instance with a public static method
    public static SingletonDBConection getInstance() {
        if(instance == null) {
            instance = new SingletonDBConection();
        }
        return instance;
    }

}
