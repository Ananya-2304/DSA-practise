import java.util.Scanner;
class Merge2SortedArr{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] nums1= new int[m+n];
        int[] nums2= new int[n];
        System.out.println("Enter arr1");
        for(int i=0;i<m;i++)
           nums1[i]=sc.nextInt();
        System.out.println("Enter arr2");
        for(int i=0;i<n;i++)
           nums2[i]=sc.nextInt();
        Solution obj = new Solution();
        obj.merge(nums1,m,nums2,n);
        for(int i=0;i<m+n;i++)
           System.out.println(nums1[i]);
    }
}
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums3 = new int[m+n];
        int i=0,j=0,k=0;
        if(m==0 && n ==0)
           return;
        else if(m==0){
            for(i=0;i<n;i++)
              nums1[i]=nums2[i];
        }
        else if(n==0){
            return;
        }
        else{
        i=0;
         while(i<m && j<n){
           if(nums1[i]<nums2[j]){
               nums3[k] = nums1[i];
               i++;
               k++;
           }
           else if(nums1[i]==nums2[j]){
            nums3[k++]=nums1[i];
            nums3[k++]=nums2[j];
            i++;
            j++;
           }
           else if(nums2[j]<nums1[i]){
               nums3[k] = nums2[j];
               j++;
               k++;
           }
        }
        while(k<(m+n)){
           if(j<n){
               nums3[k]=nums2[j];
               j++;
               k++;
           }
           else if(i<m){
               nums3[k] = nums1[i];
               i++;
               k++;
           }
        }
        
        for(i=0;i<m+n;i++){
            nums1[i] = nums3[i];
        }
        }
    }
}