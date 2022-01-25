package BuscarPalabra;

import java.time.LocalDate;




public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Palabra 1
String valor1="kraken";
char [] palabra_Primaria = valor1.toCharArray();
boolean[] boolean1 = new boolean[valor1.length()];
Palabra palabra1=new Palabra(valor1, palabra_Primaria, boolean1);
//Palabra 2
String valor2="Pegaso";
char [] palabra_Segunda = valor2.toCharArray();
boolean[] boolean2 = new boolean[valor2.length()];
Palabra palabra2=new Palabra(valor2, palabra_Segunda, boolean2);
//Palabra 3
String valor3="Hydra";
char [] palabra_Tercera = valor3.toCharArray();
boolean[] boolean3 = new boolean[valor3.length()];
Palabra palabra3=new Palabra(valor3, palabra_Tercera, boolean3);
//Array de objetos de palabras
Palabra[] palabras=new Palabra[3];
palabras[0]=palabra1;
palabras[1]=palabra2;
palabras[2]=palabra3;

//Objeto de partida
Partida Partida1=new Partida(LocalDate.of(2022, 01, 24), "Cristoffer", palabras, 3);

System.out.println("La Palabra seleccionada es "+Partida1.BuscarPalabra());

	}

	
	
}
