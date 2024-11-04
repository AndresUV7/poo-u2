package uni1a.models;

import java.util.Set;

import lombok.Getter;
import lombok.experimental.SuperBuilder;
import uni1a.Documental;


@Getter
@SuperBuilder
public class Investigador extends Persona {
	
	private int aniosExperiencia;
	private String usuarioLinkedin;
	private Set<Documental> documentales;
	
	@Override
	public void mostrarDetalles() {
		
	}
}
