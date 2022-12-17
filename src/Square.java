package src;

 class Square implements Shape {

    double num;
    public double calculateArea(double num) {
        this.num = num;
        double squareArea = num * num;
        return squareArea;
    }

    int side;
    public double calculatePerimiter(int side) {
        this.side = side;
        double calculatePerimiter = 4 * side;
        return calculatePerimiter;
    }

 }
