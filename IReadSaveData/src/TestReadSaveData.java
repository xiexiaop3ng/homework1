public class TestReadSaveData {
    public static void main(String arg[]){
        BusinessA businessA=new BusinessA(new ReadSaveTextFile());
        businessA.saveDate("保存到文本文件中");
        BusinessB businessB=new BusinessB(new ReadSaveWordFile());
        businessB.saveData("保存到word文件中");
    }
}
