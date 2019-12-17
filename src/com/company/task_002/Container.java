package com.company.task_002;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created on 17.12.2019 21:45.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
@SaveTo(path = "c:\\Temp\\1.txt")
public class Container {

    String s = "Hello world!";

    @Saver
    public void save(String path) throws IOException {
        FileWriter w = new FileWriter(path);

        try {
            w.write(s);
        } finally {
            w.close();
        }
    }
}
