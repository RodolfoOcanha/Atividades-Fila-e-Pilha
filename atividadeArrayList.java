package atividadeCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class atividadeArrayList {

	public static void main(String[] args) {
		ArrayList<String> cores = new ArrayList<String>();
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite 5 cores:");
		for (int i = 0; i < 5; i++) {
			cores.add(leia.next());
		}

		System.out.println("Liste todas as cores:" + cores);
		Collections.sort(cores);
		System.out.println("Ordenar as cores: " + cores);

	}

}
