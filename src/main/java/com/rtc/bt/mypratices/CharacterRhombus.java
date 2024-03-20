import java.util.Scanner;

public class CharacterRhombus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the number: ");
        int num = scanner.nextInt();

        char ch = 'A';

        // Upper half of the rhombus
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print((char)(ch + j - 1));
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print((char)(ch + j - 1));
            }
            System.out.println();
        }

        // Lower half of the rhombus
        for (int i = num - 1; i >= 1; i--) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print((char)(ch + j - 1));
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print((char)(ch + j - 1));
            }
            System.out.println();
        }

        scanner.close();
    }
}
