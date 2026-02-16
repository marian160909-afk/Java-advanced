package Homework;

public class Homework_2 {

    public static void main(String[] args) {
        int[] tablou = {1, 5, 4, 12};
        boolean result = isSorted(tablou);
        if (result) {
            System.out.println("Tabloul este sortat.");
        } else {
            System.out.println("Tabloul nu este sortat.");
        }
    }

    public static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                return false;
            }
        }
        return true;
    }
}