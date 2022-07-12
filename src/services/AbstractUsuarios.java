package services;

import java.util.List;

import Interfaces.Usuarios;
import entity.Usuario;

public class AbstractUsuarios {
	
	protected static Usuarios usuariosInterface = new Usuarios() {
	};
	protected static List<Usuario> usuarios = usuariosInterface.listaDeUsuarios();

}
