
public class Agua extends TipoCongelado {

	private float PgSanidad;
	private float GramosSalxLitro;
	
	public Agua(float sanidad, float gramos) {
		super(2);
		this.PgSanidad = sanidad;
		this.GramosSalxLitro = gramos;
	}
	
	@Override
	public String infoTipoCongelado() {
		return "Congelado por Agua Procentaje de Sanidad: " + this.PgSanidad + "% y la cantidad de Gramos de Sal por Litro es: " + this.GramosSalxLitro + "g.";
	}
	
	//GETERS Y SETERS
	public void setPgSanidad(float sanidad) {
		this.PgSanidad = sanidad;
	}
	public float getPgSanidad() {
		return this.PgSanidad;
	}
	
	public void setGramosSalxLitro(float gramos) {
		this.GramosSalxLitro = gramos;
	}
	public float getGramosSalxLitro() {
		return this.GramosSalxLitro;
	}

}
