package com.company.task_001;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created on 17.12.2019 18:40.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
public class BaseStart {

    public static void main(String[] args)
            throws InvocationTargetException, IllegalAccessException {
        Base base = new Base();
        Class<?> cls = base.getClass();

        Method[] methods = cls.getDeclaredMethods();
        for (Method m : methods) {
            if (m.isAnnotationPresent(BaseAction.class)) {
                BaseAction action = m.getAnnotation(BaseAction.class);
                int res = (Integer) m.invoke(base, action.a(), action.b());
                System.out.printf("Result: %s\n\r", res);
            }
        }
    }
}
