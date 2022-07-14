package services;

import java.util.stream.Collectors;

public class Capitulo7 extends AbstractUsuarios {

	public static void main(String[] args) {

		/*
		 * 7.1 TORNANDO MODERADORES OS 10 USUÁRIOS COM MAIS PONTOS
		 */
//		usuarios.sort(Comparator.comparingInt(Usuario::getPontos)
//				.thenComparing(Usuario::getNome, String.CASE_INSENSITIVE_ORDER).reversed());
//		usuarios.subList(0, 10).forEach(Usuario::tornaModerador);
//		usuarios.forEach(System.out::println);

		/*
		 * 7.2 STREAMS: TORNANDO MODERADORES OS USUÁRIOS COM MAIS DE 100 PONTOS
		 */

//		usuarios.stream().filter(u -> u.getPontos() > 100)//
//				.sorted(Comparator.comparingInt(Usuario::getPontos).reversed())//
//				.forEach(System.out::println);
//	          usuarios.stream().filter(u -> u.getPontos()>=100).forEach(Usuario::tornaModerador);
//	          usuarios.stream().filter(Usuario::isModerador).forEach(System.out::println);;

		/*
		 * 7.4 COLLECTORS
		 */
		
		usuarios.stream().filter(u-> u.getPontos()>110).collect(Collectors.toList());

	}

}
