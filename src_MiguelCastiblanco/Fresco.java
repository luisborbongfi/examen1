import java.util.Date;


public class Fresco extends Producto{
	
	public Fresco(Date fCaducidad, int lote,Date fEnvasado,String pais) {
		super(fCaducidad, lote, fEnvasado, pais);
	}
	
	@Override
	public String toString() {
		return "PRODUCTO FRESCO: " + super.toString();
	}
}
