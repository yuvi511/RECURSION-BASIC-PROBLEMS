public class Reverse {
    public static void main(String[] args) {
        int n = 8219;
        System.out.println(rev(n));
        int reversed = rev(n);
        if(n == reversed){
            System.out.println("palindrome");
        }

        else{
            System.out.println("no");
        }
    }

    public static int rev(int n){
        int d = (int)(Math.log10(n))+1;
        return helper(n,d);
    }

    public static int helper(int n,int d){
        //if a one digit number then return the number itself;;
        //also the base condition
        if(n%10 == n){
            return n;
        }

        int rev = n%10;

        return rev*(int)(Math.pow(10,d-1)) + helper(n/10,d-1);
    }

    
}
