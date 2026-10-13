import java.util.Scanner;

public class que28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Table Number: ");
        int value = input.nextInt();

        int sec = 1;
        while (sec <= 10) {
            System.out.println(value * sec);
            sec++;
        }
        input.close();
    }
}
