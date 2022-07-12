package services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

import entity.Usuario;

public class Mostrador extends AbstractUsuarios {

	public static void main(String... args) {
//
//		List<String> strings = new ArrayList<>();
//		strings.add("Jan");
//		strings.add("Samara");
//		strings.add("Brenda");
//		strings.add("");
//		strings.add("Ana");
//		strings.add("Flavia");
//		strings.add("");
//		strings.add("Marcos");
//		List<Integer> integers = new ArrayList<Integer>();
//		integers.add(1);
//		integers.add(5);
//		integers.add(9);
//		integers.add(3);
//		integers.add(7);
//		integers.add(0);
//		integers.add(8);
//		integers.add(2);
//		integers.add(6);
//		integers.add(4);

//		strings.removeIf(s -> s.equals(""));
//		strings.sort(Comparator.reverseOrder());
//		strings.forEach(s -> {
//			System.out.println(s);
//		});

//		integers.removeIf(i -> i.equals(0));
//		integers.sort((i1, i2) -> i1.compareTo(i2));
//		integers.forEach(i -> System.out.println(i));
//		usuarios.sort((u1,u2) -> u1.getPontos().compareTo(u2.getPontos()));
		usuarios.sort(Comparator.comparing(new Function<Usuario, String>() {
			@Override
			public String apply(Usuario t) {
				return t.getNome().toUpperCase();
			}
		}).thenComparingInt(Usuario::getPontos));
		usuarios.forEach(u -> {
			System.out.println(u.getNome().concat("/").concat(u.getPontos().toString()));
		});
	}
}
