import java.util.Scanner;

public class MaxFinder {

    public static int MAX(int a, int b) {
        return (a > b) ? a : b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj pierwszą liczbę: ");
        int num1 = scanner.nextInt();

        System.out.print("Podaj drugą liczbę: ");
        int num2 = scanner.nextInt();

        System.out.print("Podaj trzecią liczbę: ");
        int num3 = scanner.nextInt();

        int max = MAX(num1, MAX(num2, num3));

        System.out.println("Największa z podanych liczb to: " + max);
    }
}