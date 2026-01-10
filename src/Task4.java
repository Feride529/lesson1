import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Valyuta çevirici");
            System.out.println("Çıxmaq üçün 0 yaz");
            System.out.print("Məbləği daxil et: ");
            double amount = sc.nextDouble();

            if (amount == 0) {
                System.out.println("Proqram bitdi");
                break;
            }

            System.out.print("From (AZN, USD, EUR): ");
            String from = sc.next().toUpperCase();

            System.out.print("To (AZN, USD, EUR): ");
            String to = sc.next().toUpperCase();

            double result = 0;
            boolean supported = true;

            if (from.equals("AZN") && to.equals("USD")) {
                result = amount * 0.59;
            } else if (from.equals("AZN") && to.equals("EUR")) {
                result = amount * 0.54;
            } else if (from.equals("USD") && to.equals("AZN")) {
                result = amount * 1.70;
            } else if (from.equals("EUR") && to.equals("AZN")) {
                result = amount * 1.85;
            } else if (from.equals(to)) {
                result = amount;
            } else {
                supported = false;
            }

            if (supported) {
                System.out.println("Nəticə: " + result + " " + to);
            } else {
                System.out.println("Xəta: Dəstəklənməyən valyuta!");
            }

            System.out.println("---------------------");
        }

        sc.close();
    }
}

/* BMI*/
 /* public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("BMI Hesablayıcı");
            System.out.println("Çıxmaq üçün çəki olaraq 0 yaz");

            System.out.print("Çəki (kg): ");
            double weight = sc.nextDouble();

            if (weight == 0) {
                System.out.println("Proqram bitdi");
                break;
            }

            System.out.print("Boy (metr ilə, məsələn 1.70): ");
            double height = sc.nextDouble();

            double bmi = weight / (height * height);

            System.out.println("Sizin BMI: " + bmi);

            if (bmi < 18.5) {
                System.out.println("Kateqoriya: Zəif");
            } else if (bmi < 25) {
                System.out.println("Kateqoriya: Normal");
            } else if (bmi < 30) {
                System.out.println("Kateqoriya: Artıq çəki");
            } else {
                System.out.println("Kateqoriya: Piylənmə");
            }

            System.out.println("----------------------");
        }

        sc.close();
    }*/
    /* VERGİ HESABLAYICI*/
  /*  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Vergi Hesablayıcı");
            System.out.println("Çıxmaq üçün maaş olaraq 0 yaz");

            System.out.print("Aylıq maaş: ");
            double monthlySalary = sc.nextDouble();

            if (monthlySalary == 0) {
                System.out.println("Proqram bitdi");
                break;
            }

            System.out.print("Residentdir? (beli/xeyr): ");
            String answer = sc.next().toLowerCase();
            boolean isResident = answer.equals("beli");

            double tax = 0;

            if (isResident) {
                if (monthlySalary <= 500) {
                    tax = 0;
                } else if (monthlySalary <= 2000) {
                    tax = (monthlySalary - 500) * 0.10;
                } else {
                    tax = (1500 * 0.10) + (monthlySalary - 2000) * 0.15;
                }
            } else {
                tax = monthlySalary * 0.20;
            }

            double netSalary = monthlySalary - tax;

            System.out.println("Tutulan vergi: " + tax);
            System.out.println("Net maaş: " + netSalary);
            System.out.println("-----------------------");
        }

        sc.close();
*/
        /*GRADE KALKULYATOR*/
      /*  public static void main(String[] args){
        }
            Scanner sc = new Scanner(System.in);

            while (true) {
                System.out.print("Score (0-100): ");
                if (!sc.hasNextInt()) {
                    System.out.println("Xəta: Zəhmət olmasa rəqəm daxil edin!");
                    sc.next();
                    continue;
                }
                int score = sc.nextInt();

                if (score < 0 || score > 100) {
                    System.out.println("Xəta: Score 0 ilə 100 arasında olmalıdır!");
                    continue;
                }


                String grade;
                if (score >= 90) {
                    grade = "A";
                } else if (score >= 80) {
                    grade = "B";
                } else if (score >= 70) {
                    grade = "C";
                } else if (score >= 60) {
                    grade = "D";
                } else {
                    grade = "F";
                }

                System.out.println("Sizin qiymətiniz: " + grade);
                System.out.println("---");
            }
        } */

/* TAXİ HAQQI HESABLAYICI*/

  /* public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Taksi qiyməti kalkulyatoru başladı. Çıxmaq üçün 'exit' yazın.");


        while (true) {
            System.out.print("Məsafəni daxil edin (km): ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            double distanceKm = Double.parseDouble(input);
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

            // Endirimlər
            if (age < 12) {
                total = total * 0.50; // 50% endirim
            } else if (age >= 65) {
                total = total * 0.70; // 30% endirim
            }

            System.out.println("Yekun məbləğ: " + total + " AZN");
            System.out.println("-------------------------");
        }
        scanner.close();
    }
*/
/* ÜÇBUCAQ*/
   /* public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Üçbucaq kalkulyatoru başladı. Çıxmaq üçün 'exit' yazın.");

        while (true) {
            System.out.print("a daxil et (və ya 'exit'): ");
            if (!sc.hasNextInt()) {
                if (sc.next().equalsIgnoreCase("exit")) {
                    break; // 'exit' yazılarsa döngüdən çıx
                }
                System.out.println("Xəta: Zəhmət olmasa rəqəm daxil edin!");
                continue;
            }
            int a = sc.nextInt();

            System.out.print("b daxil et: ");
            int b = sc.nextInt();

            System.out.print("c daxil et: ");
            int c = sc.nextInt();


            // Üçbucaq şərti
            if (a + b > c && a + c > b && b + c > a) {
                if (a == b && b == c) {
                    System.out.println("Nəticə: Beraberterefli ucbucaq");
                } else if (a == b || a == c || b == c) {
                    System.out.println("Nəticə: Beraberyanli ucbucaq");
                } else {
                    System.out.println("Nəticə: Muxtelifterefli ucbucaq");
                }
            } else {
                System.out.println("Nəticə: Xeta: Bu tereflerle ucbucaq duzelmir!");
            }
            System.out.println("--------------------------------");
        }
        sc.close();
    }
*/

