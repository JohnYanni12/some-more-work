package src.Syntax;

public class AreaCalculate {
    /*Create 1 class in which create a methods that will calculate the
    area (volume in case of box) of
Rectangle, Square Box
     */
int w;
int h;
int l;

    public int Square(int w, int l){
        this.w = w;
        this.l = l;
        int Sarea = w * l;
        return Sarea;
    }
    int Square (int w,int h, int l){
        this.h= h;

       int area = h*w*l;
       return area;
    }
    public static void main(String[] args) {
        AreaCalculate obj = new AreaCalculate();
        System.out.println(obj.Square(4, 9));
        System.out.println(obj.Square(3,10, 11));

    }

}
