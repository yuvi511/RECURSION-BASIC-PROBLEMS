public class Descending{

    public static void main(String[] args) {
        int n = 10;
        System.out.println(descending(n));
    }

    public static int descending(int n){
        if(n == 1){
            return 1;
        }

        System.out.println(n);
        return descending(n-1);

    }

}