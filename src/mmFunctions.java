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
}

