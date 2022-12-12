public class Main {
    public static void main(String[] args) {
        //task1();
        //task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задание 1:");
        int[] first = new int[3];
        first[0] = 1;
        first[1] = 2;
        first[2] = 3;

       /* for (int i = 0; i < 3; i++) {
            System.out.println(first[i]);
            }*/

        double[] second = {1.57, 7.654, 9.986};

        /*for (int i = 0; i < 3; i++) {
            System.out.println(second[i]);
            }*/

        char[] third = {83, 75, 89};

        /*for (int i = 0; i < 3; i++) {
            System.out.print(third[i]);
            }*/
    }

    public static void task2() {
        System.out.println("Задание 2:");
        int[] first = new int[3];
        first[0] = 1;
        first[1] = 2;
        first[2] = 3;

        for (int i = 0; i < 3; i++) {
            System.out.print(first[i]);
            if (i < 2) {
                System.out.print(", ");
            } else System.out.println();
            }

        double[] second = {1.57, 7.654, 9.986};

        for (int i = 0; i < 3; i++) {
            System.out.print(second[i]);
            if (i < 2) {
                System.out.print(", ");
            } else System.out.println();
            }

        char[] third = {83, 75, 89};

        for (int i = 0; i < 3; i++) {
            System.out.print(third[i]);
            if (i < 2) {
                System.out.print(", ");
            } else System.out.println();
            }
    }

    public static void task3() {
        System.out.println("Задание 3:");
        int[] first = new int[3];
        first[0] = 1;
        first[1] = 2;
        first[2] = 3;

        for (int i = 2; i >= 0; i--) {
            System.out.print(first[i]);
            if (i > 0) {
                System.out.print(", ");
            } else System.out.println();
        }

        double[] second = {1.57, 7.654, 9.986};

        for (int i = 2; i >= 0; i--) {
            System.out.print(second[i]);
            if (i > 0) {
                System.out.print(", ");
            } else System.out.println();
        }

        char[] third = {83, 75, 89};

        for (int i = 2; i >= 0; i--) {
            System.out.print(third[i]);
            if (i > 0) {
                System.out.print(", ");
            } else System.out.println();
        }
    }
}

