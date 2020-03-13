package ProdCong;

public class ProdCong_Agua extends ProductoCong{
    
	private double info_salinidad;
	
	
	public ProdCong_Agua() {
		// TODO Auto-generated constructor stub
	}
	

	public ProdCong_Agua(int idProducto, String nombre, String fechaCaducidad, long nro_lote, String pais_orgin) {
		super(idProducto, nombre, fechaCaducidad, nro_lote, pais_orgin);
		
		
	}


	public ProdCong_Agua(String fech_ens) {
		super(fech_ens);
		this.setFech_ens(fech_ens);
	}


	public ProdCong_Agua(double info_salinidad) {
		super();
		this.info_salinidad = info_salinidad;
		
	}

 
	public double getInfo_salinidad() {
		return info_salinidad;
	}

	public void setInfo_salinidad(double a) {
		this.info_salinidad = a;
	}



	@Override
	public String toString() {
		return "ProdCong_Agua [info_salinidad=" + info_salinidad + "]";
	}

	
	
	
}
