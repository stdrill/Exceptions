import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_1{
    public static void main (String[] args) {
        while(true){
            try {
                System.out.println(nums());
                break;
            } catch (InputMismatchException e){
                System.out.println("Обнаружена ошибка! ");
            };
        }
    }

    public static float nums() {
        System.out.println("Введите дробное число: ");
        Scanner s = new Scanner(System.in);
        float num = s.nextFloat();
        s.close();
        return  num;
    }
 
    
}