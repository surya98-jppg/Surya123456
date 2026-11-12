 class prime_number {
    public static void main(String[] args) {
        int n=11;
        boolean[]primes=new boolean[n+1];
        System.out.println(isPrime(n));
        System.out.println(isPrimeOptimized(n));
        primeNumbersUptoN(n);
        primeNumbersUptoNOptimized(n,primes);
    }

// Simple method to check a prime number O(n)
    public static boolean isPrime(int n) {
        boolean isPrime=true;
        if(n<2){
            return false;
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                isPrime=false;
                break;
            }
        }
        return isPrime;
    }     

//function to find prime nuumber 0(squrt n) 
    public static boolean isPrimeOptimized(int n){
        if(n<2){
            return false;
        }
        int i=2;
        while(i*i<=n){
            if(n%i==0){
                return false;
            }
            i++;
        }
        return true;
    }   
// prime numbers upto number normal method 0(n squrt n)
   public static void primeNumbersUptoN(int n){
         if(n<2){
            return;
            }
        if (n==2 || n==3){
            System.out.println(n);
        }
        
        for(int i=2;i<=n;i++){
          boolean  is_prime=true;
            for(int j=2;j*j<=i;j++){
                if(i%j==0 && i!=j){
                    is_prime=false;
                    break;
                }            
            }           
        if(is_prime){
                System.out.println(i);
         }
    }
 }

// optimized sieve of erastonesis method 0(n log(log n))

    public static void primeNumbersUptoNOptimized(int n,boolean[]primes){
        for(int i=2;i*i<=n;i++){
            if(!primes[i]){
                for(int j=i*i;j<=n;j+=i){
                    primes[j]=true;
                }
            }
        }
        for(int i=2;i<=n;i++){
            if(!primes[i]){
                System.out.println(i);
            }
        }

    }
}