package services;

import java.util.Comparator;
import java.util.List;
import java.util.function.ToIntFunction;

import Interfaces.Usuarios;
import entites.Usuario;

public class Capitulo5 {

	public static void main(String[] args) {
//
//		/* 5.1 COMPARATORS COMO LAMBDA */
//
//		Usuario user1 = new Usuario("Paulo Silveira", 160);
//		Usuario user2 = new Usuario("Jan", 120);
//		Usuario user3 = new Usuario("Rodrigo Turini", 120);
//		Usuario user4 = new Usuario("Guilherme Silveira", 190);
//
//		List<Usuario> usuarios = new ArrayList<>();
//		usuarios.add(user1);
//		usuarios.add(user2);
//		usuarios.add(user3);
//		usuarios.add(user4);
//
////		/* comparator Tradicional */
//		Comparator<Usuario> comparatorTradicional = new Comparator<Usuario>() {
//			public int compare(Usuario u1, Usuario u2) {
//				return u1.getNome().compareTo(u2.getNome());
//			}
//		};
//
//		/* comparator Lambda */
//		Comparator<Usuario> comparatorLambda = (o1, o2) -> o1.getNome().compareTo(o2.getNome());
//
//		/* comparator que ja existe */
//		Comparator<Usuario> comparatorExistente = (o1, o2) -> String.CASE_INSENSITIVE_ORDER.compare(o1.getNome(),
//				o2.getNome());
//
//		Collections.sort(usuarios, comparatorTradicional);
//
//		usuarios.forEach(u -> System.out.println(u.getNome()));
//		System.out.println("------------------");
//		// --------------------------------------------
//
//		/* 5.2 O MÉTODO LIST.SORT */
//		Usuario user5 = new Usuario("D Brildo", 160);
//		Usuario user6 = new Usuario("B Paaulo", 120);
//		Usuario user7 = new Usuario("c Pio", 120);
//		Usuario user8 = new Usuario("a Carlos", 190);
//
//		List<Usuario> outrosUsuarios = new ArrayList<>();
//		outrosUsuarios.add(user5);
//		outrosUsuarios.add(user6);
//		outrosUsuarios.add(user7);
//		outrosUsuarios.add(user8);
//
//		outrosUsuarios.sort((u1, u2) -> String.CASE_INSENSITIVE_ORDER.compare(u1.getNome(), u2.getNome()));
//		outrosUsuarios.forEach(u -> System.out.println(u.getNome()));

//		Comparator<Usuario> comparatorDataNascimento = new Comparator<Usuario>() {
//			@Override
//			public int compare(Usuario o1, Usuario o2) {
//				return o1.getNacimento().compareTo(o2.getNacimento());
//			}
//		};

		Usuarios usuariosInterface = new Usuarios() {
		};
//		List<Usuario> users = usuariosInterface.listaDeUsuarios();
//		users.sort(comparatorDataNascimento);
//		users.sort((u1, u2) -> u1.getNome().compareToIgnoreCase(u2.getNome()));
//		users.sort(Comparator.comparing(u -> u.getNome().toUpperCase()));
//		users.forEach(user -> {
//			System.out.println(user.getNome());
//			System.out.println(user.getNacimento());
//		});
//
		// --------------------------------------------------

		/* 5.3 MÉTODOS ESTÁTICOS NA INTERFACE COMPARATOR */
		List<Usuario> usuarios = usuariosInterface.listaDeUsuarios();
//		users.sort(Comparator.comparing(u -> u.getNome().toUpperCase()));
//		users.forEach(user -> {
//			System.out.println(user.getNome());
//			System.out.println(user.getNacimento());
//		});
		/* 5.3.1 Indexando pela ordem natural */
//		List<String> palavras = Arrays.asList("Casa do Código", "Alura", "Caelum");
//		palavras.sort(Comparator.naturalOrder());
//		palavras.forEach(p -> System.out.println(p));

		/* 5.5 ORDENANDO POR PONTOS E O AUTOBOXING */

//		ToIntFunction<Usuario> extraiPontos = ;
//		Comparator<Usuario> comparator = Comparator.comparingInt(u -> u.getPontos());
//
//		usuarios.sort(comparator);
//		usuarios.forEach(Usuario::tornaModerador);
//		usuarios.forEach(u -> {
//			System.out.println(u.getNome());
//			System.out.println(u.getPontos());
//		});

	

	}
}
