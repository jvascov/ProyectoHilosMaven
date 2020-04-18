package co.com.udem.dto;

public class EmpleadoDTO {

	String nombres;
	String apellidos;
	String cedula;
	String deptoEmpresa;
	Double salario;

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getDeptoEmpresa() {
		return deptoEmpresa;
	}

	public void setDeptoEmpresa(String deptoEmpresa) {
		this.deptoEmpresa = deptoEmpresa;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

}
