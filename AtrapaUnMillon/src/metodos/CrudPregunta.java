package metodos;

import java.util.Arrays;

import clases.Preguntas;
import datos.Datos;

public class CrudPregunta {
	
	//agregar preguntas/respuestas
	
	
	private Datos d;
	private Preguntas [] listaPreguntas;
	
	public CrudPregunta(Datos d, Preguntas[] listaPreguntas) {
		
		this.d = d;
		this.listaPreguntas = listaPreguntas;
	}

	public Datos getD() {
		return d;
	}

	public void setD(Datos d) {
		this.d = d;
	}

	public Preguntas[] getListaPreguntas() {
		return listaPreguntas;
	}

	public void setListaPreguntas(Preguntas[] listaPreguntas) {
		this.listaPreguntas = listaPreguntas;
	}

	@Override
	public String toString() {
		return "CrudPregunta [d=" + d + ", listaPreguntas=" + Arrays.toString(listaPreguntas) + "]";
	}
	
	
	
	

}
