package ProdCong;

public class Prod_cong_Nitr extends ProductoCong{
	
	private String info_cong;
	private int temp_expo;

	public Prod_cong_Nitr() {
		// TODO Auto-generated constructor stub
	}
	

	public Prod_cong_Nitr(int idProducto, String nombre, String fechaCaducidad, long nro_lote, String pais_orgin) {
		super(idProducto, nombre, fechaCaducidad, nro_lote, pais_orgin);
		// TODO Auto-generated constructor stub
	}


	public Prod_cong_Nitr(String fech_ens) {
		super(fech_ens);
		// TODO Auto-generated constructor stub
	}


	public Prod_cong_Nitr(String info_cong, int temp_expo) {
		super();
		this.info_cong = info_cong;
		this.temp_expo = temp_expo;
	}


	public String getInfo_cong() {
		return info_cong;
	}

	public void setInfo_cong(String info_cong) {
		this.info_cong = info_cong;
	}

	public int getTemp_expo() {
		return temp_expo;
	}

	public void setTemp_expo(int temp_expo) {
		this.temp_expo = temp_expo;
	}




	@Override
	public String toString() {
		return "Prod_cong_Nitr [info_cong=" + info_cong + ", temp_expo=" + temp_expo + "]";
	}

	
}
