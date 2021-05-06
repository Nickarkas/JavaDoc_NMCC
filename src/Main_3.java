/**
 * Clase Main de proyecto Herencia03
 * @author Nicolás
 * @version 0.5
 */
public class Main_3 {
/**
 * Clase Main 
 * @param args main
 */
	public static void main(String[] args) {
		
		/**
		 * creación objeto, comercial c1 con los siguientes parámetros, sin comisión
		 */
		comercial c1 = new comercial("Antonio", 32, 1200, 115.60);
		/**
		 * creación objeto, comercial c2 con los siguientes parámetros, con comisión
		 */
		comercial c2 = new comercial("Pepe", 32, 1000, 350.40);

		 
		/**
		 * creación objeto, repartidor r1 con los siguientes parámetros, sin comisión
		 */
		repartidor r1 = new repartidor("Antonio", 24, 1200, "zona3");
		/**
		 * creación objeto, repartidor r2 con los siguientes parámetros, con comisión
		 */
		repartidor r2 = new repartidor("Pepe", 21, 1000, "zona1");
		
		/**
		 * Imprimo por consola los comerciales, utilizando el método toString
		 */
		System.out.println("Los comerciales son:");
		System.out.println(c1);
		System.out.println(c2);
		/**
		 * Imprimo por consola los repartidores, utiliando el método toString
		 */
		System.out.println("Los repartidores son:");
		System.out.println(r1);
		System.out.println(r2);
		
		System.out.println("");
		/**
		 * Imprimo por consola los empleados con comisión
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
