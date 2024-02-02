import java.io.*;
import java.util.*;

public class Queries {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        ArrayList<ArrayList<Integer>> outerlist = new ArrayList<>();
        for(int i=0;i<n;i++){
            ArrayList<Integer> innerlist = new ArrayList<Integer>();
            int size = sc.nextInt();
            for(int j=size;j>0;j--){
                innerlist.add(sc.nextInt());
            }
            outerlist.add(innerlist);
        }
        int q = sc.nextInt();
        while(q-->0){
            try{
                int row=sc.nextInt();
                int col = sc.nextInt();
                System.out.println(outerlist.get(--row).get(--col));
            }
            catch(Exception e){
                System.out.println("ERROR!");
            }
        }
    }
}
