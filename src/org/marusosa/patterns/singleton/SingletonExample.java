package org.marusosa.patterns.singleton;

public class SingletonExample {
    public static void main(String[] args) {
        SingletonDBConection con = null;
        for(int i = 0; i<10; i++){
            //SingletonDBConection con = SingletonDBConection.getInstance();
            con = SingletonDBConection.getInstance();
            System.out.println("con = " + con);
            /* the constructor is called once and only one instance is created
            * (only one reference),
            * and NOT creates one for each getInstance(). It centralizes
            * the creation of the object.
            * It prints the same instance, same reference */
        }
        SingletonDBConection con2 = SingletonDBConection.getInstance();
        SingletonDBConection con3 = SingletonDBConection.getInstance();

        boolean b1 = ((con == con2) && (con2 == con3) && (con == con3));
        System.out.println("b1 = " + b1);
    }
}
