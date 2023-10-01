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
public static void main(String[] args) {
	Pais p = new Pais("Colombia");
	Fabricante f = new Fabricante("Renault", p);
	Vehiculo sandero= new Vehiculo( "sa",4,60,"sachs",12000,39,"fwd",f);
	Vehiculo.setCantidadVehiculos(0);
	Camion c1 =  new Camion("SS", "Camion premium", 1000, 100, f, 3);
	Camion c2 =  new Camion("AA", "Camion", 1000, 100, f, 3);
	Automovil a1 =  new Automovil("NN", "Mac 100", 820, 20, f, 4);
	Camioneta ca1 =  new Camioneta("CC", 5, "Ford", 500, 150, f, true);
	System.out.println(Vehiculo.getCantidadVehiculos());

}
}
