package src;

 class ShapeTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        double CArea = circle.calculateArea(3.5);
        System.out.println(CArea);
        double cPerimiter = circle.calculatePerimiter(4.5);
        System.out.println(cPerimiter);

        Square square = new Square();
        double sArea = square.calculateArea(3);
        System.out.println(sArea);

        square.calculatePerimiter(2);
        double sPerimiter = square.calculatePerimiter(5);
        System.out.println(sPerimiter);
    }
}