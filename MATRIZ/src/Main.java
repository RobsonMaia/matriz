import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int[][] matriz3 = new int[3][3];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matriz3[i][j] + " ");
			}
			System.out.println("   ");
		}
		sc.close();
	}
}
