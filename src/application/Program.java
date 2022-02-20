package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<String> steps = new ArrayList<>();

		System.out.print("Informe o tamanho da escada: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			steps.add(" ".repeat(n - i) + "*".repeat(i + 1));
			
		}

		for (String s : steps) {
			System.out.println(s);

		}

		sc.close();

	}
}
