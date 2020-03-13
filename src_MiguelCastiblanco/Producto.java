import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Producto {
	
	private Date FechaCaducidad;
	private int NumeroLote;
	private Date FechaEnvasado;
	private String PaisOrigen;
	
	public Producto() {}
	public Producto(Date fCaducidad, int lote,Date fEnvasado,String pais) {
		
		this.FechaCaducidad=  fCaducidad;
		this.NumeroLote = lote;
		this.FechaEnvasado = fEnvasado;
		this.PaisOrigen = pais;
	}
	
	@Override
	public String toString() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		
		return "FechaCaducidad: " + format.format(this.FechaCaducidad) + " NumeroLote: " + this.NumeroLote + " FechaEnvasado: " + format.format(this.FechaEnvasado) + " PaisOrigen: "+ this.PaisOrigen +" ";
	}
	
	//GETERS Y SETERS
	public void setFechaCaducidad(Date fCaducidad) {
		this.FechaCaducidad = fCaducidad;
	}
	public Date getFechaCaducidad() {
		return this.FechaCaducidad;
	}
	
	public void setNumeroLote(int lote) {
		this.NumeroLote = lote;
	}
	public int getNumeroLote() {
		return this.NumeroLote;
	}
	
	public void setFechaEnvasado(Date fEnvasado) {
		this.FechaEnvasado = fEnvasado;
	}
	public Date getFechaEnvasado() {
		return this.FechaEnvasado;
	}
	
	public void setPaisOrigen(String pais) {
		this.PaisOrigen = pais;
	}
	public String getPaisOrigen() {
		return this.PaisOrigen;
	}
	
	
}
