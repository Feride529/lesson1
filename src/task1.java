import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    }
}
   /*   System.out.println("Menyu seçimi et:");
      System.out.println("1. Valyuta çevirici");
      System.out.println("2. BMI hesablayıcı");
      System.out.println("3. Vergi hesablayıcı");
      System.out.println("4. Grade kalkulyatoru");
      System.out.println("5. Taksi haqqı hesablayıcı");
      System.out.println("6. Üçbucaq növü təyini");
      System.out.print("Seçiminizi daxil edin: ");

      int menyu = sc.nextInt();

   /*     switch (menyu) {
            case 1:
             System.out.println("1. Valyuta çevirici");

            System.out.print("Məbləği daxil edin: ");
            double amount = sc.nextDouble();

            System.out.print("Hansından (AZN,USD,EUR): ");
            String from = sc.next().toUpperCase();

            System.out.print("Hansına ( AZN,USD,EUR): ");
            String to = sc.next().toUpperCase();

            double result;
            String key = from + "_" + to;
            switch (key) {
                case "AZN_USD":
                    result = amount * 0.59;
                    break;
                case "AZN_EUR":
                    result = amount * 0.54;
                    break;
                case "USD_AZN":
                    result = amount * 1.70;
                    break;
                case "EUR_AZN":
                    result = amount * 1.85;
                    break;

                case "AZN_AZN":
                case "USD_USD":
                case "EUR_EUR":
                    result = amount;
                    break;
                default:
                    System.out.println("Xəta: Dəstəklənməyən valyuta kodu!");
                    return;
            }

            System.out.println("Nəticə:" + result + " " + to) {;
        }
     break;

        case 2:
         /*
            System.out.print("Çəki (kg):");
            float weightKg = sc.nextFloat();
            System.out.print("Boy (sm):");
            int heightCm = sc.nextInt();
            double heightM = heightCm / 100.0;
            double bmi = weightKg / (heightM * heightM);

            int bmiType;

            if (bmi < 18.5)
                bmiType = 1;
            else if (bmi < 25)
                bmiType = 2;
            else if (bmi < 30)
                bmiType = 3;
            else
                bmiType = 4;

            String category;

            switch (bmiType) {
                case 1:
                    category = "Zəif çəkili";
                    break;
                case 2:
                    category = "Normal";
                    break;
                case 3:
                    category = "Artıq çəkili";
                    break;
                case 4:
                    category = "Obez";
                    break;
                default:
                    category = "Naməlum";
            }
            System.out.println("BMI: " + bmi + "  " + category);
        }
*/
// 3 VERGİ
        /*
        System.out.print("Aylıq maaşı daxil edin:");
        double monthlySalary = sc.nextDouble();
            System.out.print("Residentdir?(true/false və ya bəli/xeyr):");
            String input = sc.next().toLowerCase();
            boolean isResident;
            if (input.equals("true") || input.equals("bəli")) {
                isResident = true;
            else
                isResident = false;

            double tax = 0;
            if (isResident) {
                if (monthlySalary <= 500) {
                    tax = 0;
                else if (monthlySalary <= 2000) {
                    tax = (monthlySalary - 500) * 0.10;
                 else
                    tax = (2000 - 500) * 0.10; // əvvəlki hissə
                    tax += (monthlySalary - 2000) * 0.15;

            } else {
                tax = monthlySalary * 0.20;
            }
            double netSalary = monthlySalary - tax;
            System.out.println("Tutulan vergi:" + tax);
            System.out.println("Net maaş:" + netSalary);

        */

//4 GRADE
/*
            System.out.print("Score(0-100):");
            int score = sc.nextInt();
            if (score < 0 || score > 100) {
                System.out.println("Xəta:Score 0 ilə 100 arasında olmalıdır!");
                return;
            }
            switch (score / 10) {
                case 10: //100
                case 9: //90-99
                    System.out.println("Sizin qiymətiniz: A");
                    break;
                case 8: // 80-89
                    System.out.println("Sizin qiymətiniz: B");
                    break;
                case 7: // 70-79
                    System.out.println("Sizin qiymətiniz: C");
                    break;
                case 6: // 60-69
                    System.out.println("Sizin qiymətiniz: D");
                    break;
                default: // 0-59
                    System.out.println("Sizin qiymətiniz: F");

    */

// 5 TAKSİ

/*
            double distanceKm = 10.5;
            boolean night = true;
            byte age = 70;

            double openingFee = 1.00;
            double pricePerKm = 0.70;

            // Gecə əlavəsi
            if (night) {
                pricePerKm += 0.10;
            }
            // Ümumi məbləğ (endirimsiz)
            double total = openingFee + (distanceKm * pricePerKm);
            //Endirimlər
            if (age < 12) {
                total *= 0.50;  // 50% endirim
            } else if (age >= 65) {
                total *= 0.70;  // 30% endirim
            }
            System.out.println("Yekun məbləğ: " + total + "AZN");

        }
*/
// 6 ÜÇBUCAQ
/*
        System.out.print("a daxil et: ");
        int a = sc.nextInt();
        System.out.print("b daxil et: ");
        int b = sc.nextInt();
        System.out.print("c daxil et: ");
        int c = sc.nextInt();
        int type; // 1-bərabərtərəfli, 2-bərabəryanlı, 3-müxtəlif,0-xəta

        //Üçbucağın şərti
        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                type = 1;
            } else if (a == b || a == c || b == c) {
                type = 2;
            } else {
                type = 3;
            }
        } else {
            type = 0;
        }
*/
      /*  // switch-case
        switch (type) {
            case 1:
                System.out.println("Bərabərtərəfli üçbucaq");
                break;
            case 2:
                System.out.println("Bərabəryanlı üçbucaq");
                break;
            case 3:
                System.out.println("Müxtəliftərəfli üçbucaq");
                break;
            default:
                System.out.println("Xəta: Bu tərəflərlə üçbucaq düzəlmir!");


        }
 */