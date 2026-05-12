import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number n: ");
        int n;
        n = sc.nextInt();

        System.out.print("Enter your name: ");
        String name;
        name = sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println(name);
        }

        sc.close();
    }
}