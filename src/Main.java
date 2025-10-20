import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        int[] numbers={2,36,79,50,13,44,100,1};

        if(numbers==null || numbers.length==0){
            System.out.println("No numbers found");
            return;
        }
        //1
        System.out.print("Max number: ");
        int maxNumber= mmFunctions.getMaxNumber(numbers);
        System.out.println(maxNumber);

        //2
        System.out.print("Min number: ");
        int minNumber= mmFunctions.getMinNumber(numbers);
        System.out.println(minNumber);

        //3
        System.out.print("Max sum of n-1: ");
        int maxSum=mmFunctions.getmaxSum(numbers);
        System.out.println(maxSum);


    }



}