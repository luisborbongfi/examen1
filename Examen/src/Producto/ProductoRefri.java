package Producto;

public class ProductoRefri extends Producto {
	private int cod_superv;
	private String fechaenv;
	private int temperatura_env;

	public ProductoRefri() {
		// TODO Auto-generated constructor stub
	}
	
	

	public ProductoRefri(int idProducto, String nombre, String fechaCaducidad, long nro_lote, String pais_orgin) {
		//super(idProducto, nombre, fechaCaducidad, nro_lote, pais_orgin);
		this.setIdProducto(idProducto);
		this.setNombre(nombre);
		this.setFechaCaducidad(fechaCaducidad);
		this.setNro_lote(nro_lote);
		this.setPais_orgin(pais_orgin);
	
	}
	



	public ProductoRefri(int cod_superv, String fechaenv, int temperatura_env) {
		super();
		this.cod_superv = cod_superv;
		this.fechaenv = fechaenv;
		this.temperatura_env = temperatura_env;
	}



	public int getCod_superv() {
		return cod_superv;
	}

	public void setCod_superv(int cod_superv) {
		this.cod_superv = cod_superv;
	}

	public String getFechaenv() {
		return fechaenv;
	}

	public void setFechaenv(String fechaenv) {
		this.fechaenv = fechaenv;
	}

	public int getTemperatura_env() {
		return temperatura_env;
	}

	public void setTemperatura_env(int temperatura_env) {
		this.temperatura_env = temperatura_env;
	}



	@Override
	public String toString() {
		return "ProductoRefri [cod_superv=" + cod_superv + ", fechaenv=" + fechaenv + ", temperatura_env="
				+ temperatura_env + "]";
	}
	

}
