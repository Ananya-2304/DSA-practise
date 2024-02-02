import java.util.*;
public class TwoSum{
    public static void main(String[] args){
    int i;
    Scanner sc = new Scanner(System.in);
    Solution obj = new Solution();
    System.out.println("Enter the size of the array ");
    int n= sc.nextInt();
    int[] arr = new int[n];
    for(i=0;i<n;i++){
        arr[i]= sc.nextInt();
    }
    System.out.println("Enter the target");
    int target= sc.nextInt();
    int a[] = new int[2];
    a = obj.twoSum(arr,target);
    System.out.println(Arrays.toString(a));
    }
}
class Solution{
    public static int[] twoSum(int[] arr,int target){
        HashMap<Integer,Integer> maps = new HashMap<>();
        int n= arr.length;
        int i, sum,b;
        int[] a = new int[2];
        for(i=0;i<n;i++){
            int checkEle = target - arr[i];
            if(maps.containsKey(checkEle)){
                b= maps.get(checkEle);
                if(b>i){
                    a[0]=i;
                    a[1]=b;
                }
                else
                {
                    a[0]=b;
                    a[1]=i;
                }
                break;
            }
            maps.put(arr[i],i);
        }
        return a;
    }
}
