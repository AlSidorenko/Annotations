package com.company.task_001;

/**
 * Created on 17.12.2019 18:37.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */

public class Base {

    @BaseAction(a = 2, b = 3)
    public int sum(int a, int b) {
        return a + b;
    }
}
