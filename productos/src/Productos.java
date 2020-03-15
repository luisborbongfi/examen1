import java.util.Date;

public class Productos{
	
	private String fechacaducidad;
	private String fechaenvasado;
	private int numerolote;
	private String PaisOrigen;
	private double temperatura;
	
	public Productos(){}
	
	public Productos(String fecha,String fechaenvasado,int numlote,String paisO,double temp) {
		this.fechacaducidad=fecha;
		this.fechaenvasado=fechaenvasado;
		this.numerolote=numlote;
		this.PaisOrigen=paisO;
		this.temperatura=temp;
	}

	public String getFechacaducidad() {
		return fechacaducidad;
	}

	public void setFechacaducidad(String fechacaducidad) {
		this.fechacaducidad = fechacaducidad;
	}

	public int getNumerolote() {
		return numerolote;
	}

	public void setNumerolote(int numerolote) {
		this.numerolote = numerolote;
	}

	public String getPaisOrigen() {
		return PaisOrigen;
	}

	public void setPaisOrigen(String paisOrigen) {
		PaisOrigen = paisOrigen;
	}
	
	public String getFechaenvasado() {
		return fechaenvasado;
	}

	public void setFechaenvasado(String fechaenvasado) {
		this.fechaenvasado = fechaenvasado;
	}

	public double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}

	public void ListarProducto() {
		System.out.println("Informacion de los producto : 1 FechaCaducidad"+this.getFechacaducidad()+"2 Fecha envasado"+this.getFechaenvasado()+"3 Numero de lote"+this.getNumerolote()+"4 Pais Origen"+this.getPaisOrigen()+"5 temperatura"+this.getTemperatura());
	}
	
	
;				
}
	
