package vehiculos;

public class Vehiculo {
	protected String placa;
	protected int puertas;
	protected int velocidadMaxima;
	protected String nombre;
	protected int precio;
	protected int peso;
	protected String traccion;
	protected Fabricante fabricante;
	protected static int cantidadVehiculos;
	public Vehiculo(String placa,int puertas,int velocidadMaxima,String nombre,int precio,int peso,String traccion,Fabricante fabricante){
		this.placa=placa;
		this.puertas=puertas;
		this.velocidadMaxima=velocidadMaxima;
		this.nombre=nombre;
		this.precio=precio;
		this.peso=peso;
		this.traccion=traccion;
		this.fabricante=fabricante;
		cantidadVehiculos++;
		
	}
public static String vehiculosPorTipo() {
	return "Automoviles: " + Automovil.getCantidadAutomovil() + "\nCamionetas: " + Camioneta.getCantidadCamioneta() + "\nCamiones: " + Camion.getCantidadCamion() ;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre=nombre;
}
public String getPlaca() {
	return placa;
}
public void setPlaca(String placa) {
	this.placa=placa;
}
public int getPuertas() {
	return puertas;
}
public void setPuertas(int puertas) {
	this.puertas=puertas;
}
public int getVelocidadMaxima() {
	return velocidadMaxima;
}
public void setVelocidadMaxima(int velocidadMaxima) {
	this.velocidadMaxima=velocidadMaxima;
}
public void setPrecio(int precio) {
	this.precio=precio;
}
public int getPrecio() {
	return precio;
}
public void setPeso(int peso) {
	this.peso=peso;
}
public int getPeso() {
	return peso;
}
public String getTraccion() {
	return traccion;
}
public void setTraccion(String traccion) {
	this.traccion=traccion;
}
public Fabricante getFabricante() {
	return fabricante;
}
public void setFabricante(Fabricante fabricante) {
	this.fabricante=fabricante;
}
public static int getCantidadVehiculos() {
	return cantidadVehiculos;
}
public static void setCantidadVehiculos(int cantidadVehiculo) {
	cantidadVehiculo=cantidadVehiculos;
}

}
