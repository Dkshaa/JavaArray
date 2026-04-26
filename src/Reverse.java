public class Reverse {

    public static void main(String []args){
        int []  arr ={1,2,4,5,6};
        int [] reversedArray =new int[arr.length];
        for(int i=0;i<arr.length;++i){
            reversedArray[i]=arr[arr.length-1-i];
        }
        for(int num:reversedArray){
            System.out.print(num+" ");
        }

    }
}
