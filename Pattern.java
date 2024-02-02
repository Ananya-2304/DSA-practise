import java.util.Scanner;
public class Pattern{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        //pattern1(n);
        //pattern2(n);
        //pattern3(n);
        //pattern4(n);
        //pattern5(n);
        pattern6(n);
    }
    public static void pattern1(int n){
        int i,j,s,cols;
        for(i=0;i<=2*n-1;i++)
        {
            cols= i>n? 2*n-i : i;
            for(s=1;s<=n-cols;s++)
                System.out.print(" ");
            for(j=1;j<=cols;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        
    }
}
    public static void pattern2(int n){
        int i,j,rows;
        for(i=1;i<=2*n-1;i++){
            rows=i>n?2*n-i:i ;
            for(j=1;j<=2*n;j++){
                if(j<=rows || 2*n-j <=rows-1)
                   System.out.print("*");
                else
                   System.out.print(" ");
            }
            System.out.print("\n");
        }
}
 
   public static void pattern3(int n){
    int i,j,s;
    for(i=1;i<=n;i++){
        for(s=1;s<=n-i;s++)
            System.out.print("   ");
        for(j=i;j>=1;j--){
             System.out.print(j+"  ");
        }
        for(j=2;j<=i;j++){
            System.out.print(j+"  ");
        }
        System.out.print("\n");
    }
    
   }
   public static void pattern4(int n){
    int i,j,s,cols;
    for(i=1;i<=2*n-1;i++){
        cols= i>n?2*n-i:i;
        for(s=1;s<=n-cols;s++)
            System.out.print("   ");
        for(j=cols;j>=1;j--){
             System.out.print(j+"  ");
        }
        for(j=2;j<=cols;j++){
            System.out.print(j+"  ");
        }
        System.out.print("\n");
    }
    
   }
    public static void pattern5(int n){
    int i,j,s;
    for(i=0;i<2*n-1;i++){
        for(j=0;j<2*n-1;j++){
             s= n-Math.min(Math.min(i,2*n-i-2),Math.min(j,2*n-j-2));
             System.out.print(s+" ");
        }
        System.out.print("\n");
    }

}
    public static void pattern5alt(int n){
        for(int i=0;i< 2*n-1;i++){
            int k=n;
            for(int j=0;j< 2*n-1;j++){
                if(j>=(2*n-i-1))
                   k++;
                System.out.print(k+" ");
                if(j<i)
                   k--;
            }
            System.out.println();
        }
    }
    public static void pattern6(int n){
        int i,j,s,rows;
        for(i=0;i<2*n;i++)
        {
           for(j=1;j<=2*n;j++){
            rows= i>=n ? 2*n-i-1 : i;
            
            if((j<n && rows<=n-j) || (rows==0 && j==n)||(j>=n && rows<j-n))
               System.out.print("* ");
            else
               System.out.print("  ");
           }
        System.out.print("\n");
    }
}
}