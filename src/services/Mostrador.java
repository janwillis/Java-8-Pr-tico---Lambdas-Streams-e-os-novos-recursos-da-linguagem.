package services;

import java.util.function.Consumer;

import entites.Usuario;

public class Mostrador implements Consumer<Usuario> {
	
	public void accept(Usuario usuario) {
		System.out.println(usuario.getNome());
	}
}
