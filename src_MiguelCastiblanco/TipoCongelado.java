
public abstract class TipoCongelado {
	private int IdTipoCongelado;
	
	public TipoCongelado() {}
	public TipoCongelado(int tipo) {
		this.IdTipoCongelado = tipo;
	}
	
	public abstract String infoTipoCongelado();
	
	//GETERS Y SETERS
	public void setTipoCongelado(int tipo) {
		this.IdTipoCongelado = tipo;
	}
	public int getTipoCongelado() {
		return this.IdTipoCongelado;
	}
	
	
}
