import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {

        System.out.println("Введите строку: ");
        Scanner s = new Scanner(System.in);
        if (s.nextLine().equals("")) {
            s.close();
            throw new RuntimeException("Пустые строки вводить нельзя!");
        }
        s.close();
    }
}
