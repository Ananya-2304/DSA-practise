import java.util.Scanner;
class Asteroid{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Solution obj = new Solution();
        int n = sc.nextInt();
        int[] arr = new int[n];
        int i;
        for(i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        arr = obj.asteroidCollision(n,arr);
        n=arr.length;
        System.out.print("{");
        for(i=0;i<n;i++){
            System.out.print(arr[i] + ",");
        }
        System.out.println("}");
    }
}
class Solution{
    static int top =-1,count=0;
    static int[] arr;
    int[] asteroidCollision(int N, int[] asteroids){
        int i=0;
        arr = new int[N];
        for(i=0;i<N;i++){
              if(asteroids[i]>0){
                push(asteroids[i]);
              }
              else if(asteroids[i]<0){
                while(top!=-1 && peek()>0 && peek()<Math.abs(asteroids[i]))
                   pop();
                if(top==-1)
                  push(asteroids[i]);
                else if(top !=-1 && peek()<0){
                push(asteroids[i]);
                }
                else if(top !=-1 && peek() == Math.abs(asteroids[i])){
                    pop();
                }
              }
        }
        int[] array = new int[count];
        for(i=0;i<count;i++){
            array[i]=arr[i];
        }
        return array;
    }
    void push(int ele){
        top++;
        arr[top]= ele;
        count++;
    }
    int pop(){
        int ele = arr[top];
        arr[top] =0;
        top--;
        count--;
        return ele;
    }
    int peek(){
        return arr[top];
    }
}