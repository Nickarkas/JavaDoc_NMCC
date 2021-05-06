/**
 * Clase Main de proyecto Herencia03
 * @author Nicol�s
 * @version 0.5
 */
public class Main_3 {
/**
 * Clase Main 
 * @param args main
 */
	public static void main(String[] args) {
		
		/**
		 * creaci�n objeto, comercial c1 con los siguientes par�metros, sin comisi�n
		 */
		comercial c1 = new comercial("Antonio", 32, 1200, 115.60);
		/**
		 * creaci�n objeto, comercial c2 con los siguientes par�metros, con comisi�n
		 */
		comercial c2 = new comercial("Pepe", 32, 1000, 350.40);

		 
		/**
		 * creaci�n objeto, repartidor r1 con los siguientes par�metros, sin comisi�n
		 */
		repartidor r1 = new repartidor("Antonio", 24, 1200, "zona3");
		/**
		 * creaci�n objeto, repartidor r2 con los siguientes par�metros, con comisi�n
		 */
		repartidor r2 = new repartidor("Pepe", 21, 1000, "zona1");
		
		/**
		 * Imprimo por consola los comerciales, utilizando el m�todo toString
		 */
		System.out.println("Los comerciales son:");
		System.out.println(c1);
		System.out.println(c2);
		/**
		 * Imprimo por consola los repartidores, utiliando el m�todo toString
		 */
		System.out.println("Los repartidores son:");
		System.out.println(r1);
		System.out.println(r2);
		
		System.out.println("");
		/**
		 * Imprimo por consola los empleados con comisi�n
		 */
		System.out.println("Empleados con comisiones");
		
		/**
		 * Utilizo metodo toString con el comercial c2 
		 */
		System.out.println(c2);
		
		
		/**
		 * Utilizo metodo toString con el repartidor r1
		 */
		System.out.println(r1);
	
	}

}
