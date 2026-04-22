public class MaxAndMin {
    static void maxValue(int [] arr){
        int max =arr[0];
        for(int i:arr){
            if(i>max){
                max=i;

            }
        }
        System.out.println("maximun is:"+max);
    }
    static void minValue(int[] arr){
        int min =arr[0];
        for (int j : arr) {
            if (j<min) {
                min = j;

            }
        }
        System.out.println("minimum is:"+min);
    }
    public static void main(String[] args){
        int []arr ={1,7,412,56,3};
        maxValue(arr);
        minValue(arr);

    }
}
