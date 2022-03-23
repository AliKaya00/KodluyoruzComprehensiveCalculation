import java.util.Scanner;

public class Calculation {

        static void plus() {
            Scanner scan = new Scanner(System.in);
            int number, result = 0, i = 1;
            while (true) {
                System.out.print(i++ + ". number :");
                number = scan.nextInt();
                if (number == 0) {
                    break;
                }
                result += number;
            }
            System.out.println("Result : " + result);
        }

        static void minus() {
            Scanner scan = new Scanner(System.in);
            System.out.print("How much you are going to add numerals :");
            int counter = scan.nextInt();
            int number, result = 0;

            for (int i = 1; i <= counter; i++) {
                System.out.print(i + ". number :");
                number = scan.nextInt();
                if (i == 1) {
                    result += number;
                    continue;
                }
                result -= number;
            }

            System.out.println("Result : " + result);
        }

        static void times() {
            Scanner scan = new Scanner(System.in);
            int number, result = 1, i = 1;

            while (true) {
                System.out.print(i++ + ". number :");
                number = scan.nextInt();

                if (number == 1)
                    break;

                if (number == 0) {
                    result = 0;
                    break;
                }
                result *= number;
            }

            System.out.println("Result : " + result);
        }

        static void divided() {
            Scanner scan = new Scanner(System.in);
            System.out.print("How much you are going to add numerals: ");
            int counter = scan.nextInt();
            double number, result = 0.0;

            for (int i = 1; i <= counter; i++) {
                System.out.print(i + ". number :");
                number = scan.nextDouble();
                if (i != 1 && number == 0) {
                    System.out.println("Second number shouldn't be 0.");
                    continue;
                }
                if (i == 1) {
                    result = number;
                    continue;
                }
                result /= number;
            }

            System.out.println("Result : " + result);
        }

        static void power() {
            Scanner scan = new Scanner(System.in);
            System.out.print("Sub numberal: ");
            int base = scan.nextInt();
            System.out.print("Up numeral: ");
            int exponent = scan.nextInt();
            int result = 1;

            for (int i = 1; i <= exponent; i++) {
                result *= base;
            }

            System.out.println("Result : " + result);
        }

        static void factorial() {
            Scanner scan = new Scanner(System.in);
            System.out.print("Insert numeral: ");
            int n = scan.nextInt();
            int result = 1;

            for (int i = 1; i <= n; i++) {
                result *= i;
            }

            System.out.println("Result : " + result);
        }
        static void mode() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("PLease insert number: ");
            int n= scanner.nextInt();
            System.out.println("PLease insert mode: ");
            int k= scanner.nextInt();
            int result;
            result = n%=k;
            System.out.println("Result: "+ result);
        }
        static void rectangle() {
            Scanner scan = new Scanner(System.in);
            System.out.println("Insert small one side: ");
            int n = scan.nextInt();
            System.out.println("Insert long one side: ");
            int k = scan.nextInt();
            int areaResult,primeterResult ;
            areaResult= n*k;
            System.out.println();
            primeterResult= 2*(n+k);
            System.out.println("Area Result: " + areaResult + "\nPrimeter Result: "+ primeterResult);
        }


    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int select;
            String menu = "1- Plus\n"
                    + "2- Minus\n"
                    + "3- Times\n"
                    + "4- Divided\n"
                    + "5- Power\n"
                    + "6- Factorial\n"
                    + "7- Mode\n"
                    + "8- Rectangle\n"
                    + "0- Exit";

            do {
                System.out.println(menu);
                System.out.print("PLease select an operation: ");
                select = scan.nextInt();
                switch (select) {
                    case 1:
                        plus();
                        break;
                    case 2:
                        minus();
                        break;
                    case 3:
                        times();
                        break;
                    case 4:
                        divided();
                        break;
                    case 5:
                        power();
                        break;
                    case 6:
                        factorial();
                        break;
                    case 7:
                        mode();
                        break;
                    case 8:
                        rectangle();
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("Invalid number, please try again!");
                }
            } while (select != 0);

        }
    }
