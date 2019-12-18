package com.company.task_003;

/**
 * Created on 18.12.2019 13:15.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
public class Main {

    public static void main(String[] args)
            throws IllegalAccessException, NoSuchFieldException, InstantiationException {

        Test t = new Test();
        t.setA(7);
        t.setB("Hello");

        String res = Serializer.serialize(t);
        System.out.println("Serialized: " + res);

        t = Serializer.deserialize(res, Test.class);
        System.out.println("Deserialized: " + t.getA() + ", " + t.getB() + ", " + t.getC());
    }
}
