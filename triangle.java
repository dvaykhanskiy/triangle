import java.util.Scanner;

public class triangle {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
      System.out.print("Enter base: ");
      int base = in.nextInt();
      System.out.print("Enter height: ");
      int height = in.nextInt();
      System.out.print("Enter hypotenuse: ");
      int hypo = in.nextInt();

      if ((base * base) + (height * height) == (hypo * hypo)) {
        System.out.println("\nYes, that's a right triangle!");
      } else {
        System.out.println("\nNope...not a right triangle.");
      }
    }
}
