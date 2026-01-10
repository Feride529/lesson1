import java.util.Scanner;

public class Task5 {
    /* VurmaCedveli */
   /* public static void main(String[] args) {

            for (int i = 1; i <= 10; i++) {
                System.out.printf("%4d |", i);
                for (int j = 1; j <= 10; j++) {
                    System.out.printf("%4d", i * j);
                }
                System.out.println();
            }
        }
    }/*


/* Scanner sc = new Scanner(System.in);
System.out.print("Ədədi daxil edin: ");
int eded = sc.nextInt();
int cemi = 0;

while (eded != 0) {
    cemi += eded % 10; // son rəqəm
    eded /= 10;        // ədədin son rəqəmini silir
}
System.out.println("Rəqəmlərin cəmi: " + cemi);
        }
}
*/
// Fibonacci

      /*  Scanner sc = new Scanner(System.in);
        System.out.print("Neçə ədəd Fibonacci istədiyinizi daxil edin: ");
        int n = sc.nextInt();

        int a = 0, b = 1;
        System.out.print("Fibonacci sırası: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}*/
      /*  Scanner sc = new Scanner(System.in);
        System.out.print("Neçə ədəd Fibonacci istədiyinizi daxil edin: ");
        int n = sc.nextInt();

        int a = 0, b = 1;
        int i = 1;

        System.out.print("Fibonacci sırası: ");

        while (i <= n) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
            i++;
        }
    }
}*/
// Kiçik kalkulyator
        /* Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            // Menyu göstər
            System.out.println("Nə etmək istəyirsən?");
            System.out.println("""
            1. Topla
            2. Çıx
            3. Vur
            4. Böl
            """);
            System.out.println("5. Proqramı dayandır");
            System.out.print("Seçiminizi edin (1-5): ");

            int choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("Proqram dayandırıldı.");
                running = false;
                continue;
            }

            System.out.print("Birinci ədədi daxil et: ");
            double num1 = scanner.nextDouble();
            System.out.print("İkinci ədədi daxil et: ");
            double num2 = scanner.nextDouble();

            switch (choice) {
                case 1:
                    System.out.println("Nəticə: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Nəticə: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Nəticə: " + (num1 * num2));
                    break;
                case 4:
                    if (num2 != 0) {
                        System.out.println("Nəticə: " + (num1 / num2));
                    } else {
                        System.out.println("Sıfıra bölmək olmaz!");
                    }
                    break;
                default:
                    System.out.println("Yanlış seçim! Yenidən cəhd et.");
            }

            System.out.println();

            scanner.close();
        }
    }
}*/
    // ulduz
     /*   int rows = 4;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
*/
     /*   int rows = 4;
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
} */
}