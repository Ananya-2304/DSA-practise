import java.util.Scanner;
public class TowerOfHanoi{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solution obj = new Solution();
        long m=obj.towerOfHanoi(n,'A','C','B');
        System.out.println(m);
    }
}
class Solution{
    static long m=0;
    public long towerOfHanoi(int n,char from_rod,char to_rod,char aux_rod){
        if(n==0)
           return m;
        m=towerOfHanoi(n-1,from_rod,aux_rod,to_rod);
        System.out.println("Move disc "+n+" from "+from_rod+" to "+to_rod);
        m++;
        m=towerOfHanoi(n-1,aux_rod,to_rod,from_rod);
        return m;
    }
}