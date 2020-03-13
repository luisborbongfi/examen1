import java.util.Date;

public class Congelado extends Producto{
	
	private float TempMantenimiento;
	private int TipoCongelado;
	private TipoCongelado ObjTipoCongelado;
	
	
	public Congelado(Date fCaducidad, int lote,Date fEnvasado,String pais, float tmpMant, int tipoCong, TipoCongelado objTipoCong) {
		super(fCaducidad, lote, fEnvasado, pais);
		this.TempMantenimiento = tmpMant;
		this.TipoCongelado = tipoCong;
		this.ObjTipoCongelado = objTipoCong;
	}
	
	@Override
	public String toString() {
		return "PRODUCTO CONGELADO: " + super.toString() + "Temperatura Mantenimiento: " + this.TempMantenimiento + "C°, " + this.ObjTipoCongelado.infoTipoCongelado();
	}
	
	//GETERS Y SETERS
	public void setTempMantenimiento(float tmpMant) {
		this.TempMantenimiento = tmpMant;
	}
	public float getTempMantenimiento() {
		return this.TempMantenimiento;
	}
	
	public void setTipoCongelado(int tipoCong) {
		this.TipoCongelado = tipoCong;
	}
	public int getTipoCongelado() {
		return this.TipoCongelado;
	}
	
	public void setObjTipoCongelado(TipoCongelado objTipoCong) {
		this.ObjTipoCongelado = objTipoCong;
	}
	public TipoCongelado getObjTipoCongelado() {
		return this.ObjTipoCongelado;
	}
	
}
