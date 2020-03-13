package clases;

public class PorNitrogeno extends Congelado {
	protected String metodoEmpleado;
	protected int tiempoDeExposicion;

	public PorNitrogeno(String nombre,String fechaDeCaducidad, String fechaEnvasado, int numeroDeLote, String paisDeOrigen,
			String temperaturaDeMantenimiento, String metodoEmpleado, int tiempoDeExposicion) {
		super(nombre ,fechaDeCaducidad, fechaEnvasado, numeroDeLote, paisDeOrigen, temperaturaDeMantenimiento);
		this.metodoEmpleado = metodoEmpleado;
		this.tiempoDeExposicion = tiempoDeExposicion;
	}

	@Override
	public String informacionDeCongelamiento() {
		return super.informacionProducto() + " Metodo empleado =  " + metodoEmpleado + " Tiempo De Exposicion = " + tiempoDeExposicion  + "s  ]";
	}

}
