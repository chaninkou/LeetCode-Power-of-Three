package powerOfthree;

public class Main {
	public static void main(String[] args) {
		int n = 27;
		
		System.out.println("Input: " + n);
		
		CheckPowerOfThreeFunction solution = new CheckPowerOfThreeFunction();
		
		System.out.println("Power of three? " + solution.isPowerOfThree(n));
	}
}
