package clases;

import java.util.Arrays;

public class Partida {

	private int numPartida;
	private Usuario [] usuarios;
	private Preguntas [] preguntas;
	
	public Partida(int numPartida, Usuario[] usuarias, Preguntas[] preguntas) {
		this.numPartida = numPartida;
		this.usuarios = usuarios;
		this.preguntas = preguntas;
	}

	public int getNumPartida() {
		return numPartida;
	}

	public void setNumPartida(int numPartida) {
		this.numPartida = numPartida;
	}

	public Usuario[] getUsuarios() {
		return usuarios;
	}

	public void setUsuarias(Usuario[] usuarios) {
		this.usuarios = usuarios;
	}

	public Preguntas[] getPreguntas() {
		return preguntas;
	}

	public void setPreguntas(Preguntas[] preguntas) {
		this.preguntas = preguntas;
	}

	@Override
	public String toString() {
		return "Partida [numPartida=" + numPartida + ", usuarias=" + Arrays.toString(usuarios) + ", preguntas="
				+ Arrays.toString(preguntas) + "]";
	}
	
	
	
	
}
