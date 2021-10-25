import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.List;

public class Filetest {
    public static List<File> searchFiles(File folder,final String keyword){
        List<File> result=new ArrayList<File>();
        if(folder.isFile())
            result.add(folder);
        File[] subFolders=folder.listFiles(new FileFilter(){
            @Override
            public boolean accept(File file){
                if(file.isDirectory()){
                    return true;
                }
                if(file.getName().toLowerCase().contains(keyword)){
                    return true;
                }
                return false;
            }
        });
        if(subFolders!=null){
            for(File file : subFolders){
                if(file.isFile()){
                    result.add(file);
                }else {
                    result.addAll(searchFiles(file,keyword));
                }
            }
        }
        return result;
    }
    public static void main(String args[]){
        List<File> files=searchFiles(new File("C:\\Users"),"windows");
        System.out.println("共找到"+files.size()+"个文件");
        for(File  file : files){
            System.out.println(file.getAbsolutePath());
        }
    }
}
