package metodos;

import java.util.Arrays;

import clases.Jugador;

public class CrudJugador {
	
	//creación de jugador 
	
	
	private Jugador [] listaJugador;

	public CrudJugador(Jugador[] listaJugador) {
		
		this.listaJugador = listaJugador;
	}

	public Jugador[] getListaJugador() {
		return listaJugador;
	}

	public void setListaJugador(Jugador[] listaJugador) {
		this.listaJugador = listaJugador;
	}

	@Override
	public String toString() {
		return "CrudJugador [listaJugador=" + Arrays.toString(listaJugador) + "]";
	}
	
	
	
	
	

}
