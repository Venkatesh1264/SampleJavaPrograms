public class SmartPinGeneration {
    public static void main(String[] args) {
        Integer firstNumber= Integer.parseInt(args[0]);
        Integer secondNumber = Integer.parseInt(args[1]);
        Integer thirdNumber = Integer.parseInt(args[2]);
        Integer fourthNumber = Integer.parseInt(args[3]);
        SmartPinGeneration smartPinGeneration = new SmartPinGeneration();

        Integer firstNumberLargeDigit = smartPinGeneration.getLargeDigit(firstNumber);
        Integer secondNumberLargeDigit = smartPinGeneration.getLargeDigit(secondNumber);
        Integer thirdNumberLargeDigit = smartPinGeneration.getLargeDigit(thirdNumber);
        Integer fourthNumberLargeDigit = smartPinGeneration.getLargeDigit(fourthNumber);

        Integer firstNumberSmallDigit = smartPinGeneration.getSmallDigit(firstNumber);
        Integer secondNumberSmallDigit = smartPinGeneration.getSmallDigit(secondNumber);
        Integer thirdNumberSmallDigit = smartPinGeneration.getSmallDigit(thirdNumber);
        Integer fourthNumberSmallDigit = smartPinGeneration.getSmallDigit(fourthNumber);


        Integer largeAmongAll = smartPinGeneration.getLargeDigit(Integer.parseInt(String.format("%d%d%d%d", firstNumberLargeDigit,secondNumberLargeDigit, thirdNumberLargeDigit, fourthNumberLargeDigit)));
        Integer smallAmongAll = smartPinGeneration.getSmallDigit(Integer.parseInt(String.format("%d%d%d%d", firstNumberSmallDigit,secondNumberSmallDigit, thirdNumberSmallDigit, fourthNumberSmallDigit)));
        System.out.println(String.format("Final output %d%d%d%d", firstNumberLargeDigit, secondNumberSmallDigit,largeAmongAll, smallAmongAll));
    }

    public Integer getSmallDigit(Integer number) {
        int small = number % 10;
        int reminder = 0;
        while(number>0) {
            reminder = number % 10;
            if(small > reminder) {
                small = reminder;
            }
            number = number/10;
        }
        return small;
    }
    public Integer getLargeDigit(Integer number) {
        int large = number % 10;
        int reminder = 0;
        while(number>0) {
            reminder = number % 10;
            if(large < reminder) {
                large = reminder;
            }
            number = number/10;
        }
        return large;
    }


}
