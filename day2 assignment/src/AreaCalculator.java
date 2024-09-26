public class AreaCalculator {
    public double calculateArea(double side){
        return side*side;
    }
    public double calculateArea(double length, double width){
        return length*width;
    }
    public double calculateArea(double radius, boolean isCircle) {
        return Math.PI * Math.pow(radius, 2);
    }
    public static void main(String[] args) {
        AreaCalculator calc = new AreaCalculator();
        double squareArea = calc.calculateArea(5);
        System.out.println(squareArea);
        double rectangleArea = calc.calculateArea(4.0,8.0);
        System.out.println(rectangleArea);
        double circleArea = calc.calculateArea(5.0,true);
        System.out.println(circleArea);

    }
}