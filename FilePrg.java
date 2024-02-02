import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class FilePrg {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        String fname = sc.next();
        File f1 = new File(fname);
        System.out.println(f1.getName());
        //System.out.println(f1.exists()?"Exists":"Doesnt exist");
        if(f1.exists())
          System.out.println("Exists");
        else{
            f1.createNewFile();
        }
        f1.setWritable(false);
        f1.setReadable(false);
        System.out.println(f1.canWrite()?"Writeable":"Not writeable");
        System.out.println(f1.canRead()?"Readable":"Not Read");
        String filename = f1.toString();
        int index = filename.lastIndexOf('.');
        if(index>0)
           System.out.println("File type:"+filename.substring(index+1));
        else
           System.out.println("File doiesnt have type");   
        System.out.println(f1.length());
    }
}
