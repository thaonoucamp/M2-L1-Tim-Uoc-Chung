import java.util.Scanner;

public class CheckUCLN {
    public static void main(String[] args) {
        while (true) {
            int a;
            int b;

            Scanner input = new Scanner(System.in);
            System.out.println("Enter a num the a : ");
            a = input.nextInt();

            System.out.println("Enter a num the b : ");
            b = input.nextInt();

            a = Math.abs(a);
            b = Math.abs(b);

            if (a == 0 || b == 0) {
                System.out.println("Khong co uoc chung lon nhat");
            } else {
                while (a != b) {
                    if (a > b) {
                        a -= b;
                    } else {
                        b -= a;
                    }
                    System.out.println("Uoc chung lon nhat la : " + a);
                }
            }
        }
    }
}
