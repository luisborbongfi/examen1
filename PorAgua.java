package clases;

public class PorAgua extends Congelado {
	protected String salinidad;

	public PorAgua(String nombre, String fechaDeCaducidad, int numeroDeLote, String fechaEnvasado, String paisDeOrigen,
			String temperaturaDeMantenimiento, String salinidad) {
		super(nombre ,fechaDeCaducidad, fechaEnvasado, numeroDeLote, paisDeOrigen, temperaturaDeMantenimiento);
		this.salinidad = salinidad;
	}

	@Override
	public String informacionDeCongelamiento() {
		return super.informacionProducto() + " Salinidad del agua = " + salinidad + "]";
	}

}
