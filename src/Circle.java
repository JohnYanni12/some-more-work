package src;

 class Circle implements Shape {
   public double calculateArea(double radius) {
       double circleArea = radius * radius * Math.PI;
       return circleArea;
   }
    public double calculatePerimiter(double r) {
        double circlePerimiter = 2 * r * Math.PI;
        return circlePerimiter;
    }
}