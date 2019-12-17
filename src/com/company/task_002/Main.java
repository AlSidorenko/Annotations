package com.company.task_002;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created on 17.12.2019 21:59.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
public class Main {

    public static void main(String[] args)
            throws InvocationTargetException, IllegalAccessException {

        Container c = new Container();
        Class<?> cls = c.getClass();

        if (!cls.isAnnotationPresent(SaveTo.class)) {
            System.out.println("Error!");
            return;
        }

        SaveTo saveTo = cls.getAnnotation(SaveTo.class);
        String path = saveTo.path();

        Method[] methods = cls.getDeclaredMethods();
        for (Method m : methods) {
            if (m.isAnnotationPresent(Saver.class)) {
                m.invoke(c, path);
                break;
            }
        }
        System.out.println("Done!");
    }
}
