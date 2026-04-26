import java.util.Scanner;

public class IntegerDuplicate {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of elements");
        int n=sc.nextInt();

        int []arr=new int[n];

        //Taking Array i/p
        System.out.println("Enter The Array");
        for(int i = 0; i< n; ++i){
          arr[i]=sc.nextInt();

        }
        boolean found =false;

        //check duplicates
        for(int i=0;i<n;++i){
            for(int j=i+1;j<n;++j){
                if(arr[i]==arr[j]){
                    found=true;
                    System.out.print(arr[i]+" "+"is the duplicate number");
                    break;
                }
            }
        }
        if(!found){
            System.out.print("No duplicates found");
        }
    }
}
