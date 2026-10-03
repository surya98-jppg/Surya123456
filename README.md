# Surya123456
# way to print char array
import java.util.*;
class Main {
    public static void main(String[] args) {
        String s="surya";
        char[]c=s.toCharArray();
        System.out.println(Arrays.toString(c));
    }
}
# String methods
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a name or line or word");
        String s1="surya ";
        int a =s1.length(); //lenght
        char s=s1.charAt(2); //char at index
        char[]c=s1.toCharArray();
        int index=s1.indexOf('p');
        boolean s3=s1.contains("sur");
        boolean s4=s1.startsWith("sur");
        boolean s5=s1.endsWith("kash");
        String s6=s1.substring(5);
        String s7=s1.substring(1,5);
        String s9=s1.strip();
        System.out.println(a);
        System.out.println(s);
        System.out.println(c);
        System.out.println(index);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);
        System.out.println(s7);
        System.out.println(s9);
    sc.close();
        
        
    }
}
# count digits in a number
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        System.out.println("enter a number to count digits");
        int number=sc.nextInt();
        int temp=number;
        int digit=0;
        while(temp>0){
            digit=temp%10;
            count+=1;
            temp=temp/10;
        }
        System.out.println(count);
        System.out.println(digit);

    }
}
# list elements in runtime 
import java.util.*;
class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the list");
        int size=sc.nextInt();
        System.out.println("enter the lsit elments");
        for(int i=0;i<size;i++){
            int e=sc.nextInt();
            numbers.add(e);
        }
        System.out.println(numbers);
        System.out.println(numbers.size());
    }
    
}
# factoial of a number
import java .util.*;
class Main {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter how many you want");
    int n=sc.nextInt();
    while(n>0){
    System.out.println("enter the number");
        int N=sc.nextInt();
        int original=N;
        int fact=1;
        while (N>0){
            fact=fact*N;
            N--;        
        }
        System.out.println("factorial of "+original +"is"+fact);
      n--;      
    }
    sc.close();
    }
}
# finding commonelments in a list
   #Noraml approach is using two loops where it takes O(N*M)
   #optimization apporoach
   import java.util.*;
class Main {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
     ArrayList<Integer>list1=new ArrayList<>();
     ArrayList<Integer>list2=new ArrayList<>();
     ArrayList<Integer>commonelements=new ArrayList<>();
     System.out.println("enter the size of list1");
        int size=sc.nextInt();
     System.out.println("enter the size of lsit2");
        int size2=sc.nextInt();
    System.out.println("enter the elemnts of first list");
     for(int i=0;i<size;i++){
         int number=sc.nextInt();
         list1.add(number);
         
     }
    System.out.println("enter the elemnts of second list");
    for(int i=0;i<size2;i++){
        int number2=sc.nextInt();
        list2.add(number2);
    }
        Set<Integer>sett2=new HashSet<>(list2);
        for(Integer num:list1){
          if(sett2.contains(num)){
              commonelements.add(num);
          }
        }
        System.out.println(commonelements);
    }
}
# 2-D matrix 
import java.util.*;
class Main {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows and cols of the matrix");
        int rows=sc.nextInt();
        int cols=sc.nextInt();
      int[][]arrr=new int[rows][cols];
        System.out.println("enter the rows*cols elments");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arrr[i][j]=sc.nextInt();
                
            }}
         System.out.println(" the matrix is");
         for(int i=0;i<rows;i++){
             for(int j=0;j<cols;j++){
                 System.out.println(arrr[i][j] + " ");
             }
              System.out.println();
         }        
      
    }
}
# Must use sc.nextLine if you are using sting input after int
# count even and odd do not use array if we only need count
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the lenght of the array");
        int s=sc.nextInt();
        
        int count_even=0;
        System.out.println("enter the element of the array");
        for(int i=0;i<s;i++){
         int n=sc.nextInt();
            if (n%2==0){
                count_even+=1;
            }
        }
        int count_odd=s-count_even;       
        System.out.println("count of even_numbers is " + count_even);
        System.out.println("count of odd numbers is " + count_odd);
    }}
# PERFECT NUMBER
class Main {
    public static void main(String[] args) {
     int n=5;
     long sum=1;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                sum+=i;
            }
            if(i*i!=n){
                sum+=n/i;
            }
        }
        if(sum==n){
            System.out.println("it is a perfect number");
        }
        else{
            System.out.println("Not a perfect number");
        }
    }
}
# Reversin an array
class Main {
    public static void main(String[] args) {
     int[]arr={1,2,3,4,5};
     int left=0;
     int right=arr.length-1;
     int temp;
    while(left<right){
        temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
        left++;
        right--;}
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }}
# remove duplicates from array
# if it is sorted(upto insertindex-1 all are unique elemnts)(in place approach)
import java.util.*;
class Main {
    public static void main(String[] args) {
      int[]arr={1,2,3,4,4,5,5};
        int insertIndex=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                arr[insertIndex]=arr[i];
                insertIndex++;
            }
        }
        int[]arrr=Arrays.copyOf(arr,insertIndex);
        System.out.println(Arrays.toString(arrr));
    }
}
# using set to remove duplicates if insertion order is mater
import java.util.*;
class Main {
    public static void main(String[] args) {
      int[]arr={1,2,3,4,4,5,5};
        Set<Integer>set=new LinkedHashSet<>();
        for(int num:arr){
            set.add(num);
        }
    // conversion of set to array
    int[]result=new int[set.size()];
    int index=0;
    for(int nums:set){
       result[index]=nums;
       index++;
    }
   System.out.println(Arrays.toString(result));
}}
# frequency  count (traditonal approach)
import java.util.*;
class Main {
    public static void main(String[] args) {
      int[]arr={1,2,3,4,4,5,5};
        Map<Integer,Integer>map=new HashMap<>();
        for(int num:arr){
            if(map.containsKey(num)){
              map.put(num,map.get(num)+1);
            }
           else{
               map.put(num,1);
           }
    }
    System.out.println(map);
}}
# standard java approach
for (int num : arr) {
            // If num exists, increment count by 1. If not, start at 0 + 1.
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
# Methods in Java
import java.util.*;
class Main {
    public static int  Addition(int a , int b){
      return a+b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number");
        int num1=sc.nextInt();
        System.out.println("enter the second number");
        int num2=sc.nextInt();
        int result=Addition(num1,num2);
        System.out.println(result);
        
    }
}
# without return type and with arguements
import java.util.*;
class Main {
    public static void Addition(int a , int b){
        int result=a+b;
      System.out.println(result);
    }
    public static void main(String[] args) {
       Addition(3,4);
        
    }
}
# check to prime no or not (optimized approach )(trial division (6k+1)(after 3 prime numbers can be represented in that form)
import java.util.*;
class Main{
public static boolean IsPrimeOrNot(int a ){
    if(a<=1){
    return false;
    }
   if(a==2 || a==3){
       return true;
   }
  if(a%2==0 || a%3==0){
      return false;
  }
  
  for(int i=5;i*i<=a;i+=6){
      if(a%i==0 || a%(i+2)==0){
          return false;
      }
  }
  return true;
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        boolean result=IsPrimeOrNot(n);
        System.out.println(result);
        
    }

}
# Arraylist to array
import java.util.*;
class Main {
    public static void main(String[] args) {
   ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2,3);
        Integer[]arr=list.toArray(new Integer[0]);
        System.out.println(Arrays.toString(arr));
}}
# Array to ArrayList
import java.util.*;
class Main {
    public static void main(String[] args) {
     Integer[]arr={1,2,3,4,5};
           List<Integer> list=Arrays.asList(arr);
        System.out.println(list);
    }}
# queue implemntation using linkedList
import java.util.*;
class Main {
    public static void main(String[] args) {
     Queue<Integer>queue=new LinkedList<>();
        queue.offer(12);
        queue.offer(13);
        queue.offer(45);
       System.out.println( queue.peek());
        int removed=queue.poll();
        System.out.println(removed);
       int removed2=queue.remove();  //throws an exception
        System.out.println(removed2);
      System.out.println(queue.element()); // throws an exception
    }
}
# Stack 
import java.util.*;
class Main {
    public static void main(String[] args) {
     Stack<Integer>stack=new Stack<>();
        stack.push(12);
        stack.push(2);
        stack.push(33);
        System.out.println(stack.peek());
        System.out.println(stack.size());
        stack.pop();
        System.out.println(stack.search(2)); //return -1 or 0
        stack.pop();
        System.out.println(stack.pop());
        if(stack.isEmpty()){
            System.out.println("stack is nill");
        }}
}
