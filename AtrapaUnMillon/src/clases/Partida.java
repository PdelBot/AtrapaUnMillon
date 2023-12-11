package clases;

import java.util.Arrays;

public class Partida {

	private int numPartida;
	private Usuario [] usuarios;
	private Preguntas [] preguntas;
	private Preguntas [] respuestasCorrectas;
	private Preguntas [] respuestasIncorrectas;
	
	public Partida(int numPartida, Usuario[] usuarios, Preguntas[] preguntas, Preguntas[] respuestasCorrectas,
			Preguntas[] respuestasIncorrectas) {
		
		this.numPartida = numPartida;
		this.usuarios = usuarios;
		this.preguntas = preguntas;
		this.respuestasCorrectas = respuestasCorrectas;
		this.respuestasIncorrectas = respuestasIncorrectas;
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

	public void setUsuarios(Usuario[] usuarios) {
		this.usuarios = usuarios;
	}

	public Preguntas[] getPreguntas() {
		return preguntas;
	}

	public void setPreguntas(Preguntas[] preguntas) {
		this.preguntas = preguntas;
	}

	public Preguntas[] getRespuestasCorrectas() {
		return respuestasCorrectas;
	}

	public void setRespuestasCorrectas(Preguntas[] respuestasCorrectas) {
		this.respuestasCorrectas = respuestasCorrectas;
	}

	public Preguntas[] getRespuestasIncorrectas() {
		return respuestasIncorrectas;
	}

	public void setRespuestasIncorrectas(Preguntas[] respuestasIncorrectas) {
		this.respuestasIncorrectas = respuestasIncorrectas;
	}

	@Override
	public String toString() {
		return "Partida [numPartida=" + numPartida + ", usuarios=" + Arrays.toString(usuarios) + ", preguntas="
				+ Arrays.toString(preguntas) + ", respuestasCorrectas=" + Arrays.toString(respuestasCorrectas)
				+ ", respuestasIncorrectas=" + Arrays.toString(respuestasIncorrectas) + "]";
	}
	
	
	
	
	
	
	
	
	
}
