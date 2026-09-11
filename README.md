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
