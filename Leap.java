import java.io.*;
import java.util.*;

public class Leap {
    static Boolean canWin(int leap,int[] game,int pos,int flag){
        try{
        if(game[0]!= 0)
            return false;
         if(leap == 0)
            return false;
        Boolean check=false;
        int n = game.length;
        if(pos==n-1 || pos+leap >n-1)
           return true;
        else if(game[pos+leap]==0 && leap!=1)
           check = canWin(leap,game,pos+leap,1);
        else if(game[pos+1]==0 && flag !=2)
           check = canWin(leap,game,pos+1,0);
        else if(pos != 0 && game[pos-1]==0 && (flag==1||flag ==2))
           check =canWin(leap,game,pos-1,2);
        else
           return false;
        //System.out.println(check);
        return check;
        }
        catch(Throwable e){
            System.out.println("MEOWDEDVNDCV");
            System.out.println(leap);
            for(int i=0;i<game.length;i++)
               System.out.println(game[i]);
               return false;
        }
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc =new Scanner(System.in);
        int q = sc.nextInt();
        while(q-->0){
            int n = sc.nextInt();
            int leap = sc.nextInt();
            int []game = new int[n];
            for(int i=0;i<n;i++){
                game[i]= sc.nextInt();
            }
            System.out.println(canWin(leap,game,0,0)?"YES":"NO");
        }
    }
}
