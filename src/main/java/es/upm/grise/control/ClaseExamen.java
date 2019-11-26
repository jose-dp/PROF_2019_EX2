package es.upm.grise.control;
 
import java.util.ArrayList;
import java.util.List;

public class ClaseExamen {
	
	public static List<Integer> primos (int n) throws EntradaInvalida {
		
		if (n <= 1) { // Numero invalido
			throw new EntradaInvalida();
		}
		
		List<Integer> resultado = new ArrayList<Integer>();
		int division = n; // Guardamos aqui el resultado de las divisiones
		
		for (int i = 2; i <= n/2 && division != 1; i++) { // Divisores hasta n/2 y si division == 1
			// significa que ya se ha descompuesto en factores primos y no hace falta seguir
			
			while (division % i == 0) {
				division = division / i; // Dividimos
				resultado.add(i); // Aniadimos divisor (primo)
			}
		}
		
		if (resultado.isEmpty()) // Si no tiene divisores -> es primo
			resultado.add(n);
		
		return resultado;
	}

}
