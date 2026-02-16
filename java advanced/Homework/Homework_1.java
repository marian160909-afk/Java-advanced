package Homework;

public class Homework_1 {

    public static int findIndex(int[] arr, int target) {
        for (int i =0; i < arr.length; i++) {
            if (arr[i] == target) {
                return 1 + i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int target = 8;
        int index = findIndex(numbers, target);
        System.out.println("Indexul numarului " + target + " este: " + index);
    }
}
