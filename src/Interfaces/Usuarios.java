package Interfaces;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import entites.Usuario;

public interface Usuarios {

	default List<Usuario> listaDeUsuarios() {
		List<Usuario> usuarios = new ArrayList<>();
		Usuario user1 = new Usuario("D Brildo", 160,LocalDate.of(1988, 05, 1));
		Usuario user2 = new Usuario("b Paaulo", 120,LocalDate.of(1989, 06, 24));
		Usuario user3 = new Usuario("A Pio", 120,LocalDate.of(1986, 01, 07));
		Usuario user4 = new Usuario("xavier Carlos", 140,LocalDate.of(1987, 12, 9));
		Usuario user5 = new Usuario("Zelda", 100,LocalDate.of(1987, 12, 9));
		Usuario user6 = new Usuario("link", 100,LocalDate.of(1987, 12, 9));

		usuarios.add(user1);
		usuarios.add(user2);
		usuarios.add(user3);
		usuarios.add(user4);
		usuarios.add(user5);
		usuarios.add(user6);


		return usuarios;

	}
}
