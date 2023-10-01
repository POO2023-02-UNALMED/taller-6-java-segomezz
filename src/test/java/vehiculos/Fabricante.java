package vehiculos;
import java.util.ArrayList;
import java.util.List;

public class Fabricante {
	private String nombre;
	private Pais pais;
	private static List<Fabricante> listadoF = new ArrayList<Fabricante>();
	
	public Fabricante(String nombre,Pais pais){
		this.nombre=nombre;
		this.pais=pais;
		Fabricante.listadoF.add(this);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
	this.pais=pais;
}
	public static Fabricante fabricaMayorVentas() {
		
		Fabricante masVentasFab = null;
		int mayorVentas = 0;
		for (Fabricante fab: listadoF) {
			int cantRepetido = 0;
			for (Fabricante fabVenta: Vehiculo.getListaVentasF()) {
				if (fab == fabVenta) {
					cantRepetido++;
				}
			}
			if (cantRepetido > mayorVentas) {
				mayorVentas = cantRepetido;
				masVentasFab = fab;
			}
			
		}
		return masVentasFab;
	}

	}


