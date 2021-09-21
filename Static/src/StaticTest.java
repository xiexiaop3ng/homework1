public class StaticTest {
    static {
        System.out.println("加载类时我就执行了，比main方法还早。");
    }
    public static void main(String args[]){
        System.out.println("main方法执行了。");
    }
}
//static代码块运行比main方法快。程序变量不加static前是实例变量，每个对象的变量可以不一样，但加之后
//所有的对象都一样。