public class Main
{
    public static void main(String[] args)
    {
        int[] numbers={2,36,79,50,13,44,100,1};

        if(numbers==null || numbers.length==0){
            System.out.println("No numbers found");
            return;
        }
        int maxNumber= mmFunctions.getMaxNumber(numbers);
        System.out.println(maxNumber);
    }
}