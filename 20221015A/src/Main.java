import java.util.Scanner;

public class Main {
	
	

	public static int recursive(int num) {
		if(num == 0) {
			return 1;
		}else {
			return num * recursive(num - 1);
		}
	}
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		
		System.out.println(recursive(N));
	}
}