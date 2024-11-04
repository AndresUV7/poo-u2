package uni1a.models;

import lombok.Getter;
import lombok.experimental.SuperBuilder;
import uni1a.ContenidoAudiovisual;

@Getter
@SuperBuilder
public class VideoYoutube extends ContenidoAudiovisual {
	
	private int vistas;
	private int likes;
	
	@Override
	public void mostrarDetalles() {
		System.out.println("------------------------------------");
		System.out.println("Detalles del Video Youtube");
		System.out.println("ID: " + getId());
		System.out.println("Título: " + getTitulo());
		System.out.println("Duración en minutos: " + getDuracionEnMinutos());
		System.out.println("Género: " + getGenero());
		System.out.println("Vistas: " + this.vistas);
		System.out.println("Likes: " + this.likes);
		System.out.println("------------------------------------");
		
	}
}
