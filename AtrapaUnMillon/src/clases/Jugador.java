package clases;

public class Jugador {

	private String nombre;
	private String apellidos;
	private double dinero;
	private String residencia;
	private int edad;
	private String motivo;
	
	public Jugador(String nombre, String apellidos, double dinero, String residencia, int edad, String motivo) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dinero = dinero;
		this.residencia = residencia;
		this.edad = edad;
		this.motivo = motivo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public double getDinero() {
		return dinero;
	}
	public void setDinero(double dinero) {
		this.dinero = dinero;
	}
	public String getResidencia() {
		return residencia;
	}
	public void setResidencia(String residencia) {
		this.residencia = residencia;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getMotivo() {
		return motivo;
	}
	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	@Override
	public String toString() {
		return "Preguntas [nombre=" + nombre + ", apellidos=" + apellidos + ", dinero=" + dinero + ", residencia="
				+ residencia + ", edad=" + edad + ", motivo=" + motivo + "]";
	}


}
