
public class RecursionCh12 {
	public static int fib(int n) {
		if(n <= 1)
			return n; // base case
		else
			return fib(n-1) + fib(n-2); // recursive code
	}
	public static int sum(int target) {
		if(target <= 0) //base case
			return 0;
		else
			return target + sum(target-1); //recursive code
	}
	public static int product(int a) {
		if(a <= 1)
			return a;
		else
			return a * product(a-1);
	}
	public static int sumOfTwoNumbers(int a, int b) {
		int answer = 0;
		if(a <= 0) {
			answer = 0;
			return 0;
		}
		else {
			for(int i = a; i <= b; ++i) {
				answer += i;
			}
			return answer;
		}
		
	}
	public static void main(String[] args) {
		int n = 10;
		int result = sum(n); //55
		System.out.println(result);
		int f = fib(6); //21
		System.out.println(f);
		
		int t = product(6);
		System.out.println(t);
		
		int o = sumOfTwoNumbers(2,7);
		System.out.println("Sum in between two numbers = "+ o);
		
	}
	
	//Write a recursive method for the product of all number's from 1 to target number
	
	//Write a recursive that calculates the sum of all numbers in between of two numbers
	
	// Put on Git
}
