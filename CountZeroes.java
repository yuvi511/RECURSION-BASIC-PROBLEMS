public class CountZeroes {
    public static void main(String[] args) {
        int n = 30100;
        System.out.println(counter(n));
    }

    public static int counter(int n) {
        int count = 0;
        return helper(n, 0);
    }

    public static int helper(int n,int count){
        if(n == 0){
            return count;
        }

        if(n%10 == 0){
            return helper(n/10,count+1);
        }

        return helper(n/10,count);
    }
}
