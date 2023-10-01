package vehiculos;


public class Camioneta extends Vehiculo {
	private boolean volco;
	public static int cantidadCamioneta;
	public Camioneta(String placa,int puertas,String nombre,int precio,int peso,Fabricante fabricante,boolean volco){
		super(placa,puertas,90,nombre,precio,peso,"4X4",fabricante);
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
