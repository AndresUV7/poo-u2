package uni1a.controllers;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import lombok.Data;
import lombok.NoArgsConstructor;
import uni1a.ContenidoAudiovisual;
import uni1a.views.ContenidoView;

@Data
@NoArgsConstructor
public class ContenidoController {
    private ContenidoAudiovisual model;
    private ContenidoView view;

    public void mostrarMenuInicial() {
        view.mostrarMenuPrincipal();
    }

    public void mostrarMenuTipo(String tipoContenido) {
        view.mostrarMenuTipo(tipoContenido);
    }

    public <T extends ContenidoAudiovisual> void listarContenidos(Set<ContenidoAudiovisual> contenidos,
            String tipoContenido, Class<T> clase) {
        Set<ContenidoAudiovisual> contenidosFiltrados = filtrarPorSubclase(contenidos, clase)
                .stream()
                .map(contenido -> (ContenidoAudiovisual) contenido)
                .collect(Collectors.toSet());
        view.listar(contenidosFiltrados, tipoContenido);
    }

    public static <T extends ContenidoAudiovisual> Set<T> filtrarPorSubclase(Set<ContenidoAudiovisual> contenidos,
            Class<T> clase) {
        return contenidos.stream()
                .filter(clase::isInstance)
                .map(clase::cast)
                .collect(Collectors.toSet());
    }

    public  <T extends ContenidoAudiovisual> void obtenerContenidoPorId(Set<ContenidoAudiovisual> contenidos, int filtroId, Class<T> clase ) {

        Optional<T> contenidoFiltrado = filtrarContenidoPorId(contenidos, filtroId, clase);
        if (contenidoFiltrado.isPresent()) {
            view.mostrarDetalle(contenidoFiltrado.get());
        } else {
            view.mostrarDetalle(null); 
        }
    }

    public <T extends ContenidoAudiovisual> Optional<T> filtrarContenidoPorId(Set<ContenidoAudiovisual> contenidos, int filtroId, Class<T> clase) {
        return contenidos.stream()
            .filter(contenido -> contenido.getId() == filtroId && clase.isInstance(contenido))
            .map(clase::cast) // Realiza un cast a la clase deseada
            .findFirst();
    }

}
