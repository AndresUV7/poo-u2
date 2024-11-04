package uni1a.models;

import lombok.Getter;
import lombok.experimental.SuperBuilder;
import uni1a.ContenidoAudiovisual;

@Getter
@SuperBuilder
public class AnuncioPublicitario extends ContenidoAudiovisual {
	
	private String marca;
	private TipoAnuncio tipoAnuncio;
	
	@Override
	public void mostrarDetalles() {
		System.out.println("------------------------------------");
		System.out.println("Detalles del Anuncio Publicitario:");
		System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
		System.out.println("Marca: " + marca);
		System.out.println("Tipo de Anuncio: " + tipoAnuncio);
		System.out.println("------------------------------------");
	}

}
