package Producto;

public class Producto {
     private int idProducto;
     private String nombre;
     private String fechaCaducidad;
     private long nro_lote;
     private String pais_orgin;
     public Producto() {
		
	}
     
	public Producto(int idProducto, String nombre, String fechaCaducidad, long nro_lote, String pais_orgin) {
		
		this.idProducto = idProducto;
		this.nombre = nombre;
		this.fechaCaducidad = fechaCaducidad;
		this.nro_lote = nro_lote;
		this.pais_orgin = pais_orgin;
	}

	public int getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getFechaCaducidad() {
		return fechaCaducidad;
	}
	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}
	public long getNro_lote() {
		return nro_lote;
	}
	public void setNro_lote(long nro_lote) {
		this.nro_lote = nro_lote;
	}
	public String getPais_orgin() {
		return pais_orgin;
	}
	public void setPais_orgin(String pais_orgin) {
		this.pais_orgin = pais_orgin;
	}

	@Override
	public String toString() {
		return "Producto [idProducto=" + idProducto + ", nombre=" + nombre + ", fechaCaducidad=" + fechaCaducidad
				+ ", nro_lote=" + nro_lote + ", pais_orgin=" + pais_orgin + "]";
	}
	
	
     
}
