import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!!");
        //task1
        System.out.println("Task 1--------------------------------------------------------------------------------");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        //task 2
        System.out.println("Task 2--------------------------------------------------------------------------------");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        //task 3
        System.out.println("Task 3--------------------------------------------------------------------------------");
        for (int i = 0; i < 17; i = i + 2) {
            System.out.println(i);
        }
        //task 4
        System.out.println("Task 4--------------------------------------------------------------------------------");
        for (int i = 10; i >= -10; i = i - 1) {
            System.out.println(i);
        }
        //task5
        System.out.println("Task 5--------------------------------------------------------------------------------");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + "год является високосным");
        }
        //task 6
        System.out.println("Task 6--------------------------------------------------------------------------------");
        for (int i = 7; i < 100; i = i + 7) {
            System.out.println(i);
        }
        //task 7
        System.out.println("Task 7--------------------------------------------------------------------------------");
        for (int i = 1; i < 1000; i = i * 2) {
            System.out.println(i);
        }
        //task 8
        System.out.println("Task 8--------------------------------------------------------------------------------");
        int sum = 29000;
        int savings = 0;
        for (int i = 0; i < 12; i++) {
            savings = savings + sum;
            System.out.println("Месяц " + i + " сумма накоплений равна " + savings + " рублей");
        }
        //task 9
        System.out.println("Task 9--------------------------------------------------------------------------------");
        double sum9 = 29000;
        double  savings9 = 0;
        double rate = 1.01;
        for (int i = 1; i <= 12; i++) {
            savings9 = savings9 * rate + sum9;
            System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей\n", i,  savings9);
        }
        //task 10
        System.out.println("Task 10--------------------------------------------------------------------------------");
        int namber = 2;
        for (int i = 1; i <= 10; i++) {
            namber = 2 * i;
            System.out.println("2*" + i + "=" + namber);
        }
        //+task
        System.out.println("+Task-----------------------------------------------------------");
        //=
        System.out.println("Hello world!!");
        System.out.println("Hello world!!!");
        //--
        System.out.print("Hello world!!");
        System.out.print("Hello world!!!");
        //--%
        System.out.println();
        int x = 4;
        int y = 5;
        System.out.printf("x=%d;y=%d\n", x, y);
        //==%
        System.out.println("Main.main");
        System.out.println("args = " + Arrays.toString(args));
        System.out.println("y = " + y);
    }
}