package powerOfthree;

public class CheckPowerOfThreeFunction {
	public boolean isPowerOfThree(int n){
		// If n is zero and we don't have a base case, it will forever running the while loop
		if(n == 0){
			return false;
		}
		
		// Keep dividing the n by 3 when mod 3 is 0
		while(n % 3 == 0){
			n = n / 3;
		}
		
		// Remember that 1 is a power of 3 because 1^3 = 1
		// If n is 1 at the end, return true
		return n == 1;
	}
	
	// Funny solution, won't really use it, this is without using a loop
//    public boolean isPowerOfThree(int n) {
//        // 3^19 is 1162261467 and 3^20 is bigger than int max
//        
//        return ( n > 0 && 1162261467 % n == 0);
//    }
}
