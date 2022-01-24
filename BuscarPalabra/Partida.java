package BuscarPalabra;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Random;

public class Partida {
	private LocalDate Fecha;
	private String Nombre_Jugador;
	private Palabra[] palabras;
	private int intentos;

	//Constructor sin Parametros	
		/*public Partida() {		
		}*/
		public Partida(LocalDate fecha, String nombre_Jugador, Palabra[] palabras, int intentos) {
			Fecha = fecha;
			Nombre_Jugador = nombre_Jugador;
			this.palabras = palabras;
			this.intentos = intentos;
		}
		
		public LocalDate getFecha() {
			return Fecha;
		}
		public void setFecha(LocalDate fecha) {
			Fecha = fecha;
		}
		public String getNombre_Jugador() {
			return Nombre_Jugador;
		}
		public void setNombre_Jugador(String nombre_Jugador) {
			Nombre_Jugador = nombre_Jugador;
		}
		public Palabra[] getPalabras() {
			return palabras;
		}
		public void setPalabras(Palabra[] palabras) {
			this.palabras = palabras;
		}
		public int getIntentos() {
			return intentos;
		}
		public void setIntentos(int intentos) {
			this.intentos = intentos;
		}
		@Override
		public String toString() {
			return "Partida [Fecha=" + Fecha + ", Nombre_Jugador=" + Nombre_Jugador + ", palabras="
					+ Arrays.toString(palabras) + ", intentos=" + intentos + "]";
		}
		
		
	public Palabra BuscarPalabra() {
		//Conseguimos la posicion de una palabra de forma aleatoria
		int posicion=(int)(Math.random()*palabras.length);
		
			//Palabra palabraelegida=palabras[posicion];
		
			return palabras[posicion];
		}

		
	
		
				
		
		
		
		
		
}
