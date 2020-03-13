package Producto;

public class ProductoFres extends Producto {
	private String fecha_envase;
	public ProductoFres() {
		// TODO Auto-generated constructor stub
	}
  
	
	public ProductoFres(int idProducto, String nombre, String fechaCaducidad, long nro_lote, String pais_orgin) {
		super(idProducto, nombre, fechaCaducidad, nro_lote, pais_orgin);
		this.setIdProducto(idProducto);
		this.setNombre(nombre);
		this.setFechaCaducidad(fechaCaducidad);
		this.setNro_lote(nro_lote);
		this.setPais_orgin(pais_orgin);
	}
	

	public ProductoFres(String fecha_envase) {
		super();
		this.fecha_envase = fecha_envase;
	}


	public String getFecha_envase() {
		return fecha_envase;
	}

	public void setFecha_envase(String fecha_envase) {
		this.fecha_envase = fecha_envase;
	}


	@Override
	public String toString() {
		return "ProductoFres [fecha_envase=" + fecha_envase + "]";
	}
 
}
