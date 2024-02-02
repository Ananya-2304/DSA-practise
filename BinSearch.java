import java.util.Scanner;
public class BinSearch{
    public static void main(String[] args){
        Solution obj = new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.println("No of elements");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++)
          arr[i]=sc.nextInt();
        System.out.println("Enter the search element");
        int key = sc.nextInt();
        key=obj.binSearch(arr,0,n-1,key);
        if(key == -1)
         System.out.println("Element not found");
        else
         System.out.println("Element found at "+key);
    }
}
class Solution{
    int binSearch(int[] arr,int beg,int end,int key){
        int loc;
       int mid = (beg+end)/2;
       if(beg>end)
          return -1;
       if(arr[mid]==key){
          return mid;
       }
       else if(arr[mid]>key){
          loc = binSearch(arr,beg,mid-1,key);
       }
       else
          loc = binSearch(arr,mid+1,end,key);
        return loc;
    }
}