package clases;

public class Refrigerado extends Producto {
	protected int codigo;
	protected String temperaturaDeMantenimiento;

	public Refrigerado(String nombre,String fecha, int numeroDeLote, String fechaEnvasado, int codigo,String temperaturaDeMantenimiento ) {
		super(nombre, fecha,fechaEnvasado,numeroDeLote);
		this.codigo = codigo;
		this.temperaturaDeMantenimiento =  temperaturaDeMantenimiento;
		
	}

	@Override
	public String informacionProducto() {
		return "Refrigerado [ Nombre = "  + nombre  +" Fecha De Caducidad = " + fechaDeCaducidad + ", Fecha Envasado = " + fechaEnvasado + ", Fumero De Lote = "
				+ numeroDeLote + " Código del organismo de supervisión alimentaria =  " + codigo + " Temperatura De Mantenimiento " + temperaturaDeMantenimiento + "]";
	}

}
