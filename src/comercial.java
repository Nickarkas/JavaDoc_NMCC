/**
 * Clase comercial que hereda de la superclase Empleado
 * @author Nicolás
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
 * Constructor por parámetro
 * @param nombre del comercial
 * @param edad del comercial 
 * @param salario del comercial 
 * @param comision del comercial
 * Si la edad es mayor a 30 y comisión a 200€ tendrá un plus
 */
	
	public comercial (String nombre, int edad, int salario, double comision) {
		super(nombre, edad, salario);
		this.comision = comision;
		
		if (edad > 30 && comision >200) {
			Pluss();
		}
	}
	
	/**
	 * método Get de comisión
	 * @return comisión
	 */
	
	public double getComision() {
		return comision;
	}

	/**
	 * método Set de comisión
	 * @param comision del comercial
	 */
	
	public void setComision(double comision) {
		this.comision = comision;
	}
	
	/**
	 * método toString
	 * @return cadena de texto "Empleado llamado (nombre), con edad (edad) y salario (salario)" "Con comisión de (comisión)"
	 */
	
	public String toString() {
		return super.toString() + " Con una comisión de " + comision;
	}
		
}
//