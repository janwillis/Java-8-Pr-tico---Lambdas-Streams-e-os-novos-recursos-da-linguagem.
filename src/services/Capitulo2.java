package services;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

import entity.Usuario;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class Capitulo2 {

	public static void main(String[] args) {
		Usuario user1 = new Usuario("Paulo Silveira", 150);
		Usuario user2 = new Usuario("Rodrigo Turini", 120);
		Usuario user3 = new Usuario("Guilherme Silveira", 190);
		List<Usuario> usuarios = Arrays.asList(user1, user2, user3);

//
//
//		Consumer<Usuario> mostrador = u -> {
//			System.out.println(u.getNome());
//		};
//		
		usuarios.forEach(new Consumer<Usuario>() {
			// o metodo accept recebe um objeto por parametro e executa uma ação
			// especificada
			public void accept(Usuario usuario) {
				System.out.println(usuario.getNome());
			}
		});
		System.out.println("");
		System.out.println("O mesmo funcionalidade só que com lambda");
		usuarios.forEach(u -> {
			System.out.println(u.getNome());
		});


	}
}
