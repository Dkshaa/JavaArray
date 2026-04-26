public class SeparateEvenOddStable {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] result = new int[arr.length];

        int index = 0;

        //  Add even numbers (in order)
        for (int num : arr) {
            if (num % 2 == 0) {
                result[index++] = num;
            }
        }

        // Add odd numbers (in order)
        for (int num : arr) {
            if (num % 2 != 0) {
                result[index++] = num;
            }
        }

        // Print result
        System.out.print("Stable rearranged array: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}