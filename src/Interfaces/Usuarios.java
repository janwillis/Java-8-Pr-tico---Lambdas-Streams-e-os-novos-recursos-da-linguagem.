package Interfaces;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import entity.Usuario;

public interface Usuarios {

	default List<Usuario> listaDeUsuarios() {
		List<Usuario> usuarios = new ArrayList<>();
		Usuario user1 = new Usuario("D Brildo", 160,LocalDate.of(1988, 05, 1));
		Usuario user2 = new Usuario("b Paaulo", 99,LocalDate.of(1989, 06, 24));
		Usuario user3 = new Usuario("A Pio", 120,LocalDate.of(1986, 01, 07));
		Usuario user4 = new Usuario("xavier Carlos", 98,LocalDate.of(1987, 12, 9));
		Usuario user5 = new Usuario("Zelda", 95,LocalDate.of(1989, 12, 9));
		Usuario user6 = new Usuario("link", 90,LocalDate.of(1987, 12, 9));
		Usuario user7 = new Usuario("Zildo", 116,LocalDate.of(1987, 12, 9));
		Usuario user8 = new Usuario("Zana", 134,LocalDate.of(1977, 12, 9));
		Usuario user9 = new Usuario("Jó", 100,LocalDate.of(1997, 12, 9));
		Usuario user10 = new Usuario("Nildo", 99,LocalDate.of(1967, 12, 9));
		Usuario user11 = new Usuario("Nensão Salamandra", 121,LocalDate.of(1967, 12, 9));
		Usuario user12 = new Usuario("Jonh", 91,LocalDate.of(1967, 12, 9));
		Usuario user13 = new Usuario("Wesley", 90,LocalDate.of(1967, 12, 9));
		Usuario user14 = new Usuario("Islany", 101,LocalDate.of(1967, 12, 9));
		Usuario user15 = new Usuario("Nubia", 113,LocalDate.of(1967, 12, 9));

		usuarios.add(user1);
		usuarios.add(user2);
		usuarios.add(user3);
		usuarios.add(user4);
		usuarios.add(user5);
		usuarios.add(user6);
		usuarios.add(user7);
		usuarios.add(user8);
		usuarios.add(user9);
		usuarios.add(user10);
		usuarios.add(user11);
		usuarios.add(user12);
		usuarios.add(user13);
		usuarios.add(user14);
		usuarios.add(user15);





		return usuarios;

	}
}
