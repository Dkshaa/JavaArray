public class SecondLargest {
    public static void main(String []args){
        int []arr ={10,20,5,30,25};
        int lar=Integer.MIN_VALUE;
        int secondLar=Integer.MIN_VALUE;;

        for(int num:arr){
            if(num > lar){
                secondLar=lar;
                lar=num;
            } else if (num > secondLar && num!= lar) {
                secondLar=num;

            }

        }
        System.out.println("Second Largest number is" + " "+ secondLar);
    }
}
