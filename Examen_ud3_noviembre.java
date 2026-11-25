package ud3.examen;

import java.util.Scanner;

public class Examen_ud3_noviembre {
	static String FormateaMatricula(String matricula) {
		String limpiarEspacios = matricula.trim();
		String pasaMayusculas = limpiarEspacios.toUpperCase();

		return pasaMayusculas;

	}

	static boolean ValidaMatricula(String matricula) {
		return matricula.matches("[0-9]{4}[A-Z]{3}");

	}

	static int PlazasLibres(Integer plazasActualmenteOcupadas) {
		final int numeroPlazas = 2700;
		int PlazasLibres = plazasActualmenteOcupadas - numeroPlazas;
		return PlazasLibres;
	}

	static Integer SumaDigitos(String matricula) {
		Integer dig1 = Integer.parseInt(matricula.substring(0, 1));
		Integer dig2 = Integer.parseInt(matricula.substring(1, 2));
		Integer dig3 = Integer.parseInt(matricula.substring(2, 3));
		Integer dig4 = Integer.parseInt(matricula.substring(3, 4));
		Integer resultado = 0;
		resultado = dig1 + dig2 + dig3 + dig4;
		return resultado;
	}

	/* static String AsignaPlaza(String matricula) {          Aqui esta el metodo de asignar plaza que no pude retornarlo al no saber pasar el int a string.
		String ultimaLetra=matricula.substring(6,7);
		Integer ultimoDig=Integer.parseInt(ultimaLetra);
		int sumaDigitos=SumaDigitos(matricula);
		int plazaAsignada= ultimoDig+sumaDigitos;
		return plazaAsignada;
	}*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String matricula;
		String pararPrograma = "fin";
		System.out.println("Introduzca mátricula(o fin para terminar): ");
		matricula = sc.nextLine();
		while (!matricula.equals(pararPrograma)) {
			String matriculaFormateada = FormateaMatricula(matricula);
			boolean matriculaValida = ValidaMatricula(matriculaFormateada);
			//String plaza=AsignaPlaza(matriculaFormateada);    Aqui Estaria llamando y comprobando si se cumple el metodo.
			if (matriculaValida) {
				System.out.println("Matricula formateada: " + matriculaFormateada);
				System.out.println("Matricula válida.");
				//System.out.println("Plaza asignada: " +plaza);     Aqui lo mostramos por consola.
				System.out.println("Introduzca mátricula(o fin para terminar): ");
				matricula = sc.nextLine();
			} else {
				System.out.println("Matricula formateada: " + matriculaFormateada);
				System.out.println("Matricula no válida.");
				System.out.println("Introduzca mátricula(o fin para terminar): ");
				matricula = sc.nextLine();
			}
		}System.out.println("Programa finalizado.");
	}
}
