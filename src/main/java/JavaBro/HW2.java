package JavaBro;
import java.util.Random;
import java.util.Arrays;

public class HW2 {
    public static void main(String[] args) {
        ex4();
    }

    static void ex1() {
        int[] arr1 = {1, 0, 0, 1, 0, 0, 1, 1, 0, 1};
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 1) {
                arr1[i] = 0;
            } else {
                arr1[i] = 1;
            }
            System.out.print(" " + arr1[i]);
        }
    }

    static void ex2() {
        int[] arr2 = new int[8];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i * 3;
        }
        System.out.print(Arrays.toString(arr2));
    }

    static void ex3() {
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] *= 2;
            }

        }
        System.out.println(Arrays.toString(arr3));
    }

    static void ex4() {
        int[][] arr4 = new int[3][3];
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4.length; j++) {
                arr4[i][j] = j + 11;
                System.out.print(arr4[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < arr4.length; i++) {
            arr4[i][i] = 1;
            arr4[i][3 - i - 1] = 1;
        }
        for (int i=0; i<arr4.length;i++) {
            System.out.println();
            for (int j = 0; j < arr4.length; j++) {

                System.out.print(arr4[i][j] + " ");

            }
        }

    }

    static void ex5() {
        int[] arr5 = new int[10];
        int max = 0;
        int min = 999999;
        Random r = new Random();


        for (int i = 0; i < arr5.length; i++) {
            arr5[i] = (r.nextInt(1000000));
            if (arr5[i] > max) {
                max = arr5[i];
            } else if (arr5[i] < min) {
                min = arr5[i];
            }
        }
        System.out.println(Arrays.toString(arr5));
        System.out.println("Минимальный элемент массива = " + min);
        System.out.println("Максимальный элемент массива = " + max);

    }

    static void ex6() {
        int[] arr6 = new int[10];
        Random r = new Random();
        int a = 0;
        int b;
        for (int i = 0; i < arr6.length; i++)
            arr6[i] = (r.nextInt(5));
        System.out.println(Arrays.toString(arr6));
        for (int i = 0; i < arr6.length; i++) {
            a += arr6[i];
            b = 0;
            for (int j = i + 1; j < arr6.length; j++) {
                b += arr6[j];
            }
            if (a == b) {
                System.out.println("True");
                break;
            }
        }
    }

    static void ex61() {
        int[] arr6 = {2, 2, 2, 1, 2, 2, 10, 1};

        int a = 0;
        int b;
        for (int i = 0; i < arr6.length; i++) {
            a += arr6[i];
            b = 0;
            for (int j = i + 1; j < arr6.length; j++) {
                b += arr6[j];
            }
            if (a == b) {
                System.out.println("True");
                break;
            }
        }
    }

    static void ex7() {
        int[] arr7 = new int[10];
        int x;
        int n = -4;
        Random r = new Random();
        for (int i = 0; i < arr7.length; i++)
            arr7[i] = (r.nextInt(10));
        System.out.println(Arrays.toString(arr7));
        if (n > -1) {
            for (int i = 0; i < arr7.length - n; i++) {
                x = arr7[i];
                arr7[i] = arr7[i + n];
                arr7[i + n] = x;
                System.out.print(" " + arr7[i]);

            }
            System.out.println();
            for (int i = arr7.length - n; i < arr7.length; i++) {
                System.out.print(" " + arr7[i]);
            }
        }
        if (n < 0) {
            for (int i = arr7.length + n; i > 0; i--) {
                x = arr7[i];
                arr7[i] = arr7[i+n];
                arr7[i +n] = x;
                System.out.print(" " + arr7[i]);

            }
            System.out.println();
            for (int i = arr7.length; i < arr7.length + n; i--) {
                System.out.print(" " + arr7[i]);
            }
        }
    }
}



