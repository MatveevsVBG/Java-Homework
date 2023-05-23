public class Main {
    public static void main(String[] args) {

        System.out.println("Простые числа от 1 до 1000");

        for (int number = 2; number <= 1000; number++) {
            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(number);
            }
        }
    }
}
