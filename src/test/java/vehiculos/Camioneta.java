package vehiculos;

public class Camioneta extends Vehiculo {
	private boolean volco;
	public static int cantidadCamioneta;
	public Camioneta(String placa,String nombre,int precio,int peso,Fabricante fabricante,boolean volco){
		super(placa,2,80,nombre,precio,peso,"4X2",fabricante);
		this.volco=volco;
		cantidadCamioneta++;
	}
	public static int getCantidadCamioneta() {
	return cantidadCamioneta;
	}
public boolean isVolco() {
	return volco;
}
public void setVolco(boolean volco) {
	this.volco=volco;
}


}
