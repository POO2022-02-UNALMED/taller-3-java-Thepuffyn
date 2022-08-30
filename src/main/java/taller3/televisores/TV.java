package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal = 1;
	private int precio = 500;
	private boolean estado;
	private int volumen = 1;
	private Control control;
	private static int numTV;
	
 	public TV (Marca mar, boolean est) {
		marca = mar;
		estado = est;
		numTV++;
	}
	
	public Marca getMarca() {
		return marca;
	}
	public void setMarca(Marca mar) {
		marca = mar;
	}
	
	public Control getControl() {
		return control;
	}
	public void setControl(Control con) {
		control = con;
	}
	
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int prec) {
		precio = prec;
	}
	
	public int getVolumen() {
		return volumen;
	}
	public void setVolumen(int vol) {
		if (estado == true && vol<=7 && vol>=0) {
			volumen = vol;
		}
	}
	public void volumenUp() {
		if (estado == true && volumen != 7) {
			++volumen;
		}
	}
	public void volumenDown() {
		if (estado == true && volumen != 0) {
			--volumen;
		}
	}
	
	public int getCanal() {
		return canal;
	}
	public void setCanal(int can) {
		if (estado == true && can<=120 && can>=1) {
			canal = can;
		}
	}
	public void canalUp() {
		if (estado == true && canal != 120) {
			++canal;
		}
	}
	public void canalDown() {
		if (estado == true && canal != 1) {
			--canal;
		}
	}
	
	public static int getNumTV() {
		return numTV;
	}
	public static void setNumTV(int num) {
		numTV = num;
	}
	
	public void turnOn() {
		estado = true;
	}
	public void turnOff() {
		estado = false;
	}
	public boolean getEstado() {
		return estado;
	}
}