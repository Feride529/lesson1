import java.util.Random;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        // n->1 tersine cap
    /*    Scanner sc = new Scanner(System.in);
        System.out.print("Bir ədəd daxil edin: ");
        int n = sc.nextInt();

        while (n >= 1) {
            System.out.print(n + " ");
            n--;
        }
    }
}*/
        //Ededin reqemlerinin cemi:
      /*  Scanner sc = new Scanner(System.in);
        System.out.print("Bir ədəd daxil edin: ");
        int n = sc.nextInt();

        int sum = 0;
        int temp = n;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        System.out.println("Rəqəmlərin cəmi: " + sum);
    }
}
*/
        // Palindrom:
        /* Scanner sc = new Scanner(System.in);
        System.out.print("Bir ədəd daxil edin: ");
        int n = sc.nextInt();

        int original = n;
        int reversed = 0;

        while (n > 0) {
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }

        if (original == reversed) {
            System.out.println("Palindromdur");
        } else {
            System.out.println("Palindrom deyil");
        }
    }
}*/
        // Soz daxil et
      /*  Scanner sc = new Scanner(System.in);
        String correctWord = "java";
        String input;

        do {
            System.out.print("Sözü daxil edin: ");
            input = sc.nextLine();
        } while (!input.equals(correctWord));

        System.out.println("OK");
    }
}*/
        // Eded daxil edin + cemi
      /*  Scanner sc = new Scanner(System.in);
        int sum = 0;
        int num;

        do {
            System.out.print("Ədəd daxil edin (0 dayandırır): ");
            num = sc.nextInt();
            sum += num;
        } while (num != 0);

        System.out.println("Daxil edilən ədədlərin cəmi: " + sum);
    }
}*/
        // Random eded :
        /* Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int randomNumber = rand.nextInt(10) + 1; // 1-10 arası
        int guess;
        int attempts = 0;

        do {
            System.out.print("Təxmin edin (1-10): ");
            guess = sc.nextInt();
            attempts++;
        } while (guess != randomNumber);

        System.out.println("Təbriklər! Düzgün ədəd tapıldı.");
        System.out.println("Cəhd sayı: " + attempts);
    }
} */

        // 30 a qeder eded daxil etmek ve cemi yoxlamaq
      /*  Scanner sc = new Scanner(System.in);
        int sum = 0;
        int num;

        do {
            System.out.print("Ədəd daxil edin: ");
            num = sc.nextInt();
            sum += num;

            if (sum == 30) {
                System.out.println("Cəm OK");
                break;
            }
        } while (sum < 30);

        if (sum > 30) {
            System.out.println("Cəm: " + sum);
        }
    }
}*/

      /*  // Ededin reqemlerinin ceminin hasile nisbeti
        Scanner sc = new Scanner(System.in);
        System.out.print("Ədəd daxil edin: ");
        int n = sc.nextInt();

        int sum = 0;
        int product = 1;
        int temp = n;

        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }

        if (product != 0) {
            double ratio = (double) sum / product;
            System.out.println("Cəmin hasilə nisbəti: " + ratio);
        } else {

        }
    }
}*/

        /*// Ededin 2 ci reqemini tapmaq:
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        while(number > 99) {
        number/=10;
        }
        System.out.println(number%10);

    }
}*/

      /*  System.out.println("0-dan 500-ə qədər mükəmməl ədədlər:");
        for (int i = 1; i <= 500; i++) {
            int sum = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (sum == i) {
                System.out.println(i);
            }
        }
    }*/
    }
}