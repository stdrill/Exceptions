public class Task_2 {
    public static void main(String[] args) {
        try {
            int[] intArray = new int[7]; // или null можно тут вписать еще для проверки
            int d = 2;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (IndexOutOfBoundsException | NullPointerException | ArithmeticException e) {
            System.out.println("Catching exception: " + e.getMessage());
        }

    }
}
