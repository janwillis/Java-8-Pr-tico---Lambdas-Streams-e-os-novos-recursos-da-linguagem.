package services;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import Interfaces.Usuarios;
import entity.Usuario;

public class Capitulo6 extends AbstractUsuarios {

	public static void main(String[] args) {
		/*
		 * 6.2 COMPARANDO DE UMA FORMA AINDA MAIS ENXUTA
		 */
//		usuarios.sort(Comparator.comparing(Usuario::getNome));
//		usuarios.forEach(u -> {
//			System.out.println(u.getNome());
//		});
//

		/* 6.3 COMPONDO COMPARATORS */
//		usuarios.sort(Comparator.comparing(Usuario::getNome).thenComparingInt(Usuario::getPontos));
//		usuarios.sort(Comparator.nullsLast(Comparator.comparing(Usuario::getNome,String.CASE_INSENSITIVE_ORDER)).thenComparing(Usuario::getPontos));
//		usuarios.forEach(u -> {
//		System.out.println(u.getNome().concat("/").concat(u.getPontos().toString()));
//	});

		/* 6.4 REFERENCIANDO MÉTODO DE INSTÂNCIA */
//		Usuario	rodrigo	= new	Usuario("Rodrigo Turini",50);
//		Runnable bloco1	=	rodrigo::tornaModerador;
//		Runnable bloco2	=	()	->	rodrigo.tornaModerador();
//		
//         Consumer<Usuario> consumer =  Usuario::tornaModerador;
//         consumer.accept(rodrigo);
//         
//         usuarios.forEach(u->{
//        	 Runnable bloco = u::tornaModerador;
//         });

		/*
		 * 6.5 REFERENCIANDO MÉTODOS QUE RECEBEM ARGUMENTOS
		 */
//		usuarios.forEach(System.out::println);
//		usuarios.forEach(u -> System.out.println(u));

		/* 6.6 REFERENCIANDO CONSTRUTORES */
//				Supplier<Usuario> usuario = Usuario::new;
		

	}

}
