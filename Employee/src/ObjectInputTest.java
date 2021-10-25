import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.*;

public class ObjectInputTest {
    public static void main(String[] args) throws Exception{
        ObjectInputTest test=new ObjectInputTest();
        System.out.println(((Employee) test.ReadObj()).getName());
    }
    public Object ReadObj() throws Exception{
        FileInputStream fi=null;
        ObjectInputStream ois=null;
        Object obj=null;
        fi=new FileInputStream("D\\obj.ini");
        ois=new ObjectInputStream(fi);
        obj=ois.readObject();
        ois.close();
        fi.close();
        return obj;
    }
}