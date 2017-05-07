
public class MultiplesOf3And5 {
		static int a = 3;
		static int b = 5;
		static int c = 0;
		public static int getSum() {
			
			for (int i = 0; i < 1000; i++) {
				
				if(i % a == 0) c = c + i;
				else if(i % b == 0) c = c + i;
			}
			return c;
		}
		public static void main(String[]args) {
			getSum();
			System.out.println(c);
		}
}
