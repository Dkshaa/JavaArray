public class SwappingArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {5, 6, 7, 8, 9};

        System.out.println("After Swapping");
        int[] tem = arr1;
        arr1 = arr2;
        arr2 = tem;
        printArray(arr1);
        printArray(arr2);
    }
    public static void printArray(int [] arr) {
        for (int num :arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }


}
