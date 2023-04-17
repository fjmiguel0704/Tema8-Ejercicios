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
		super.calcular(cantidad);
		if (diasCaducar==1) {
			precio=precio/4;
		} 
		if (diasCaducar==2) {
			precio=precio/3;
		}
		if (diasCaducar==3) {
			precio=precio/2;
		}
		
		return precio;
	}

	@Override
	public String toString() {
		return super.toString()+", Dias a caducar=" + diasCaducar;
	}
	
	
}
