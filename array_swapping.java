import java.util.*;
class array_swappping{
    public static void main(String ...args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
         int a=sc.nextInt();
         int[]arr=new int[a];
         System.out.println("enter the array elements");
         for(int i=0;i<arr.length;i++){
             arr[i]=sc.nextInt();
         }
         System.out.println(Arrays.toString(Swap_array(arr)));
         System.out.println(Arrays.toString(swap_array(arr)));

       
        
    }
// Two pointer algorith to swap array elmennts
      public static  int[] Swap_array(int[] arr) {
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        return arr;
    }

// in place algortihm to swap array array elemnts;
    public static int[] swap_array(int[]arr){
        int n=arr.length;
        for(int i=0;i<n/2;i++){
            int temp=arr[i];
            arr[i]=arr[n-1-i];
            arr[n-1-i]=temp;
        }
        return arr;
    }
}