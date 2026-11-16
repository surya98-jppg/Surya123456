import java.util.*;
public class LCM__GCD{
 public static void main(String[] args) {
    int a=2;
    int b=8;
    System.out.println(Gcd(a,b));
    System.out.println(lcm(a,b));
    System.out.println(findlcm(a,b));
 }
//Euclidean algorithm to find hcf or gcd of a number

 public static int  Gcd (int a, int b) {
    if(a == 0){
        return b;
    }
    return Gcd(b % a, a);
 }

// Brute force approach to find lcm of a number
 public static int lcm(int a , int b){
    int max=Math.max(Math.abs(a),Math.abs(b));
    while(true){
        if((max % a)==0 && max%b==0 ){
            return max;
        }
        max++;
    }
 }

// optimized approach to find lcm using gcd
  public static int findlcm(int a,int b){
    int lcm=a*b/Gcd(a,b);
    return lcm;
  }
}