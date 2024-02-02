import java.util.Scanner;

public class Fibonacci{
    static long cache[];
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Fibonacci obj = new Fibonacci();
        System.out.println("Enter the no");
        int n = sc.nextInt();
        cache = new long[n+1];
        for(int i=0;i<n;i++){
            System.out.print(obj.fibonacci(i)+" ");
        }
    }
    long fibonacci(int n){
        if(n<=1)
           return n;
        if(cache[n] != 0){
            return cache[n];
        }
        cache[n]= (fibonacci(n-1)+fibonacci(n-2));
        return (fibonacci(n-1)+fibonacci(n-2));
    }
}