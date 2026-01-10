import java.util.Scanner;
public class Second {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

      /* if () {b % 2 !=0 && c %2 !=0 && d % 2 !=0)
           System.out.println("YES");
       } else if (b % 2 ==0 && c %2 ==0 && d % 2 ==0) {
           System.out.println("YES");
       } else {
               System.out.println("NO");

           }
        */

        boolean cond = (b % 2 != 0 && c % 2 != 0 && d % 2 != 0)
                || (b % 2 == 0 && c % 2 == 0 && d % 2 == 0);

        if (cond) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}














