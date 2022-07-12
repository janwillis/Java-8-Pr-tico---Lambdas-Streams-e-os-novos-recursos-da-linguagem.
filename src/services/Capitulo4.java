package services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Predicate;

import entites.Usuario;

public class Capitulo4 {
	public static void main(String... args) {

		// 4.2//////////////////////////////////////////////////
		Usuario user1 = new Usuario("Paulo Silveira", 160);
		Usuario user2 = new Usuario("Jan", 120);
		Usuario user3 = new Usuario("Rodrigo Turini", 120);
		Usuario user4 = new Usuario("Guilherme Silveira", 190);
//		List<Usuario> usuarios = Arrays.asList(user1, user2, user3);
//		Consumer<Usuario> mostraMensagem = u -> System.out.println("antes de imprimir os nomes");
//		Consumer<Usuario> imprimeNome = u -> System.out.println(u.getNome());
//		/*
//		 * O metodo 'andThen' serve para compor instâncias da interface Consumer para
//		 * que possam ser executadas sequencialmente
//		 */
//		usuarios.forEach(mostraMensagem.andThen(imprimeNome));
		/////////////////////////////////////////////////////////
//
		// 4.3 MAIS	UM NOVO MÉTODO EM COLLECTION:REMOVEIF
///////////////////////////////////////////
//		
		/* Declaração tradicional */
//		Predicate<Usuario> predicado = new Predicate<Usuario>() {
//			public boolean test(Usuario u) {
//				return u.getPontos() > 160;
//			}
//		};

		/* Declaração lambda */
		Predicate<Usuario> predicadoPaulo = u -> Objects.equals(u.getNome(), "Paulo Silveira");
		Predicate<Usuario> predicadoJan = u -> Objects.equals(u.getNome(), "Jan");

		List<Usuario> usuarios = new ArrayList<>();
		usuarios.add(user1);
		usuarios.add(user2);
		usuarios.add(user3);
		usuarios.add(user4);

		usuarios.removeIf(predicadoPaulo.or(predicadoJan));
		usuarios.forEach(u -> System.out.println(u.getNome()));

	}
}
