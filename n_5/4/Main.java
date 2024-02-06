public class Main {
    static double calcTriangleArea(double bottom, double height) {
        double area = bottom * height / 2;
        return area;
    }

    static double calcCircleArea(double radius) {
        double area = radius * radius * 3.14;
        return area;
    }

    public static void main(String[] args) {
        double triangleArea = calcTriangleArea(10.0, 5.0);
        double circleArea = calcCircleArea(5.0);
        System.out.printf("三角形の面積: %.1f平方cm\n", triangleArea);
        System.out.printf("円の面積: %.1f平方cm\n", circleArea);
    }
}
