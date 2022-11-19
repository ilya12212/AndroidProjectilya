import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Логин");
        String login = scanner.nextLine();
        System.out.println("Пароль");
        String password = scanner.nextLine();
        boolean rezultlogin = false;
        boolean rezultpassword = false;
        char[] log = login.toCharArray();
        char[] parol = password.toCharArray();
        for (char i : log) {
            if (Character.isUpperCase(i)) {
                rezultlogin = true;
                break;
            }
        }
        int count = 0;
        for (char i : parol) {
            if (Character.isUpperCase(i)) {
                count++;
            }
        }
        if (count == 1) {
            rezultpassword = true;
        }
        boolean s = login.equals(password);

        if (login.length() > 4 && login.length() < 10 && rezultlogin == true && rezultpassword == true && password.length() >= 6 && password.length() < 16 && s == false) {
            System.out.println("Вы прошли Регистрацию!\n" +
                    "Вам доступен Калькулятор");
            FileWriter writer = new FileWriter("File1.txt");
            writer.write(login);
            writer.write(password);
            writer.close();
            int finish = 0;
            while (finish == 0) {
                System.out.println("Введите 1 и 2ое число : ");
                int num1 = scanner.nextInt();
                int num2 = scanner.nextInt();
                System.out.println("Введите цифру знакa: (1=+,2=*,3=-,4=/)");
                int sign = scanner.nextInt();
                Calculator calculator = new Calculator(num1, num2);
                switch (sign) {
                    case 1:
                        calculator.plus();
                        break;
                    case 2:
                        calculator.multiply();
                        break;
                    case 3:
                        calculator.mines();
                        break;
                    case 4:
                        try {
                            calculator.division();
                        } catch (ArithmeticException e) {
                            System.out.println("Error!");
                        }
                        break;
                    default:
                        System.out.println("Error!");
                }
                System.out.println("Нажмите 0 - продолжения\n1 - завершения\n2 - Сменить пароль");
                finish = scanner.nextInt();
            }
        }
        else {
            System.out.println("Регистрация не пройдена, Попробуйте ещё раз!!!!");
        }

    }
}
