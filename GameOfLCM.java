import java.util.Scanner;
public class GameOfLCM{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int N= sc.nextInt();
        Solution obj = new Solution();
        System.out.println(obj.maxGcd(N));
    }
}
class Solution {
    long maxGcd(int N) {
        int i=N-2,f=0;
        long a= N*(N-1);
        long b=a;
        long c= N-1;
        while(f<2){
            a = lcm(a,i);
            f++;
            i--;
        }
        System.out.println(a);
        f=0;i=N-2;
        while(f<2 && i>0){
            if(gcd(b,i)==1){
                b= b*i;
                f++;
            }
            i--;
        }
        System.out.println(b);

        if(N%2==0){
            f=0;
            i=N-2;
            while(f<3 && i>0){
                if(gcd(c,i)==1){
                    c =c*i;
                    f++;
                }
                i--;
            }
        }
        System.out.println(c);

        if(a>=b && a>c)
          return a;
        else if(c>=a && c>=b)
          return c;
        return b;
    }

    static long lcm(long x,long y){
        long r= (x*y)/gcd(x,y);
        return r;
    }
    static long gcd(long a, long b)
    {
      if (b == 0)
        return a;
      return gcd(b, a % b);
    }
}