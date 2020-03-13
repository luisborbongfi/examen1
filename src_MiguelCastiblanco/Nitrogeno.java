
public class Nitrogeno extends TipoCongelado {

	private String MtdCongelacion;
	private int  TiempoExposicion;
	
	public Nitrogeno(String mtdCongela, int tExposicion) {
		super(3);
		this.MtdCongelacion =  mtdCongela;
		this.TiempoExposicion = tExposicion;
	}
	
	@Override
	public String infoTipoCongelado() {
		return "Congelado por Nitrogeno por medio del metodo de congelacion: " +this.MtdCongelacion +", con un tiempo de Exposicion de: " + this.TiempoExposicion +" segundos.";
	}
	
	//GETERS Y SETERS
	public void setMtdCongelacion(String mtdCongela) {
		this.MtdCongelacion =  mtdCongela;
	}
	public String getMtdCongelacion() {
		return this.MtdCongelacion;
	}
	
	public void setTiempoExposicion(int tExposicion) {
		this.TiempoExposicion = tExposicion;
	}
	public int getTiempoExposicion() {
		return this.TiempoExposicion;
	}
	
}
