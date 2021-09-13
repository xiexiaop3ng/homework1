import java.util.Scanner;

public class rectangle {
    double x,y;
    public double getX(){
        return x;
    }
    public void setX(double x){
        this.x=x;
    }
    public double getY(){
        return y;
    }
    public void setY(double y){
        this.y=y;
    }
    public double getArea(){ return x*y;}
    public double getPerimeter(){ return  2*(x+y);}
    public rectangle(double x,double y){
        this.x=x;
        this.y=y; }
        public rectangle(){
        this.x=2;
        this.y=1; }
        public static void main(String args[]){
            Scanner a=new Scanner(System.in);
            double x=a.nextDouble();
            double y=a.nextDouble();
            a.close();
            rectangle r1=new rectangle(x,y);
            System.out.println("r1的面积是："+r1.getArea());
            System.out.println("r1的周长是："+r1.getPerimeter());
        }
}
