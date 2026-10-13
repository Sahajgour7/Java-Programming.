import java.util.Scanner;

public class que29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your Number: ");
        int n = input.nextInt();

        if (n % 2 == 1) {
            int i = 1;
            int sum = 0;

            while (i <= n) {
                if (i % 2 == 1) {
                    sum += i;
                }
                i++;
            }

            System.out.println(sum);
        } else {
            System.out.println("Your Number is Even: " + n);
        }
    }
}
