import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Calc {
    public static void main(String[] args) {
        String[] strList = consoleInput();
        for (String s : strList) {
            if (!Pattern.matches("[0-9+*/-]+", s)) {
                System.out.println("Ошибка.Неправильно введено выражение.");
                return;
            }
        }

        System.out.println("Ответ: " + calc(strList));
    }

    public static String[] consoleInput() {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] string = str.split( " ");
        return string;
    }

    public static int calc(String[] str){
        int first, second, res=0;
        first = Integer.parseInt(str[0]);
        second = Integer.parseInt(str[2]);
        switch (str[1]) {
            case "+":
                res = first + second;
                break;
            case "-":
                res = first - second;
                break;
            case "*":
                res = first * second;
                break;
            case "/":
                try {
                    res = first / second;
                } catch (ArithmeticException e) {
                    System.out.println("Ошибка.На 0 делить нельзя");
                    System.exit(0);
                }
        }
        return res;
    }
}
