package services;

import java.util.ArrayList;
import java.util.OptionalDouble;

import Interfaces.Usuarios;
import entity.Usuario;

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
//
//		usuarios.stream().filter(u -> u.getPontos() > 110).collect(Collectors.toList());
//
		/*
		 * 7.6 LISTE APENAS OS PONTOS DE TODOS OS USUÁRIOS COM O MAP
		 */
//		List<Integer> pontos = usuarios.stream()
//				.sorted(Comparator.comparing(Usuario::getNome, String.CASE_INSENSITIVE_ORDER)).map(Usuario::getPontos)
//				.collect(Collectors.toList());
//
		/*
		 * 7.7 INTSTREAM E A FAMÍLIA DE STREAMS
		 */
//		IntStream	stream	=	usuarios.stream()
//				.mapToInt(Usuario::getPontos);
//		double pontuacaoMedia = usuarios.stream()//
//				.mapToInt(Usuario::getPontos)//
//				.average()//
//				.getAsDouble();

		/*
		 * 
		 * 7.8 O OPTIONAL EM JAVA.UTIL
		 * 
		 * 
		 */
		usuarios = new ArrayList<Usuario>();
		/* Jeito antido de impedir a divisão por zero */
//		double soma = 0;
//		for (Usuario u : usuarios) {
//			soma += u.getPontos();
//		}
//		double pontuacaoMedia;
//		if (usuarios.isEmpty()) {
//			pontuacaoMedia = 0;
//		} else {
//			pontuacaoMedia = soma / usuarios.size();
//		}

		/* Jeito novo de impedir a divisão por zero */
//
//		double media = usuarios.stream()//
//				.mapToInt(Usuario::getPontos)//
//				.average()//
//				.orElse(1.0);
		
		double	pontuacaoMedia	=	usuarios.stream()
				.mapToInt(Usuario::getPontos)
				.average()
				.orElseThrow(IllegalStateException::new);

		System.out.println(pontuacaoMedia);

		usuarios.stream()
		.mapToInt(Usuario::getPontos)
		.average()
		.ifPresent(valor	->	janela.atualiza(valor));
	}

}
