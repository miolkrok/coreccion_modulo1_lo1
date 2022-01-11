package ec.edu.uce.modelos;



public class Vehiculos {
	private String marca;
	private String paisOrigen;
	private String placa;
	private String tipo;
	private Propietario propietario;
	private double precio;
	private double valorMatricula;
	
	
	//Metodos SET Y GET
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getPaisOrigen() {
		return paisOrigen;
	}
	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}


	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Propietario getPropietario() {
		return propietario;
	}
	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}

	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public double getValorMatricula() {
		return valorMatricula;
	}
	public void setValorMatricula(double valorMatricula) {
		this.valorMatricula = valorMatricula;
	}
	@Override
	public String toString() {
		return "Vehiculos [marca=" + marca + ", paisOrigen=" + paisOrigen + ", placa=" + placa + ", tipo=" + tipo
				+ ", propietario=" + propietario + ", precio=" + precio + ", valorMatricula=" + valorMatricula + "]";
	}
	

	

	

}
