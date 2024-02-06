package n_17.ex;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("/root/data.txt", true);
            fw.write("Hello");
            fw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
