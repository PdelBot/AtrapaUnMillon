package clases;

import java.util.Arrays;

public class Preguntas {

	
	private int dificultad;
	private int categoria;
	private int pregunta [];
	private int respuestaCorrecta [];
	private int respuestaInco [];
	

	public Preguntas(int dificultad, int categoria, int[] pregunta, int[] respuestaCorrecta, int[] respuestaInco) {
		
		this.dificultad = dificultad;
		this.categoria = categoria;
		this.pregunta = pregunta;
		this.respuestaCorrecta = respuestaCorrecta;
		this.respuestaInco = respuestaInco;
	}



	public int getDificultad() {
		return dificultad;
	}



	public void setDificultad(int dificultad) {
		this.dificultad = dificultad;
	}



	public int getCategoria() {
		return categoria;
	}



	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}



	public int[] getPregunta() {
		return pregunta;
	}



	public void setPregunta(int[] pregunta) {
		this.pregunta = pregunta;
	}



	public int[] getRespuestaCorrecta() {
		return respuestaCorrecta;
	}



	public void setRespuestaCorrecta(int[] respuestaCorrecta) {
		this.respuestaCorrecta = respuestaCorrecta;
	}



	public int[] getRespuestaInco() {
		return respuestaInco;
	}



	public void setRespuestaInco(int[] respuestaInco) {
		this.respuestaInco = respuestaInco;
	}



	@Override
	public String toString() {
		return "Preguntas [dificultad=" + dificultad + ", categoria=" + categoria + ", pregunta="
				+ Arrays.toString(pregunta) + ", respuestaCorrecta=" + Arrays.toString(respuestaCorrecta)
				+ ", respuestaInco=" + Arrays.toString(respuestaInco) + "]";
	}
	
	


}
