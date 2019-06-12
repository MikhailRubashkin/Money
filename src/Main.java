import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сумму в рублях: ");
        int money = sc.nextInt();

        int x = money % 100;
        int y = money % 10;
        if (x == 1 || y == 1)
            System.out.println(money + " рубль");
        if (x > 1 && x <= 4 || y > 1 && y <= 4)
            System.out.println(money + " рубля");
        if (x > 10 && x <= 20 || y < 10 && y >= 5)
            System.out.println(money + " рублей");

        }
    }
