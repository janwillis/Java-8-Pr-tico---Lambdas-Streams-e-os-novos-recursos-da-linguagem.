package services;

import java.util.Arrays;
import java.util.List;

import Interfaces.Validator;
import entites.Usuario;
/**
Classe de execusão de exemplos isolados da apostila do capitulo 3
 */
public class ExecucaoCapitulo3 {

	public static void main(String[] args) {

		/**
		 * Exemplos 3.0 ao 3.1
		 * 
		 */
//		Usuario user1 = new Usuario("Paulo Silveira", 150);
//		Usuario user2 = new Usuario("Rodrigo Turini", 120);
//		Usuario user3 = new Usuario("Guilherme Silveira", 190);
//		List<Usuario> usuarios = Arrays.asList(user1, user2, user3);
//
//		Runnable r = () -> {
//			for (int i = 0; i <= 1000; i++) {
//				System.out.println(i);
//				System.out.println("--------------");
//				System.out.println("--------------");
//				System.out.println("--------------");
//				System.out.println("LAMBDA");
//			}
//		};
//
//		new Thread(r).start();
//
//		new Thread(() -> { 
//			for (int i = 0; i <= 1000; i++) {
//				System.out.println(i);
//				System.out.println("--------------");
//				System.out.println("--------------");
//				System.out.println("--------------");
//				System.out.println("LAMBDA");
//			}}
//		).start();


		/**
		 * 3.2	SUA	PRÓPRIA	INTERFACE	FUNCIONAL

		 */
		
		//Decaração tradicional
		Validator<String> validatorCep = new Validator<String>() {
			@Override
			public boolean valida(String valor) {
				return valor.matches("[0-9]{5}-[0-9]{3}");
			}
		}; 
		
		Validator<String>validadorCepLambda = valor -> {
			return valor.matches("[0-9]{5}-[0-9]{3}");
		};
	}

}
