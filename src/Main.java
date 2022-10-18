public class Main {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        int[] arr = generateRandomArray();
        int sumOfSpending = -1;
        for (int j : arr) {
            sumOfSpending += j;
        }
        System.out.println("Сумма трат за месяц составила " + sumOfSpending + " рублей");
    }
    public static void task2() {
        int[] arr = generateRandomArray();
        int maxSpending = 0;
        int minSpending = 200000;
        for (int current : arr) {
            if (current > maxSpending) {
                maxSpending = current;
            }
            if (current < minSpending) {
                minSpending = current;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSpending + " рублей. Максимальная сумма трат за день составила " + maxSpending + " рублей.");
    }

    public static void task3(){
        int[] arr = generateRandomArray();
        int sumOfSpending = 0;
        double averageSpending = 0;
        for (int current : arr) {
            if (current > sumOfSpending) {
                sumOfSpending += current;
            }
        }
        averageSpending = (double)sumOfSpending / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageSpending + " рублей.");
    }

    public static void task4(){
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }





}