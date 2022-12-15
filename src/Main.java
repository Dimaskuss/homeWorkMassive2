
public class Main {


    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {

        System.out.println("\nЗадача_1");
        int[] arr = generateRandomArray();

        int arrSum = 0;
        for (int i = 0; i < arr.length; i++) {
            arrSum += arr[i];
            //     System.out.println(arrSum); // проверка
            if (i == arr.length - 1) {
                System.out.println("Сумма трат за месяц составила " + arrSum + " рублей");
            }

        }
    }

    public static void task2() {

        System.out.println("\nЗадача_2");
        int[] arr = generateRandomArray();
        int spendingMax = -1;
        int spendingMin = 200000;

        for (final int current : arr) {
            if (current > spendingMax) {
                spendingMax = current;
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + spendingMax + " рублей");

        for (final int current : arr) {
            if (current < spendingMin) {
                spendingMin = current;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + spendingMin + " рублей");
    }


    public static void task3() {

        System.out.println("\nЗадача_3");
        int[] arr = generateRandomArray();

        double days = 30;
        double arrSum = 0;
        for (int i = 0; i < arr.length; i++) {
            arrSum += arr[i];

            if (i == arr.length - 1) {
                arrSum = arrSum / days;
                double result = Math.ceil(arrSum);
                System.out.println("Средняя сумма трат за месяц составила " + result + " рублей.");
            }

        }
    }

    public static void task4() {

        System.out.println("\nЗадача_4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >= 0 ; i--) {
            System.out.print(reverseFullName[i]);
        }
    }


}
