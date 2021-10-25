import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImagCopy {
    public static void main(String[] args)throws IOException {
        File file=new File("F:\\lol.jpg");
        FileInputStream fin=new FileInputStream(file);
        FileOutputStream fo=new FileOutputStream(new File("F:\\s.jpq"));
        int num=0;
        if(!file.exists()){
            System.out.println("源文件不存在");
        }else{
            while((num=fin.read())!=-1){
                fo.write(num);
            }
            fo.flush();
            fin.close();
            fo.close();
        }
    }
}
