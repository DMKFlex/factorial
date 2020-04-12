import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int f= scanner.nextInt();
        System.out.println(fact(f));
    }

    static int fact(int num) {
        if(num==1){
            return 1;
        }
        return fact(num-1) * num;
    }
}
