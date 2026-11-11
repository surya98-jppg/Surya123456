import java.util.*;
class decimal{
    public static void main(String ...args){
        int n=1010;
        //System.out.println(Integer.toBinaryString(n));
        System.out.println(binary_to_decimal(n));
    }
public static int binary_to_decimal(int n){
    if(n==0){
        return 0;
    }
     int base=2;
     int ans=0;
     int power=0;
     while(n>0){
        int digit=n%10;
         ans+=(int)(digit*Math.pow(base,power));
       
       power+=1;
       n/=10;
     }
     return ans;
    }
}
