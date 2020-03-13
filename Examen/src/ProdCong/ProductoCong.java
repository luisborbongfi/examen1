package ProdCong;

import Producto.Producto;

public class ProductoCong extends Producto {

	private int idCong;
	private String fech_ens;
	
	

	public ProductoCong() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public ProductoCong(String fech_ens) {
		super();
		this.fech_ens = fech_ens;
	}


	public ProductoCong(int idProducto, String nombre, String fechaCaducidad, long nro_lote, String pais_orgin) {
		super(idProducto, nombre, fechaCaducidad, nro_lote, pais_orgin);
		this.setIdProducto(idProducto);
		this.setNombre(nombre);
		this.setFechaCaducidad(fechaCaducidad);
		this.setNro_lote(nro_lote);
		this.setPais_orgin(pais_orgin);
	}

	public String getFech_ens() {
		return fech_ens;
	}

	public void setFech_ens(String fech_ens) {
		this.fech_ens = fech_ens;
	}
 

	public int getIdCong() {
		return idCong;
	}


	public void setIdCong(int idCong) {
		this.idCong = idCong;
	}


	@Override
	public String toString() {
		return "ProductoCong [fech_ens=" + fech_ens + "]";
	}
	
	
	
}
