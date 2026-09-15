import java.util.Scanner;

class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number n: ");
        int n = sc.nextInt();

        Pattern obj = new Pattern();
        obj.printPattern(n);
        
        sc.close();
    }

    void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // Moves to the next line after each row
        }
    }
}
