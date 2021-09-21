public class Worker {
    private String name;
    private double wage;
    public String getName(){return name;}
    public void setName(String name){this.name=name;}
    public double getWage(){return wage;}
    public void setWaged(){this.wage=wage;}
    public Worker(String name,double wage){
        this.name=name;
        this.wage=wage;
    }
    public void increase(){this.wage=this.wage+100;}
    public void print(){System.out.println(name+"wage:"+wage);}
}
class Manager extends Worker {
    private double allownace;
    private double wage;
    public double getAllowance(){return allownace;}
    public void setAllownace(double id){this.allownace=allownace;}
    public double getWage(){return wage;}
    public void setWage(double wage){this.wage=wage;}
    public Manager(String name, double wage, double allownace) {
        super(name, wage);
        this.allownace = allownace;
    }

    public void increase(){
        this.wage=this.wage+300;
        this.allownace=this.allownace+200;
    }
    public void print(){
        System.out.println(getName()+"wage:"+wage);
        System.out.println(getName()+"super wage"+super.getWage());
        System.out.println(getName()+"allowance:"+allownace);
    }
    public static void main(String args[]){
        Worker w1=new Worker("张三",2000);
        w1.increase();
        w1.print();
        Manager w2=new Manager("李四",2000,500);
        w2.increase();
        w2.print();
        Worker w3=new Manager("王五",2000,500);
        w3.increase();//运行的是子类的increase
        w3.print();
        System.out.println("w3.wage="+w3.getWage());
    }
}
