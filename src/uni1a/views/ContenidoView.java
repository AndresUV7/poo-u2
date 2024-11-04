package uni1a.views;

import java.util.Set;
import uni1a.ContenidoAudiovisual;


public class ContenidoView {

    public void mostrarMenuPrincipal() {
        System.out.println("""
                1. Peliculas
                2. Series de TV
                3. Documentales
                4. Anuncios Publicitarios
                5. Videos Youtube
                6. Salir
                """);
    }

    public void mostrarMenuTipo(String tipoContenido) {
        System.out.printf("""
                1. Listar %s
                2. Ver detalles de %s
                3. Agregar %s
                4. Eliminar %s
                5. Volver
                """, 
                tipoContenido, tipoContenido, tipoContenido, 
                tipoContenido, tipoContenido);
    }

    public void listar(Set<ContenidoAudiovisual> contenidos, String tipoContenido) {
        System.out.println("Lista de " + tipoContenido + "("+contenidos.size()+"):");
        if (contenidos.isEmpty()) {
            System.out.println("No hay contenidos disponibles.");
            return;
        }
        for (ContenidoAudiovisual contenido : contenidos) {
            System.out.println(contenido.getId() + ". " + contenido.getTitulo());
        }
    }

    public void mostrarDetalle(ContenidoAudiovisual contenido) {
        if (contenido == null) {
            System.out.println("El contenido no existe.");
            return;
        }
        System.out.println("Detalles de " + contenido.getTitulo() + ":");
        contenido.mostrarDetalles();
    }

}
