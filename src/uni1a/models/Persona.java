package uni1a.models;

import java.time.LocalDate;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public abstract class Persona {

	private final Integer id = generarId();
	private String nombre;
	private String nacionalidad;
	private LocalDate fechaNacimiento;

	private static int contador = 0;

	private static synchronized Integer generarId() {
		return ++contador;
	}

	public abstract void mostrarDetalles();

}
