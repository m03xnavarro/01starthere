import java.util.ArrayList;
import java.util.Iterator;

public class M0381_Fibonacci {

	public static void main(String[] args) {
		// Crearem un ArrayList d'enters
		ArrayList<Integer> fibonacci = new ArrayList<Integer>();
		for (int i = 0; i < 25; i++) {
			if (i == 0) {
				fibonacci.add(0);
			} else if (i == 1) {
				fibonacci.add(1);
			} else {
				fibonacci.add(fibonacci.get(i - 2) + fibonacci.get(i - 1));
			}
		}

		// Mostra els element amb índex i valor
		System.out.println("Bucle que mostra els elements amb índex i valor");
		for (int i = 0; i < fibonacci.size(); i++) {
			System.out.println("Index: " + i + " - Valor: " + fibonacci.get(i));
		}

		// Mostra els elements amb foreach

		System.out.println("Mostra els elements amb foreach");
		for (Integer valor : fibonacci) {
			System.out.println("Element: " + valor);
		}

		// Mostra els elements amb iterator
		// hasNext(): retorna true si hi ha més elements després
		// next(): retorna el següent element
		System.out.println("Mostra elements fent servir iterator");
		for (Iterator<Integer> it = fibonacci.iterator(); it.hasNext();) {
			System.out.println("Element iterat: " + it.next());
		}

		// A quina posició es troba el valor 2584
		// Checking index of an item
		int pos = fibonacci.indexOf(2584);
		System.out.println("El valor 2584 es troba a la posició: " + pos);

		// Hi trobem el valor 4311?
		boolean hiEs = fibonacci.contains(4311);
		System.out.println("Hi trobem el valor 4311? " + hiEs);
		
	}

}
