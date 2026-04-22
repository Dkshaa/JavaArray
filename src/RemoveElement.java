import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args){
        int [] arr ={1,2,3,4,5};
        int remove=5;
        int count=0;

        for(int num: arr){
            if(num!=remove){
                count++;
            }
        }
        //in java you cant delete an element since arrays have fixed size,so you need to create new element
        int [] newArr = new int[count]; //size of array is 4 now
        int index=0;
        for(int num:arr){
            if(num!=remove){
                //first use the index and then increase  it index++
                newArr[index++] = num;
            }
        }
        System.out.println("Array after removing element:");
        System.out.println(Arrays.toString(newArr));
    }
}
