package services;

import java.util.Arrays;
import java.util.List;

import Interfaces.Treino;
import Interfaces.Validator;
import entity.Usuario;

/**
 * Classe de execusão de exemplos isolados da apostila do capitulo 3
 */
public class Capitulo3 {

	public static void main(String[] args) {

		/**
		 * Exemplos 3.0 ao 3.1
		 * 
		 */
		Usuario user1 = new Usuario("Paulo Silveira", 150);
		Usuario user2 = new Usuario("Rodrigo Turini", 120);
		Usuario user3 = new Usuario("Guilherme Silveira", 190);
		List<Usuario> usuarios = Arrays.asList(user1, user2, user3);

		Runnable r = () -> {
			for (int i = 0; i <= 1000; i++) {
				System.out.println(i);
				System.out.println("--------------");
				System.out.println("--------------");
				System.out.println("--------------");
				System.out.println("LAMBDA");
			}
		};

		new Thread(r).start();

		new Thread(() -> { 
			for (int i = 0; i <= 1000; i++) {
				System.out.println(i);
				System.out.println("--------------");
				System.out.println("--------------");
				System.out.println("--------------");
				System.out.println("LAMBDA");
			}}
		).start();

		/**
		 * 3.2 SUA PRÓPRIA INTERFACE FUNCIONAL
		 * 
		 */

//		 Decaração tradicional
		Validator<String> validatorCep = new Validator<String>() {
			@Override
			public boolean valida(String valor) {
				return valor.matches("[0-9]{5}-[0-9]{3}");
			}
		};

		// Decaração lambda

		Validator<String> validatorCepLambda = valor -> {
			return valor.matches("[0-9]{5}-[0-9]{3}");
		};
		System.out.println(validatorCepLambda.valida("04101-300"));


		/**
		 * Treino aleatório
		 * 
		 */
		Treino<Integer> treino = trei -> {
			return trei.longValue() + 2000;
		};

		Treino<Long> trei = new Treino<Long>() {
			@Override
			public long convert(Long t) {
				// TODO Auto-generated method stub
				return t+1000;
			}
		};
		
		 treino.convert(23);
		trei.convert(Long.valueOf(12));
		System.out.println(treino.getClass());
		Runnable o = () -> {
			System.out.println("O	que	sou	eu?	Que	lambda?");
			
		};
		System.out.println(o);
		System.out.println(o.getClass());

		
/**			int	numero	=	5;
			new	Thread(()	->	{
							System.out.println(numero);		//	não	compila
			}).start();
			numero	=	10;	//	por	causa	dessa	linha!
}
**/
	};

}
