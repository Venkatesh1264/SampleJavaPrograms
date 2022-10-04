public class ArmstrongNumber {
    // ArmstongNumber => The mth digitnumber which is equals to the sum of mth power of each digits
    // 153 => 1*1*1 + 5*5*5 + 3*3*3 = 1 + 125 + 27 = 153
    // 153 => 3*3*3 + 5*5*5 + 1*1*1 = 27+125+1 = 153
    public static void main(String[] args) {
        ArmstrongNumber armstrongNumber = new ArmstrongNumber();
        int startValue = Integer.parseInt(args[0]);
        int endValue = Integer.parseInt(args[1]);
        int countOfArmstrongNumbers =0;
        for(int i=startValue; i<=endValue; i++) {
            int initialValue = i;
            int reminder = 0;
            int sum = 0;
            int lengthOfInputNumber = armstrongNumber.lengthOfNumber(initialValue);
            while (initialValue > 0) {
                reminder = initialValue % 10;
                sum = sum + armstrongNumber.power(reminder, lengthOfInputNumber);
                initialValue = initialValue / 10;
            }
            if (sum == i) {
                countOfArmstrongNumbers++;
                System.out.println("The given number is armstrong:" + i);
            }
        }
        System.out.println("The count of prime numbers between "+ startValue +" and "+ endValue+" is:"+ countOfArmstrongNumbers);
    }

    public int lengthOfNumber(int number) {
        int count  = 0;
        while(number > 0) {
            count ++;
            number = number / 10;
        }
        return count;
    }

    public int power(int value, int pow) {
        int powerResult = 1;
        while(pow>0) {
            powerResult = powerResult * value;
            pow--;
        }
        return powerResult;
    }
}
