import java.util.Date;

public class Refrigerado extends Producto{
	private int CodigoOrgSupervisor;
	private float TempMantenimiento;
	
	public Refrigerado(Date fCaducidad, int lote,Date fEnvasado,String pais, int codSupervisor ,float temp) {
		
		super(fCaducidad, lote, fEnvasado, pais);
		
		this.CodigoOrgSupervisor = codSupervisor;
		this.TempMantenimiento = temp;
	}
	
	@Override
	public String toString() {
		return "PRODUCTO REFRIGERADO: " + super.toString() + "CodigoOrgSupervisor: " +this.CodigoOrgSupervisor + " Temperatura Mantenimiento: " + this.TempMantenimiento +"C°";
	}
	
	//GETERS Y SETERS
	public void setCodigoOrgSupervisor(int codSupervisor) {
		this.CodigoOrgSupervisor = codSupervisor;
	}
	public int getCodigoOrgSupervisor() {
		return this.CodigoOrgSupervisor;
	}
	
	public void setTempMantenimiento(float temp) {
		this.TempMantenimiento = temp;
	}
	public float getTempMantenimiento() {
		return this.TempMantenimiento;
	}
	
}
