import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		boolean check = false;
		sc.nextLine();
		for (int i = 0; i < T; i++) {
			String S = sc.nextLine();
			first_loop: for (int r = 0; r < S.length(); r++) {
				for (int c = r + 2; c <= S.length(); c++) {
					System.out.println("SUB: " + S.substring(r, c));
					check = primeBinary(S.substring(r, c));
					if (check) {
						System.out.println("Yes");
						break first_loop;
					} else
						check = false;
				}
			}
			if (!check)
				System.out.println("No");
		}
	}

	public static boolean primeBinary(String S) {
		int integer = 0;
		boolean check = true;
		for (int k = 0; k < S.length(); k++) {
			if (S.charAt(k) == '1') {
				integer += (int) Math.pow(2, (double) k);
			} else
				integer += 0;
		}
		System.out.println("Integer: " + integer);
		if (integer > 2) {
			for (int j = 2; j < integer; j++) {
				if (integer % j == 0) {
					check = false;
					break;
				}
			}
		} else
			check = false;
		return check;
	}
}