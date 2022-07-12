package entites;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {
	private String nome;
	private int pontos;
	private LocalDate nacimento;
	private boolean moderador;

	public String getNome() {
		return nome;
	}

	public Integer getPontos() {
		return pontos;
	}

	public void tornaModerador() {
		this.moderador = true;
	}

	public boolean isModerador() {
		return moderador;
	}

	public String toString() {
		return "Usuario	" + nome;
	}

	public Usuario(String nome, int pontos, LocalDate nacimento) {
		super();
		this.nome = nome;
		this.pontos = pontos;
		this.nacimento = nacimento;
	}

	public Usuario(String nome, int pontos) {
		this.pontos = pontos;
		this.nome = nome;
		this.moderador = false;
	}

}
