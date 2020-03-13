package clases;

public class Fresco extends Producto {
	protected String paisOrigen;

	public Fresco(String nombre,String fecha, int numeroDeLote, String fechaEnvasado, String paisOrigen) {
		super(nombre, fecha, fechaEnvasado, numeroDeLote);
		this.paisOrigen = paisOrigen;		
	}

	@Override
	public String informacionProducto() {
		 return "Fresco [ Nombre = " + nombre + " Fecha De Caducidad = " + fechaDeCaducidad + ", Fecha Envasado = " + fechaEnvasado + ", Numero De Lote = "
				+ numeroDeLote + " Pais Origen =  " + paisOrigen + "]";
	}

	
}
