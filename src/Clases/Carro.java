package Clases;

public class Carro extends Padre{
	private String tipo;
	public Carro(){
		super();
		tipo="carro";
	}
	public Carro(String placa, int anio, String color, double km, String tipo) {
		super(placa, anio, color, km);
		this.tipo=tipo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo=tipo;
	}
	@Override
	public void mostrar() {
		System.out.println("Placa: " + placa + "\n Anio: " + anio + "\n Color: " + color + "\n Kilometraje: " + km + "\n Tipo: " + tipo);
	}
}
