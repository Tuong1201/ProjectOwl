import java.util.Scanner;
public class TestRectangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int height, width;

        //for loop to display 5 different rectangle from user
        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter value of height: ");
            height = scan.nextInt();
            System.out.println("Enter value of width: ");
            width = scan.nextInt();

            new Rectangle(height, width).displayRec();
            System.out.println();
        }
    }
}