/* BMI
 public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       //BMI (Body Mass Index)
        // Ceki (kg)
        System.out.print("Ceki (kg): ");
        float weightKg = sc.nextFloat();
        //Boy (sm)
        System.out.print("Boy (sm): ");
        // Type conversion: cm -> m

        int heightCm = sc.nextInt();
        double heightM = heightCm / 100.0;
        double bmi = weightKg / (heightM * heightM);
        String category;
        if (bmi < 18.5) {
            category = "Zeif cekili";
        } else if (bmi < 25) {
            category = "Normal";
        } else if (bmi < 30) {
            category = "Artiq cekili";
        } else {
            category = "Obez";
        }
        System.out.printf("BMI: %.2f (%s)%n", bmi, category);
        sc.close();
    }
}
*/


 /*/// Grade Calculator

public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.print("score (0-100): ");
    int score = sc.nextInt();
    if (score >=0 && score <=100) {
        if (score >= 90) {
            System.out.println("Sizin qiymetiniz: A");
        } else if (score >= 80) {
            System.out.println("Sizin qiymetiniz: B");
        } else if (score >= 70) {
            System.out.println("Sizin qiymetiniz : C");
        } else if (score >= 60) {
            System.out.println("Sizin qiymetiniz : D");
        } else {
            System.out.println("Sizin qiymetiniz : F");
        }
    } else{
        System.out.println("Xeta: Score 0 ile 100 arasnda olmalidir!");
    }

}
*/

/*
Ucbucaq
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("a daxil et: ");
    int a = sc.nextInt();
    System.out.print("b daxil et: ");
    int b = sc.nextInt();
    System.out.print("c daxil et: ");
    int c =sc.nextInt();
    // Üçbucaq şərti
    if (a + b > c && a + c > b && b + c > a) {
        if (a == b && b == c) {
            System.out.println("Beraberterefli ucbucaq");
        } else if (a == b || a == c || b == c) {
            System.out.println(" Beraberyanli ucbucaq");
        } else {
            System.out.println(" Muxtelifterefli ucbucaq");
        }
    }else {
        System.out.println("Xeta : Bu tereflerle ucbucaq duzelmir!");
    }

}
*/



























