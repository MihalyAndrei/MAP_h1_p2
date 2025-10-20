public class mmFunctions {
    public static int getMaxNumber(int[] numbers) {
        int max=numbers[0];
        for(int number:numbers){
            if(max<number){
                max=number;
            }
        }
        return max;
    }

    public static int getMinNumber(int[] numbers) {
        int min=numbers[0];
        for(int number:numbers){
            if(min>number){
                min=number;
            }
        }
        return min;
    }

    public static int getmaxSum(int[] numbers) {
        int sum=0;
        for(int number:numbers){
            sum=sum+number;
        }
        int min=getMinNumber(numbers);
        return sum-min;
    }
}

