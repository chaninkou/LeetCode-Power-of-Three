package powerOfthree;

public class CheckPowerOfThreeFunction {
    public boolean isPowerOfThree(int n) {
        // 3^19 is 1162261467 and 3^20 is bigger than int max
        
        return ( n > 0 && 1162261467 % n == 0);
    }
}
