import java.io.*;
public class Nptel {
    public static void main(String[] args){
        try{
            PrintWriter writer = new PrintWriter(System.out);
            writer.write(64+'2');
            writer.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
