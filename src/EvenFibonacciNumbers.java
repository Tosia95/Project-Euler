
public class EvenFibonacciNumbers {
	static int a = 1;
	static int b = 2;
	static int c = 0;
	static int s = 3524577;
	static int sum = 0;
	static int[] fbn = new int[1000];
	
	public static int getFibonacci() {

			int i = 0;
			boolean p = false;
			while(!p) {
				
				
				if (a < b && a < c) { 
					a = b + c;
					fbn[i] = a;
				}
				else if (b < a && b < c) {
					b = a + c;
					fbn[i] = b;
				}
				else if (c < a && c < b) {
					c = a + b;
					fbn[i] = c;
				}
				if (a > s || b > s || c > s) p = true;
				i++;
			}
			
			for (int x = 0; x <= i; x++) {
				sum = sum + fbn[x];
			}
			
			return sum;

		}
	
	public static void main(String[]args) {
		getFibonacci();
		System.out.println(sum);
	}
	}

