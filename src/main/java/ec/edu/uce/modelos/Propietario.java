package ec.edu.uce.modelos;

public class Propietario  {
	
	private String nombre;
	private String apellido;
	private String cedula;
	
	
	//Metodos SET y GET 
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	@Override
	public String toString() {
		return "Propietario [nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + "]";
	}
	
	

	

}
