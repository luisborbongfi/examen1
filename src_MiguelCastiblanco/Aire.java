
public class Aire extends TipoCongelado{

	private float PgNitrogeno;
	private float PgOxigeno;
	private float PgDioxidoC;
	private float PgVaporAgua;
	
	
	public Aire (float pgNitrogeno,float pgOxigeno,float pgDioxidoC,float pgVaporAgua) {
		super(1);
		this.PgNitrogeno = pgNitrogeno;
		this.PgOxigeno = pgOxigeno;
		this.PgDioxidoC = pgDioxidoC;
		this.PgVaporAgua = pgVaporAgua;
	}
	
	@Override
	public String infoTipoCongelado() {
		return "Congelado por Aire Nitrogeno: " + this.PgNitrogeno + "%, Oxigeno: "+ this.PgOxigeno + "%, Dioxido de Carbono: " + this.PgDioxidoC + "%, Vapor Agua: " +this.PgVaporAgua + "%.";
	}
	
	
	//GETERS Y SETERS
	public void setPgNitrogeno(float pgNitrogeno) {
		this.PgNitrogeno = pgNitrogeno;
	}
	public float getPgNitrogeno() {
		return this.PgNitrogeno;
	}
	
	public void setPgOxigeno(float pgOxigeno) {
		this.PgOxigeno = pgOxigeno;
	}
	public float getPgOxigeno() {
		return this.PgOxigeno;
	}
	
	public void setPgDioxidoC(float pgDioxidoC) {
		this.PgDioxidoC = pgDioxidoC;
	}
	public float getPgDioxidoC() {
		return this.PgDioxidoC;
	}
	
	public void setPgVaporAgua(float pgVaporAgua) {
		this.PgVaporAgua = pgVaporAgua;
	}
	public float getPgVaporAgua() {
		return this.PgVaporAgua;
	}
	
	
}
