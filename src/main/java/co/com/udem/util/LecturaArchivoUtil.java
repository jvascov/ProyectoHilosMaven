package co.com.udem.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import co.com.udem.dto.EmpleadoDTO;

public class LecturaArchivoUtil {
	
	String rutaArchivo = "C:\\cargaHilo.txt";

	public void leerArchivo() throws FileNotFoundException {
		
		File archivo = new File(rutaArchivo);
		Scanner sc = new Scanner(archivo);
		
		while (sc.hasNextLine()) {
			String registro = sc.nextLine();
			parseLine(registro);
		}
		
		sc.close();
	}

	private static void parseLine(String registro) {

		Scanner sc = new Scanner(registro);
		sc.useDelimiter(",");
		
		while (sc.hasNext()) {
			EmpleadoDTO empleadoDTO = new EmpleadoDTO();
			empleadoDTO.setNombres(sc.next());
			empleadoDTO.setApellidos(sc.next());
			empleadoDTO.setCedula(sc.next());
			empleadoDTO.setDeptoEmpresa(sc.next());
			empleadoDTO.setSalario(Double.parseDouble(sc.next()));
		}
		
		sc.close();
		
	}
	
	public static void imprimirEmpleado(EmpleadoDTO empleadoDTO) {
		System.out.println(empleadoDTO.getNombres());
		System.out.println(empleadoDTO.getApellidos());
		System.out.println(empleadoDTO.getCedula());
		System.out.println(empleadoDTO.getNombres());
		System.out.println(empleadoDTO.getDeptoEmpresa());
		System.out.println(empleadoDTO.getSalario());
	}
}
