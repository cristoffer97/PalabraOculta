package BuscarPalabra;

import java.util.Arrays;

public class Palabra {
	private String valor;
	private char[] letrasDisponibles;
	private boolean[] posicionesocupadas;
	
	/*//Constructor sin Parametros	
	public Palabra() {		
	}*/
	//Constructor parametrizado
	public Palabra(String valor, char[] letrasDisponibles, boolean[] posicionesocupadas) {
		this.valor = valor;
		this.letrasDisponibles = letrasDisponibles;
		this.posicionesocupadas = posicionesocupadas;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public char[] getLetrasDisponibles() {
		return letrasDisponibles;
	}

	public void setLetrasDisponibles(char[] letrasDisponibles) {
		this.letrasDisponibles = letrasDisponibles;
	}

	public boolean[] getPosicionesocupadas() {
		return posicionesocupadas;
	}

	public void setPosicionesocupadas(boolean[] posicionesocupadas) {
		this.posicionesocupadas = posicionesocupadas;
	}

	@Override
	public String toString() {
		return "Palabra [valor=" + valor + ", letrasDisponibles=" + Arrays.toString(letrasDisponibles)
				+ ", posicionesocupadas=" + Arrays.toString(posicionesocupadas) + "]";
	}
	
	
	
}
