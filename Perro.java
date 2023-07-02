package Interfaz;

public class Perro implements Ivelocidad{
	
	private int edad;
	private String raza;
	
	public Perro()
	{
		edad=2;
		raza="indefinida";
	}
	
	public Perro(int edad,String raza)
	{
		this.edad=edad;
		this.raza=raza;
	}

	public void imprimir()
	{
		System.out.println(this.toString() +" "+ velicidad());
	}
	
	@Override
	public String toString() {
		return "Perro [edad=" + edad + ", raza=" + raza + "]";
	}

	
	@Override
	public String velicidad() {
		// TODO Auto-generated method stub
		return "Velocidad 40-45km/h";
	}
	
}
