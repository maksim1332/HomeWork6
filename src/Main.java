public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!!");
        //tesk1
        System.out.println("Tesk 1--------------------------------------------------------------------------------");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        //tesk 2
        System.out.println("Tesk 2--------------------------------------------------------------------------------");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        //tesk 3
        System.out.println("Tesk 3--------------------------------------------------------------------------------");
        for (int i = 0; i < 17; i = i + 2) {
            System.out.println(i);
        }
        //tesk 4
        System.out.println("Tesk 4--------------------------------------------------------------------------------");
        for (int i = 10; i >= -10; i = i - 1) {
            System.out.println(i);
        }
        //tesk5
        System.out.println("Tesk 5--------------------------------------------------------------------------------");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + "год является високосным");
        }
        //tesk 6
        System.out.println("Tesk 6--------------------------------------------------------------------------------");
        for (int i = 7; i < 100; i = i + 7) {
            System.out.println(i);
        }
        //tesk 7
        System.out.println("Tesk 7--------------------------------------------------------------------------------");
        for (int i = 1; i < 1000; i = i * 2) {
            System.out.println(i);
        }
        //tesk 8
        System.out.println("Tesk 8--------------------------------------------------------------------------------");
        int sum = 29000;
        int savings = 0;
        for (int i = 0; i < 12; i++) {
            savings = savings + sum;
            System.out.println("Месяц " + i + " сумма накоплений равна " + savings + " рублей");
        }
        //tesk 9
        System.out.println("Tesk 9--------------------------------------------------------------------------------");
        int sum9 = 29000;
        int savings9 = 0;
        for (int i = 0; i < 12; i++) {
            savings9 = savings9 + sum9 / 100;
            savings9 = savings9 + sum9;
            System.out.println("Месяц " + i + " сумма накоплений равна " + savings9 + " рублей");
        }
        //tesk 10
        System.out.println("Tesk 10--------------------------------------------------------------------------------");
        int namber = 2;
        for (int i = 1; i <= 10; i++) {
            namber = 2 * i;
            System.out.println("2*" + i + "=" + namber);
        }
    }
}