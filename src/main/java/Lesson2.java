public class Lesson2 {

    public static void main(String[] args) {
        System.out.println("Задание 1");
        invertArray();
        System.out.println("\n\nЗадание 2");
        fileArray();
        System.out.println("\n\nЗаданте 3");
        changArray();
        System.out.println("\n\nЗадание 4");
        fillDiagonal();


    }

    /**
     * 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
     * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
     */
    static void invertArray() {
        System.out.print("Initial:  ");
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if (arr[i] == 0) arr[i] = 1;
            else arr[i] = 0;
        }
        System.out.print("\nModified: ");
        for (int i : arr) {
            System.out.print(i + " ");

        }

    }

    /**
     * 2. Задать пустой целочисленный массив размером 8.
     * С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
     */

    static void fileArray(){
        int[] arr = new int[8];

        for (int i = 0, a = 0; i < arr.length; i++, a += 3) {
            arr[i] = a;
            System.out.print(arr[i] + " ");
        }
    }
    /* 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
     и числа меньшие 6 умножить на 2;*/

    static void changArray(){
        int[] w = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        System.out.print("Initial: ");
        for (int i : w) {
            System.out.print(i + " ");
        }

        System.out.print("\nModified:  ");
        for (int i = 0; i < w.length; i++) {
            if (w[i] < 6) w[i] *= 2;
            System.out.print(w[i] + " ");

        }

    }


    static void fillDiagonal() {
        int length = 4;

        int[][] arr = new int[length][length];
        for (int i = 0; i < length; i++) {
            for (int a = 0; a < length; a++) {
                if ((i == a) || (i == length - 1 - a)) {
                    arr[i][a] = 1;
                }
            }
        }
        
        for (int i = 0; i < length; i++) {
            for (int a = 0; a < length; a++) {
                System.out.print(arr[i][a] + " ");
            }
            System.out.println();
        }
    }
}
