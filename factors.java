import java.util.*;
public class factors {
public static void main(String[] args){
        int n=12;
        char[]factors=findFactors(n);
        System.out.println("factors of n are:");
        for(int i=0;i<factors.length;i++){
            System.out.println(factors[i]+" ");
        }
        
        findFactorsList(n);
    }
// optimized approach to find factor of a number
    public static char[] findFactors(int n) {
         char[] factors = new char[n];
        int index=0;
        if(n==0){
            return new char[0] ;
        }
        if(n==1){
            return new char[]{'1'};
        }
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                factors[index]=(char)(i);
                index++;
                if(i!=n/i){
                    factors[index]=(char)(n/i);
                    index++;
                }
            }
        }
    Arrays.sort(factors,0,index);
    return Arrays.copyOf(factors,index);
    }


// another way using list 0(squrt n)
    public static void findFactorsList(int n){
        List<Integer>factors=new ArrayList<>();
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                if(n%i==i){
                System.out.print(i + " ");
            }
            else{
                System.out.print(i +" ");
                factors.add(n/i);
            }
        }}
        for(int i=factors.size()-1;i>=0;i--){
            System.out.print(factors.get(i) + " ");
        }

        }

}
