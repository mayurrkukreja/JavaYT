import java.util.Arrays;
public class ArrayPractice {
    public static void printArray(int[] arr) {
        System.out.print("[");
        for(int i = 0; i < arr.length; i++) {
            int element = arr[i];
            System.out.print(element);
            if(i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    public static void main(String[] args) {
        // integer array
        //  0   1   2   3   4
        // [12, 32, 24, 65, 90] length -> 5
        // initialize , declaration and allocation of an array

        int[] array1;
        int[] array2 = new int[5];
        int[] array3 = {12, 43, 64, 95, 94};

        array2 = new int[] {1, 34, 34, 32, 43};
        /*array2[0] = 45;
        array2[1] = 87;
        array2[2] = 56;
        array2[3] = 42;
        */

        String[] games = {"COD", "PUBG", "FAU-G"};

        //Display
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array3));
        System.out.println(Arrays.toString(games));

        System.out.println("Printing an array with my method !");

        printArray(array2);  //calling a method
        printArray(array3);

    }

}