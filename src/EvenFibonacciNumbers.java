
public class EvenFibonacciNumbers {
	static int a = 1;
	static int b = 2;
	static int c = 0;
	static int s = 3524577;
	static int sum = 0;
	static int[] fbn = new int[50];
	
	//suma parzystych wartosci ci¹gu Fibonacciego mniejszych od 4 000 000
	public static int getFibonacci() {

			int i = 0;
			boolean p = false;
			while(!p) {
				
				
				if (a < b && a < c) { 
					a = b + c;
					if(a%2==0){
					fbn[i] = a;
					}
				}
				else if (b < a && b < c) {
					b = c + a;
					if(b%2==0){
						fbn[i] = b;
						}
				}
				else if (c < a && c < b) {
					c = a + b;
					if(c%2==0){
						fbn[i] = c;
						}
				}
				if (a > s || b > s || c > s) p = true;
				i++;
			}
			
			for (int x = 0; x <= i; x++) {
				sum = sum + fbn[x];
				
			}
			sum = sum + 2; // pierwszym elementem tablicy jest 3 element ciągu, 
			//wiec nalezy dodac 2 element ciagu, ktory jest parzysty
			return sum;

		}
	
	public static void main(String[]args) {
		getFibonacci();
		System.out.println(sum);
	}
	}

