public class ArrayContainsSpecificValue {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int search = 00;
        boolean found = false;

        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] == search) {
                found = true;
                System.out.println("Array contains value at index" + i);
                break;
            }
        }
            if (!found) {
                System.out.println("Array doesnot contain value ");
            }


    }
}

