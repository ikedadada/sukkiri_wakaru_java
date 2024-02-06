public class Main {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        int[] counts = null;
        float[] heights = { 171.3F, 175.0F };
        System.out.printf("%d%n", counts[1]); // NullPointerException
        System.out.printf("%d%n", heights[2]); // ArrayIndexOutOfBoundsException
    }
}
