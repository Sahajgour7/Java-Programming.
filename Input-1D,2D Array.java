import java.util.Scanner;

class InputArray2D {

    public static int[][] input2DArray() {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the number of the rows: ");
        int rows = input.nextInt();
        System.out.print("Please enter the number of the columns: ");
        int columns = input.nextInt();

        int[][] arr = new int[rows][columns];

        int i = 0;
        while (i < rows) {
            int j = 0;
            while (j < columns) {
                System.out.print("Enter element of Rows: " + (i + 1) + ", column: " + (j + 1) + " : ");
                arr[i][j] = input.nextInt();
                j++;
            }
            i++;
        }
        return arr;
    }
}

public class InputArray1D {

    public static int[] input1DArray() {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the length of the Array: ");
        int rows = input.nextInt();

        int[] new_arr = Display1DArray(rows, input);

        return new_arr;
    }

    public static int[] Display1DArray(int rows, Scanner input) {
        int[] arr = new int[rows];

        int i = 0;
        while (i < rows) {
            System.out.print("Enter element at index [" + i + "]: ");
            arr[i] = input.nextInt();
            i++;
        }

        return arr;
    }

public static void Display1DArray(int[] arr) {
    int i = 0;

    while (i < arr.length) {
        System.out.print(arr[i] + " ");
        i++;
    }

    System.out.println();
}
}
