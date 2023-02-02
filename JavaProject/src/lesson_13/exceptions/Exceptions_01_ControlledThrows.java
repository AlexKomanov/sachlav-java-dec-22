package lesson_13.exceptions;

import java.io.File;
import java.io.FileReader;

public class Exceptions_01_ControlledThrows {

    public static void main(String[] args) throws Exception {

        File ourFile = new File("D://file.txt");
        FileReader reader = new FileReader(ourFile);
        reader.close();

    }
}
