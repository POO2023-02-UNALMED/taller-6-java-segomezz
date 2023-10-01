package vehiculos;

public class Automovil extends Vehiculo{
	private int puestos;
	private static int cantidadAutomovil;
	public Automovil(String placa,String nombre,int precio,int peso,Fabricante fabricante,int puestos){
		super(placa,4,100,nombre,precio,peso,"FWD",fabricante);
		this.puestos=puestos;
		cantidadAutomovil++;
	}
		
		
	
public static int getCantidadAutomovil() {
	return cantidadAutomovil;
}
public static void setCantidadAutomovil(int cantidadAutomoviles){
	cantidadAutomovil=cantidadAutomoviles;
}
public int getPuestos() {
	return puestos;
}
public void setPuestos(int puestos) {
	this.puestos=puestos;
}

}

