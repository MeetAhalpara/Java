import java.util.Arrays;
import java.util.Scanner;

public class Practice_test_06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        Practice 06
//        01
        float [] floatingNumber = {75.5f, 79.5f, 89.5f, 96.5f, 97.0f};
        float sum = 0;
        for (float elements : floatingNumber) {
            sum += elements;
        }
        for (int i = 0; i < floatingNumber.length; i++) {
            System.out.println(floatingNumber[i]);
        }
        System.out.println("The total value of above all is: " + sum);

//        02
        int[] practice02 = {78, 98 ,56 ,15 ,26, 86};
        System.out.println("Enter guess number between 0 to 100: ");
        int guess = sc.nextInt();
        boolean IsinArray = false;
        System.out.println("this is guess: " + guess);
        for (int element: practice02) {
            if (element == guess){
                IsinArray = true;
                break;
            }
        }
        if (IsinArray){
            System.out.println("The value of " + guess + " is in array");
        }else {
            System.out.println("The value of " + guess + " is not in array");
        }

//        03
        float[] floatNum = {75.5f, 79.5f, 89.5f, 96.5f, 97.0f};
        float total = 0;
        for (float elements : floatingNumber) {
            total += elements;
        }
        for (int i = 0; i < floatingNumber.length; i++) {
            System.out.println(floatingNumber[i]);
        }
        System.out.println("The average value of above all is: " + total/floatNum.length);

//        04
        int [][] matrix1 = {{1, 2, 3},
                            {4, 5, 6}};
        int [][] matrix2 = {{7, 8, 9},
                            {10, 11, 12}};
        int[][] result =  {{0, 0, 0},
                        {0, 0, 0}};
        for(int i = 0; i < matrix1.length; i++) {
            for(int j = 0; j < matrix1[i].length; j++) {
                result[i][j] =matrix1[i][j] + matrix2[i][j];
            }
        }
        for(int i = 0; i < result.length; i++) {
            for(int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println("");
        }


//        05
        int[] arr = {50, 96, 89, 78, 56};
        int l = arr.length;
        int n = Math.floorDiv(l, 2);
        int temp;

        for(int i=0; i<n; i++){
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;
        }
        for(int element: arr){
            System.out.print(element + " ");
        }

//      06
        int[] arrMax = {50, 96, 89, 78, 56};
        int maxSaver = arrMax[0];
        for(int m=0; m<arrMax.length; m++ ){
            if(arrMax[m] > maxSaver){
                maxSaver = arrMax[m];
            }
        }
        System.out.println("Maximum number among array is: " + maxSaver);

//        07
        int[] arrMin = {90, 96, 89, 78, 56};
        int minSaver = arrMin[0];
        for(int o=0; o<arrMin.length; o++){
            if(arrMin[o] < minSaver){
                minSaver = arrMin[o];
            }
        }
        System.out.println("Minimum number among array is: " + minSaver);

//        08
        int[] sort = {50, 96, 89, 78, 56};
        boolean isSortedAscending = true;
        for (int i = 0; i < sort.length; i++) {
            if (sort[i] > sort[i +   1]) {
                isSortedAscending = false;
                break;
            }
        }
        if (isSortedAscending) {
            System.out.println("The array is sorted in ascending order.");
        } else {
            System.out.println("The array is not sorted in ascending order.");
        }
    }
}