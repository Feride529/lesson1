public class giMethodsExample {

 public static void main(String[] args) {

            printHello();
            printName ("Farida");
            printEvenNumbers();

            printSquare(5);
            System.out.println(sum(3, 4));
            System.out.println(isEven(10));
            printBetween(3, 8);

            System.out.println(findMax(3, 9, 5));
            System.out.println(getFactorial(5));
            System.out.println(reverseNumber(123));
            System.out.println(isPrime(7));
            System.out.println(sumOfDigits(456));
            System.out.println(countVowels ("Salam Java"));
        }

    // =====================
    // Sadə method-lar
    // =====================

    // 1. Ekrana "Salam!" yazır
   static void printHello() {
        System.out.println("Salam!");
    }

   // 2. Ad alsın və "Salam, [ad]" yazır
    static void printName(String ad) {
        System.out.println("Salam " + ad);
    }

    // 3. 1-dən 20-yə qədər cüt ədədləri çap edir
     static void printEvenNumbers() {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " ");
            }
        }
        System.out.println();
    }

    // =====================
    // Parametrli method-lar
    // =====================

    // 1. n ədədinin kvadratını çap edir
     static void printSquare(int n) {
        System.out.println(n * n);
    }

    // 2. İki ədədin cəmini qaytarır
     static int sum(int a, int b) {
        return a + b;
    }

    // 3. Ədəd cütdürsə true, yoxsa false
     static boolean isEven(int n) {
        return n % 2 == 0;
    }

    // 4. start ilə end arasındakı ədədləri çap edir
     static void printBetween(int start, int end) {
        for (int i = start + 1; i < end; i++) {
            System.out.println(i + " ");
        }
        System.out.println();
    }

    // =====================
    // Return dəyəri olan method-lar
    // =====================

    // 1. Ən böyük ədədi tapır
     static int findMax(int a, int b, int c) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        return max;
    }

    // 2. Faktorial hesablayır
     static int getFactorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // 3. Ədədi tərsinə çevirir
     static int reverseNumber(int n) {
        int reversed = 0;
        while (n != 0) {
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }
        return reversed;
    }

    // 4. Sadə ədəd olub-olmadığını yoxlayır
     static boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // 5. Rəqəmlərin cəmini tapır
     static int sumOfDigits(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    // 6. Mətndəki saitlərin sayını tapır
     static int countVowels(String text) {
        int count = 0;
        text = text.toLowerCase();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
}




