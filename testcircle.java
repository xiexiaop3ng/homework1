public class testcircle {
    public static void main(String arg[]){
        circle c1=new circle(20);
        double s=c1.getArea() ;
        System.out.println("c1的面积是："+s);
        circle c2=new circle();
        c2.setRadius(15);
        double perimeter=c2.getPerimeter() ;
        System.out.println("c2的周长是："+perimeter);
}
}