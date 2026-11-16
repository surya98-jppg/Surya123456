public class square_root {
    public static void main(String[] args) {
        int n=20;
        int p=3;
        System.out.println(findSquareroot(n));
        System.out.println(findSquarerootOptimized(n,p));
        System.out.println(NewtonRaphsonSqrt(n));
    }
// Brute force approach to find the square root of a number(only for perfect sqaures)

    public static int findSquareroot(int n) {
        if(n==0|| n==1){
            return n;
        }
        if(n==2){
            return 1;
        }
        int squareroot=-1;
        for(int i=2;i*i<=n;i++){
            if(i*i==n){
                squareroot=i;
                break;
            }
            else if(i*i>n){
                break;
            }
        }
        if(squareroot!=-1){
        return squareroot;
        }
        else{
            return -1;
        }
    }

// optimized approach to find square root of a number(only for perfect squares) 
      public static double findSquarerootOptimized(int n,int p){
        if(n==0||n==1){
            return n;
        }
        int low=0;
        int high=n/2;// beacuase the square root of a number is always less than or equal to half of the number affter 4
        double root=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(mid*mid==n){
                root=mid;
                break;
            }
            else if(mid*mid>n){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        if(root==-1){
            root=high; // it makes code efficeint because it get's the integral part of the number after binary search
        }
        double  decimal=0.1;
        for(int i=0;i<p;i++){
            while(root*root<=n){
                  root+=decimal;
            }
            root-=decimal;
            decimal/=10;
        }

        return root;
      }

// Newton Raphson method to find sqrt of a numeber(best method for all)
    public static double NewtonRaphsonSqrt(int n){
        double x=n;
        double root;
        while(true){
            root=0.5*(x+(n/x));
            if(Math.abs(root-x)<0.0001){
                break;
            }
            x=root;
        }
        return root;
    }      
}
