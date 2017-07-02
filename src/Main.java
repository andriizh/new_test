import java.util.Scanner;
/**
 * Created by andriiz on 28.06.17.
 */
public class Main {
    public static void main(String[] args) {
    while(true){
        Scanner scan = new Scanner(System.in);
        double a;
        double b;
        String operator;
        double result;
            System.out.print("Введіть a: ");
            if (scan.hasNextDouble()) {
                a = scan.nextDouble();
                System.out.print("Введіть дію, одну з:/,*,-,+: ");
                operator = scan.next();
                switch (operator) {
                    case "+":
                        System.out.print("Введіть b: ");
                        if (scan.hasNextDouble()) {
                            b = scan.nextDouble();
                            result = a + b;
                            System.out.println("Ващ результат: " + a + "+" + b + "=" + result);
                            break;
                        } else {
                            System.out.print("Error b must be number");
                            break;
                        }
                    case "-":
                        System.out.print("Введіть b: ");
                        if (scan.hasNextDouble()) {
                            b = scan.nextDouble();
                            result = a - b;
                            System.out.println("Ващ результат: " + a + "-" + b + "=" + result);
                            break;
                        } else {
                            System.out.print("Error b must be number");
                            break;
                        }
                    case "/":
                        System.out.print("Введіть b: ");
                        if (scan.hasNextDouble()) {
                            b = scan.nextDouble();
                            result = a / b;
                            System.out.println("Ващ результат: " + a + "/" + b + "=" + result);
                            break;
                        } else {
                            System.out.print("Error b must be number");
                            break;
                        }
                    case "*":
                        System.out.print("Введіть b: ");
                        if (scan.hasNextDouble()) {
                            b = scan.nextDouble();
                            result = a * b;
                            System.out.println("Ващ результат: " + a + "*" + b + "=" + result);
                            break;
                        } else {
                            System.out.println("Error b must be number");
                            break;
                        }
                    default:
                        System.out.println("Error Дія повинна бути одна з: /,*,-,+");

                }


            } else {
                System.out.println("Error a must be number");
            }
        }
    }}
