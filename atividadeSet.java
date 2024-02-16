package atividadeCollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;


public class atividadeSet {

	public static void main(String[] args) {
		Set<Integer> setNum = new HashSet<Integer>();
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite 10 valores:");
		for (int i = 0; i < 10; i++) {
			setNum.add(leia.nextInt());


		}
		System.out.println("Listar dados do Set:" + setNum);
		
		Iterator<Integer> isetNum = setNum.iterator();
		while (isetNum.hasNext()) {
			System.out.println(isetNum.next());
		}
	}
}