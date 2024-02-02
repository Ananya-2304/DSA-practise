import java.io.*;
import java.util.*;

public class Lists {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        List<Integer> list = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
            list.add(sc.nextInt());
        int t= sc.nextInt();
        while(t-->0){
            String op = sc.next();
            if(op.equals("Insert")){
                int index = sc.nextInt();
                int ele =sc.nextInt();
                list.add(index,ele);
            }
            else{
                int index= sc.nextInt();
                list.remove(index);
            }
        }
        for(int i=0;i<list.size();i++)
            System.out.print(list.get(i)+" ");
    }
}