package pe.edu.cibertec.formulario;

public class UsuarioForm {

	private String nombre;
	private String clave;

	public UsuarioForm() {
		super();
	}

	public UsuarioForm(String nombre, String clave) {
		super();
		this.nombre = nombre;
		this.clave = clave;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

}
