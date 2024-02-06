package n_15.n_2;

public class Main {
    public static void main(String[] args) {
        System.err.println(createPath("c:\\javadev", "readme.txt"));
        System.err.println(createPath("c:\\javadev\\", "readme.txt"));
    }

    static String createPath(String dir, String file) {
        if (!dir.endsWith("\\")) {
            dir += "\\";
        }
        return dir + file;
    }
}
