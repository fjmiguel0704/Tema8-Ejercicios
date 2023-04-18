package ejercicio3;

public class Perecedero extends Productos{
	int diasCaducar;
	
	public Perecedero(String nombre, double precio, int diasCaducar) {
		super(nombre, precio);
		this.diasCaducar = diasCaducar;
	}

	public int getDiasCaducar() {
		return diasCaducar;
	}

	public void setDiasCaducar(int diasCaducar) {
		this.diasCaducar = diasCaducar;
	}
	
	double calcular(int cantidad) {
		double result = super.calcular(cantidad); 
		
		if (diasCaducar==1) {
			result/=4;
		} 
		if (diasCaducar==2) {
			result/=3;
		}
		if (diasCaducar==3) {
			result/=2;
		}
		
		return result;
	}

	@Override
	public String toString() {
		return super.toString()+", Dias a caducar=" + diasCaducar;
	}
	
	
}
