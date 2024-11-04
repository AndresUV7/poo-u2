package uni1a.models;

import java.util.Set;

import lombok.Getter;
import lombok.experimental.SuperBuilder;
import uni1a.Pelicula;

@Getter
@SuperBuilder
public class Actor extends Persona {
	
	private String contacto;
	private String representante;
	private Set<Pelicula> peliculas;
	
	@Override
	public String toString() {
		return "Actor [id=" + super.getId()
				+ ", nombre=" + super.getNombre()
				+ ", contacto=" + contacto 
				+ ", representante=" + representante 
				+ ", peliculas=" 
				+ peliculas + "]";
	}
	
	@Override
	public void mostrarDetalles() {
		
	}
	
}
