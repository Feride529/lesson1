import java.util.Scanner;

public class Array {
  /*  public static void main(String[] args) {
        // ortaq elementler
        int[] array1 = {1, 3, 4, 9, 15};
        int[] array2 = {2, 3, 5, 9, 14};

        int i = 0, j = 0;

        System.out.print("Ortaq elementlər: ");

        while (i < array1.length && j < array2.length) {
            if (array1[i] == array2[j]) {
                System.out.print(array1[i] + " ");
                i++;
                j++;
            } else if (array1[i] < array2[j]) {
                i++;
            } else {
                j++;
            }
        }
    }
}*/
//ortalama tapmaq
 /*   public static void main(String[] args) {

        int[] array = {1, 3, 4, 9, 15};

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        double average = (double) sum / array.length;

        System.out.println("Ortalama: " + average);
    }
}*/

//ilk ve son element yer deyisme
    /* public static void main(String[] args) {

        int[] array = {1, 3, 4, 9, 15};

        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}*/
    //menfi olmayan element ---
       /* public static void main(String[] args) {

            int[] array = {-3, 0, 4, -1, 7, -5};

            for (int i = 0; i < array.length; i++) {
                if (array[i] >= 0) {
                    array[i] += 2;
                }
            }


            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
        }
    } */


    // 6-ya qaliqsiz bolunen musbet --?
  /* import java.util.Scanner;

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("n daxil edin: ");
            int n = sc.nextInt();

            int[] arr = new int[n];


            for (int i = 0; i < n; i++) {
                arr[i] = (i + 1) * 3;   // 3, 6, 9, 12, ...
            }

            int sum = 0;
            int count = 0;

            for (int i = 0; i < n; i++) {
                if (arr[i] > 0 && arr[i] % 6 == 0) {
                    sum += arr[i];
                    count++;
                }
            }

            System.out.println("6-ya bölünən müsbət ədədlərin sayı: " + count);
            System.out.println("6-ya bölünən müsbət ədədlərin cəmi: " + sum);
        }
    } */

    // tek ededlerin cemi
    /* import java.util.Scanner;

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("a daxil edin: ");
            int a = sc.nextInt();

            System.out.print("b daxil edin: ");
            int b = sc.nextInt();

            int sum = 0;

            for (int i = a; i <= b; i++) {
                if (i % 2 != 0) {
                    sum += i;
                }
            }

            System.out.println("Tək ədədlərin cəmi: " + sum);
        }
    } */


    //
    /*int[][] numbers

        public static void main(String[] args) {

            int[][] numbers = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };

            int sum = 0;

            for (int i = 0; i < numbers.length; i++) {
                for (int j = 0; j < numbers[i].length; j++) {
                    sum += numbers[i][j];
                }
            }

            System.out.println("Bütün elementlərin cəmi: " + sum);
        }
    } */

// setir-sutun ?
   /* import java.util.Scanner;

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Sətirlərin sayını daxil edin: ");
            int rows = sc.nextInt();

            System.out.print("Sütunların sayını daxil edin: ");
            int cols = sc.nextInt();

            int[][] numbers = new int[rows][cols];


            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print("numbers[" + i + "][" + j + "] = ");
                    numbers[i][j] = sc.nextInt();
                }
            }


            System.out.println("Daxil edilmiş 2D array:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(numbers[i][j] + " ");
                }
                System.out.println();
            }
        }
    } */

}