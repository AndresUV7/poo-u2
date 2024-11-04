/**
 * Class SerieDeTV
 */
package uni1a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Data;

public class SerieDeTV extends ContenidoAudiovisual {

    @Data
    @AllArgsConstructor
    private class Temporada {
        private int numeroTemporada;
        private int numeroEpisodios;
        private String descripcion;
        private int año;
    }

    private Set<Temporada> temporadas;

    public SerieDeTV(String titulo, int duracionEnMinutos, String genero) {
        super(titulo, duracionEnMinutos, genero);
        this.temporadas = new HashSet<>();
    }

    // Método para añadir una temporada de forma controlada
    public void agregarTemporada(int numeroTemporada, int numeroEpisodios, String descripcion, int año) {
        Temporada nuevaTemporada = new Temporada(numeroTemporada, numeroEpisodios, descripcion, año);
        this.temporadas.add(nuevaTemporada);
    }

    // Getter que devuelve una copia del Set de temporadas
    public Set<Temporada> getTemporadas() {
        return new HashSet<>(temporadas);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Temporadas:");
        List<Temporada> temporadasList = new ArrayList<>(temporadas);
        Collections.sort(temporadasList, Comparator.comparingInt(Temporada::getNumeroTemporada));

        for (Temporada temp : temporadasList) {
            System.out.println("\tTemporada " + temp.getNumeroTemporada() +
                    ": " + temp.getNumeroEpisodios() + " episodios" +
                    " (" + temp.getAño() + ") - " + temp.getDescripcion());
        }
        System.out.println();
    }
}