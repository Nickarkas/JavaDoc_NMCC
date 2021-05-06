/**
 * Clase comercial que hereda de la superclase Empleado
 * @author Nicol�s
 * @version 0.5
 */
public class comercial extends empleado{

	/**
	 * atributo comision
	 */
	private double comision;
	
	/**
	 * constructor por defecto
	 */
	
	public comercial() {
		
	}
	
/**
 * Constructor por par�metro
 * @param nombre del comercial
 * @param edad del comercial 
 * @param salario del comercial 
 * @param comision del comercial
 * Si la edad es mayor a 30 y comisi�n a 200� tendr� un plus
 */
	
	public comercial (String nombre, int edad, int salario, double comision) {
		super(nombre, edad, salario);
		this.comision = comision;
		
		if (edad > 30 && comision >200) {
			Pluss();
		}
	}
	
	/**
	 * m�todo Get de comisi�n
	 * @return comisi�n
	 */
	
	public double getComision() {
		return comision;
	}

	/**
	 * m�todo Set de comisi�n
	 * @param comision del comercial
	 */
	
	public void setComision(double comision) {
		this.comision = comision;
	}
	
	/**
	 * m�todo toString
	 * @return cadena de texto "Empleado llamado (nombre), con edad (edad) y salario (salario)" "Con comisi�n de (comisi�n)"
	 */
	
	public String toString() {
		return super.toString() + " Con una comisi�n de " + comision;
	}
		
}
//