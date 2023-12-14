
public class Ascending {
    public static void main(String[] args){
        int n = 12;
        ascending(n);

    }

    public static void ascending(int n){
        if(n == 1){
            System.out.println(1);
            return;
        }

        ascending(n-1);
        System.out.println(n);
       
    }
}
