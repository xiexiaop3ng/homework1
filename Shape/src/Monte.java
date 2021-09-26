public abstract class Monte extends Shape {
    private double x,y;
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
    public Monte(double x,double y){
        this.x=x;
        this.y=y;
    }
    int n=100000;
    int count=0;
    for(int i=1;i<n;i++)
    {
        if ((x * x + y * y) < 1) {
            count++;
        }
    }
    public double getArea(){
        return (double)4*count/n;
    }
}
