package Interfaz;

public class Colectivo implements Ivelocidad  {

	private int patente;
	private String nombreEmpresa;
	
	public Colectivo()
	{
		patente=000;
		nombreEmpresa="Sin empresa";
	}
	
	public Colectivo(int patente,String nombreEmpresa)
	{
		this.patente=patente;
		this.nombreEmpresa=nombreEmpresa;
	}

	@Override
	public String toString() {
		return "Colectivo [patente=" + patente + ", nombreEmpresa=" + nombreEmpresa + "]";
	}

	@Override
	public String velicidad() {
		// TODO Auto-generated method stub
		return "Velocidad 60-100km/h";
	}
	
	public void imprimir()
	{
		System.out.println(toString()+" "+velicidad());
	}
	
	
}
