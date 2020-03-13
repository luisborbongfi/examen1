package clases;

public abstract class Congelado extends Producto {
	protected String paisDeOrigen;
	protected String temperaturaDeMantenimiento;

	public Congelado(String nombre,String fechaDeCaducidad, String fechaEnvasado, int numeroDeLote, String paisDeOrigen, String temperaturaDeMantenimiento) {
		super(nombre, fechaDeCaducidad, fechaEnvasado, numeroDeLote);
		this.paisDeOrigen = paisDeOrigen;
		this.temperaturaDeMantenimiento = temperaturaDeMantenimiento;
	}
	
	public abstract String informacionDeCongelamiento();

	@Override
	public String informacionProducto() {
		return "Congelado [ Nombre " + nombre + " Fecha De Caducidad = " + fechaDeCaducidad + ", Fecha Envasado = " + fechaEnvasado + ", Numero De Lote = "
				+ numeroDeLote + " Pais De Origen =  " + paisDeOrigen + " Temperatura De Mantenimiento " + temperaturaDeMantenimiento;
	}

}
