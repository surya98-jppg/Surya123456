class bit_manipulation{
    public static void main(String[] args){
        int n = 6; // Example value
        int i=3;
        int[] nums={1,2,3,4,1,2,3,4,5};
        System.out.println(isEvenOrOdd(n));
        System.out.println(SingleNumber(nums));
        System.out.println(find_ith_bit(n,i));
        System.out.println(toggle_ith_bit(n,i));
        System.out.println(Negative(n));
        System.out.println(MagicNumber(n));
        System.out.println(NumberOfDigits(n,2));
        System.out.println(PowerOfTwo(n));
        System.out.println(countsetBits(n));
    }



// Function to check if a number is even or odd using bit manipulation
    public  static boolean isEvenOrOdd(int n) {
        return(n&1)==0 ;
    }

// Function to find the single number in an array where every other number appears twice    
    public static int SingleNumber(int[] nums){
        int result=0;
        for(int num:nums){
            result^=num;
        }
        return result;
    }

// Function to find the ith bit of a number using bit manipulation
   public static int find_ith_bit(int n,int i){
    return (n&(1<<i-1))!=0?1:0;

   }

// Function to toggle the ith bit of a number using bit manipulation   
   public static int toggle_ith_bit(int n, int i){
    return (n^(1<<i-1));
   }

// Function to find the negative of a number using bit manipulation

  public static int Negative(int n){
    return ~n+1;
  }
  
// Function to check if a number is a magic number using bit manipulation
  public static int MagicNumber(int n){
    int base=5;
    int ans=0;
    while(n>0){
        int last=n&1;
        ans+=(int)(last*base);
        base*=5;
        n=n>>1;
    }
    return ans;
  }
 
// NUmber of digits in a base
    public static int NumberOfDigits(int n, int base){
        int count=0;
        while(n>0){
            count++;
            n/=base;
        }
        return count;
    }
// power of two
  public static boolean PowerOfTwo(int n){
    return (n&(n-1))==0 && n>0;
  }
// set bits  
 public static int countsetBits(int n){
    int count=0;
    while(n>0){
        n=n&n-1;
        count++;
        
    }
    return count;
 } 
 
}