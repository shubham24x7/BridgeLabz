import java.util.Scanner;

public class PatternDiamondEmpty {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int sp = n / 2, st = 1, i, z = 1;

		for (i = 1; i <= n; i++) {
			for (int j = 1; j <= sp; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= st; j++) {

				if (j == 1 || j == st)
					System.out.print("*");
				else if (j / 2 != 0 && j == i) {
					if (i <= (n + 1) / 2) {
						if(z<10) {
						
							System.out.print("0"+z);
							//z++;
						}
						if(z>=10) {
							System.out.print(z);
							//z++;
						}
						z++;
					} else
						System.out.print(" ");
				}

				else if ((i + j) == n + 1) {
					if (j <= (n) / 2) {
						if(z<10) {
						System.out.print("0"+z);
						//z++;
						}
						if(z>=10) {
							System.out.print(z);
							//z++;
						}
						z++;						
					} else {
						System.out.print(" ");
					}

				}

				else
					System.out.print(" ");

			}
			System.out.println();
			if (i <= n / 2) {
				sp = sp - 1;
				st = st + 2;
			} else {
				sp = sp + 1;
				st = st - 2;
				// System.out.println(st);
			}

		}
		s.close();
	}
}
