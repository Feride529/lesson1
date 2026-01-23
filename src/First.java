import java.util.Scanner;
/**
        * Menu capa verilir ve menunu daxil edirik
 * daxil etdiyimize uygun isleyir mes: 1 register secdimse
 * register:
        *  birinci how many student?
        *  daxil olunan reqemi arrayin uzunluguna vererek hemin olcude studentleri saxlamaq ucun array yaratmis olursuz.
        *  hemin arrayin uzunlugu qeder dovr eletdirerek her defesinde yeni obyekt yaradib doldurub onu
 *  arrayin muvafiq indexine set etmek lazimdir
 *
         */
public class First {

    public static void main(String[] args) {

         //        Data type-lar
         boolean isWeatherFine = true;
         boolean isEatTasty = false;
         System.out.println("Is Weather Fine?" + isWeatherFine);
         System.out.println("Is Eat Tasty?" + isEatTasty);

         byte age = 30;
         byte nightTemp = 0;
         System.out.println(age);
         System.out.println("Night:" + nightTemp);

         char grade = 'C';
         char symbol = '@';
         System.out.println(grade);
         System.out.println(symbol);

         short year = 2025;
         short depth = -1250;
         System.out.println(year);
         System.out.println(depth);

         int x = 50;
         int y = 10;
         System.out.println("Qismət:" + (x / y));
         int limit = 1500;
         System.out.println(limit);

         long countryPopulation = 10000000L;
         long a = 200000000L;
         long b = -700000000L;
         System.out.println(countryPopulation);
         System.out.println(a);
         System.out.println(b);

         float pi = 3.14f;
         float d = 26.6f;
         float e = 10.0f;
         System.out.println(pi);
         System.out.println("Cem:" + (d + e));

         double average = 78.345;
         int m = 6;
         double n = 2.5;
         double result = m + n;
         System.out.println(average);
         System.out.println(result);

         String city = "Baku";
         String country = "Azerbaijan";
         System.out.println(city);
         System.out.println(country);


         //         Əlavə tapşırıq

         Scanner sc = new Scanner(System.in);
         System.out.print("Birinci eded");
         int p = sc.nextInt();
         System.out.print("Ikinci eded");
         int k = sc.nextInt();
         System.out.println("Cem:" + (p + k));
         System.out.println("Ferq:" + (p - k));
         System.out.println("Hasil:" + (p * k));
         System.out.println("Qismet:" + (double) p / k);

         ///
         System.out.println("Bolunen:");
          int f = sc.nextInt();
         System.out.println("Bolen:");
          int g = sc.nextInt();
         double l =(double) f / g;
         System.out.println("Qismet :" + l);
//


     }
 }

//bonus task: cutluk
 /*   public static void main(String[] args) {

        String n = "1235321";   // input
        int count = 0;

        int left = 0;
        int right = n.length() - 1;

        while (left <= right) {
            if (n.charAt(left) == n.charAt(right)) {
                count++;
            }
            left++;
            right--;
        }

        System.out.println(count);
    }
} */

//bonus2: cevrilme
/*  import java.util.Scanner;

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("n daxil edin: ");
            int n = sc.nextInt();

            int count = 0;

            while (n != 1) {
                if (n % 2 == 0) {
                    n = n / 2;
                } else {
                    n = n + 1;
                }
                count++;
            }

            System.out.println(count);
        }

 */

/* import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Array ölçüsünü daxil edin (n x n): ");
        int n = sc.nextInt();

        int[][] array = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j > i) { // yuxarı üçbucaq
                    array[i][j] = 1;
                } else {     // alt üçbucaq
                    array[i][j] = 0;
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}*/