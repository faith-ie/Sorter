import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What is the size of the array? (Remember that arrays start at 0, so add one number bigger than your array size!)");
        int size = in.nextInt();
        String[] array = new String[size];
        for (int i = 0; i < size; i++) {
            array[i] = in.nextLine();
        }
        Arrays.sort(array);
        for (String s : array) {
            System.out.println(s);
        }
    }
}