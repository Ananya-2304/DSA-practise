import java.util.HashMap;
public class HashMaps{
    public static void main(String[] args){
        HashMap<String,String> stID = new HashMap<>();
        stID.put("Ananya", "1JS21CS025 ");
        stID.put("Abhishek", "1JS21CS007");
        System.out.println(stID);
        stID.put("Ashwini","1JS21CS030");
        System.out.println(stID);
        stID.replace("Ashwini","1JS21CS098");
        stID.remove("Abhishek");
        System.out.println(stID);

    }
}