package clases;

public class PorAire extends Congelado {
	protected String composicionAire;
	

	public PorAire(String nombre, String fechaDeCaducidad, int numeroDeLote,String fechaEnvasado, String paisDeOrigen,
			String temperaturaDeMantenimiento,String composicionAire) {
		super(nombre,fechaDeCaducidad, fechaEnvasado, numeroDeLote, paisDeOrigen, temperaturaDeMantenimiento);
		this.composicionAire = composicionAire;
	}

	@Override
	public String informacionDeCongelamiento() {
		return super.informacionProducto() + " Composicion Aire " + composicionAire + "]";
	}

}
