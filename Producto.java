package clases;

public abstract class Producto {
	protected String nombre;
	protected String fechaDeCaducidad;
	protected String fechaEnvasado;
	protected int numeroDeLote;

	public Producto(String nombre, String fechaDeCaducidad, String fechaEnvasado, int numeroDeLote) {
		this.nombre = nombre;
		this.fechaDeCaducidad= fechaDeCaducidad;
		this.fechaEnvasado = fechaEnvasado;
		this.numeroDeLote = numeroDeLote;
	}
	
	public abstract String informacionProducto();


}
