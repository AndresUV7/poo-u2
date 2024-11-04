package poo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

import uni1a.ContenidoAudiovisual;
import uni1a.Documental;
import uni1a.Pelicula;
import uni1a.SerieDeTV;
import uni1a.controllers.ContenidoController;
import uni1a.controllers.PersonaController;
import uni1a.models.AnuncioPublicitario;
import uni1a.models.Investigador;
import uni1a.models.TipoAnuncio;
import uni1a.models.VideoYoutube;
import uni1a.views.ContenidoView;
import uni1a.views.PersonaView;

public class PruebaAudioVisual {
    public static void main(String[] args) {

        Set<ContenidoAudiovisual> contenidos = new HashSet<>();
        contenidos.add(new Pelicula("Avatar", 125, "Accion", "20th Century Studios"));
        contenidos.add(new Pelicula("Inception", 148, "Ciencia Ficción", "Warner Bros"));

        // Crear una serie
        SerieDeTV breakingBad = new SerieDeTV("Breaking Bad", 3000, "Drama");

        // Agregar temporadas usando el método
        breakingBad.agregarTemporada(1, 7, "Primera temporada", 2008);
        breakingBad.agregarTemporada(2, 13, "Segunda temporada", 2009);
        breakingBad.agregarTemporada(3, 13, "Tercera temporada", 2010);

        contenidos.add(breakingBad);

        Investigador investigador1 = Investigador.builder()
                .nombre("Alice Smith")
                .aniosExperiencia(5)
                .usuarioLinkedin("https://linkedin.com/in/alice-smith")
                .documentales(new HashSet<>()) // Inicializar el conjunto de documentales
                .build();

        Investigador investigador2 = Investigador.builder()
                .nombre("Bob Johnson")
                .aniosExperiencia(3)
                .usuarioLinkedin("https://linkedin.com/in/bob-johnson")
                .documentales(new HashSet<>()) // Inicializar el conjunto de documentales
                .build();

        // Crear un conjunto de investigadores
        Set<Investigador> investigadores = new HashSet<>();
        investigadores.add(investigador1);
        investigadores.add(investigador2);

        // Crear un objeto Documental
        Documental documental = new Documental(
                "El Maravilloso Mundo de los Animales", // Título
                45, // Duración en minutos
                "Documental", // Género
                "Vida Salvaje", // Tema
                investigadores // Conjunto de investigadores
        );

        contenidos.add(documental);

        // Crear un objeto AnuncioPublicitario
        AnuncioPublicitario anuncio = AnuncioPublicitario.builder()
                .titulo("Promoción de Verano") // Título del anuncio
                .duracionEnMinutos(30) // Duración en minutos
                .genero("Comedia") // Género del anuncio
                .marca("Marca Ejemplo") // Marca del anuncio
                .tipoAnuncio(TipoAnuncio.TELEVISION) // Tipo de anuncio
                .build();

        contenidos.add(anuncio);

        // Crear un objeto VideoYoutube
        VideoYoutube video = VideoYoutube.builder()
                .titulo("Tutorial de Programación Java") // Título del video
                .duracionEnMinutos(15) // Duración en minutos
                .genero("Educativo") // Género del video
                .vistas(1000) // Número de vistas
                .likes(150) // Número de likes
                .build();

        contenidos.add(video);

        ContenidoView contenidoView = new ContenidoView();
        PersonaView personaView = new PersonaView();

        ContenidoController contenidoController = new ContenidoController();
        contenidoController.setView(contenidoView);

        PersonaController personaController = new PersonaController();

        boolean validMainMenuInput = false;

        System.out.println("""
                Ingrese una de las opciones:
                    1. Contenido Audiovisual
                    2. Personas
                    3. Salir
                    """);

        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        // Declaramos una variable para controlar el ingreso de opciones
        int mainMenuInput = 0;

        while (!validMainMenuInput) {
            if (input.hasNextInt()) {
                // Tomamos el valor ingresado por teclado
                // Verificamos que la entrada del usuario sea un valor entero
                mainMenuInput = input.nextInt();
                // Actualizamos la bandera para validación de opción ingresada
                // validando contra las opciones del menú
                validMainMenuInput = mainMenuInput > 0 && mainMenuInput < 4;
            }
            // Si el valor ingresado por teclado no supera las validaciones, presentamos un
            // mensaje de error
            if (!validMainMenuInput) {
                System.out.println("Entrada inválida. Debe ingresar un número de la lista opciones: 1 o 2. ");
                // Avanza el cursor
                input.nextLine();
            }
        }

        // Avanza el cursor para leer la siguiente entrada
        input.nextLine();

        switch (mainMenuInput) {
            case 1:
                contenidoView.mostrarMenuPrincipal();
                break;

            case 2:
                personaView.mostrarMenuPrincipal();
                break;

            case 3:
                System.out.println("Gracias por usar el sistema. ¡Hasta pronto!");
                break;
            default:
                break;
        }

        int menuInput = 0;

        boolean validMenuInput = false;

        while (!validMenuInput) {
            if (input.hasNextInt()) {
                // Tomamos el valor ingresado por teclado
                // Verificamos que la entrada del usuario sea un valor entero
                menuInput = input.nextInt();
                // Actualizamos la bandera para validación de opción ingresada
                // validando contra las opciones del menú
                validMenuInput = menuInput > 0 && menuInput < 7;
            }
            // Si el valor ingresado por teclado no supera las validaciones, presentamos un
            // mensaje de error
            if (!validMenuInput) {
                System.out.println("Entrada inválida. Debe ingresar un número de la lista opciones ");
                // Avanza el cursor
                input.nextLine();
            }
        }

        // Avanza el cursor para leer la siguiente entrada
        input.nextLine();

        switch (menuInput) {
            case 1:
                contenidoView.mostrarMenuTipo("Peliculas");
                break;

            case 2:
                contenidoView.mostrarMenuTipo("Series de TV");
                break;

            case 3:
                contenidoView.mostrarMenuTipo("Documentales");
                break;

            case 4:
                contenidoView.mostrarMenuTipo("Anuncios Publicitarios");
                break;

            case 5:
                contenidoView.mostrarMenuTipo("Videos Youtube");
                break;

            case 6:
                System.out.println("Gracias por usar el sistema. ¡Hasta pronto!");
            default:
                break;
        }

        int optionInput = 0;

        boolean validOptionInput = false;

        while (!validOptionInput) {
            if (input.hasNextInt()) {
                // Tomamos el valor ingresado por teclado
                // Verificamos que la entrada del usuario sea un valor entero
                optionInput = input.nextInt();
                // Actualizamos la bandera para validación de opción ingresada
                // validando contra las opciones del menú
                validOptionInput = optionInput > 0 && optionInput < 7;
            }
            // Si el valor ingresado por teclado no supera las validaciones, presentamos un
            // mensaje de error
            if (!validOptionInput) {
                System.out.println("Entrada inválida. Debe ingresar un número de la lista opciones ");
                // Avanza el cursor
                input.nextLine();
            }
        }

        input.nextLine();

        switch (optionInput) {
            case 1:
                if (menuInput == 1) {
                    contenidoController.listarContenidos(contenidos, "Peliculas", Pelicula.class);
                }

                if (menuInput == 2) {
                    contenidoController.listarContenidos(contenidos, "Series de TV", SerieDeTV.class);
                }

                if (menuInput == 3) {
                    contenidoController.listarContenidos(contenidos, "Documentales", Documental.class);
                }

                if (menuInput == 4) {
                    contenidoController.listarContenidos(contenidos, "Anuncios Publicitarios",
                            AnuncioPublicitario.class);
                }

                if (menuInput == 5) {
                    contenidoController.listarContenidos(contenidos, "Videos Youtube", VideoYoutube.class);
                }
                break;

            case 2:
                System.out.println("Ingrese el ID del contenido: ");
                int filtroId = input.nextInt();
                if (menuInput == 1) {
                    contenidoController.obtenerContenidoPorId(contenidos, filtroId, Pelicula.class);
                }

                if (menuInput == 2) {
                    contenidoController.obtenerContenidoPorId(contenidos, filtroId, SerieDeTV.class);
                }

                if (menuInput == 3) {
                    contenidoController.obtenerContenidoPorId(contenidos, filtroId, Documental.class);
                }

                if (menuInput == 4) {
                    contenidoController.obtenerContenidoPorId(contenidos, filtroId, AnuncioPublicitario.class);
                }

                if (menuInput == 5) {
                    contenidoController.obtenerContenidoPorId(contenidos, filtroId, VideoYoutube.class);
                }

                break;

            case 3:
                if (menuInput == 1) {
                    System.out.println("Nombre de la película: ");
                    String nombrePelicula = input.nextLine();
                    System.out.println("Duración de la película: ");
                    int duracionPelicula = input.nextInt();
                    input.nextLine();
                    System.out.println("Genero de la película: ");
                    String generoPelicula = input.nextLine();
                    System.out.println("Estudio de la película: ");
                    String estudioPelicula = input.nextLine();
                    Pelicula nuevaPelicula = new Pelicula(nombrePelicula, duracionPelicula, generoPelicula,
                            estudioPelicula);
                    contenidos.add(nuevaPelicula);
                }

                if (menuInput == 2) {

                    // Solicitar el nombre de la serie
                    System.out.println("Nombre de la serie: ");
                    String nombreSerie = input.nextLine();

                    // Solicitar la duración de la serie
                    System.out.println("Duración de la serie (en minutos): ");
                    int duracionSerie = input.nextInt();

                    // Solicitar el género de la serie
                    System.out.println("Género de la serie: ");
                    String generoSerie = input.nextLine();

                    // Crear la instancia de SerieDeTV
                    SerieDeTV nuevaSerie = new SerieDeTV(nombreSerie, duracionSerie, generoSerie);

                    // Agregar temporadas (puedes agregar un loop si quieres permitir múltiples
                    // temporadas)
                    System.out.println("¿Cuántas temporadas quieres agregar?");
                    int numeroTemporadas = input.nextInt();

                    for (int i = 1; i <= numeroTemporadas; i++) {
                        System.out.println("Agregar Temporada " + i);

                        System.out.println("Número de temporada: ");
                        int numeroTemporada = input.nextInt();

                        System.out.println("Número de episodios: ");
                        int numeroEpisodios = input.nextInt();

                        // Consumir la nueva línea pendiente
                        input.nextLine();

                        System.out.println("Descripción de la temporada: ");
                        String descripcionTemporada = input.nextLine();

                        System.out.println("Año de la temporada: ");
                        int añoTemporada = input.nextInt();

                        // Agregar la temporada a la serie
                        nuevaSerie.agregarTemporada(numeroTemporada, numeroEpisodios, descripcionTemporada,
                                añoTemporada);
                    }

                    // Agregar la nueva serie a la lista de contenidos
                    contenidos.add(nuevaSerie);

                }

                if (menuInput == 3) {
                    // Crear un conjunto para los investigadores
                    Set<Investigador> _investigadores = new HashSet<>();

                    System.out.println("¿Cuántos investigadores quieres agregar?");
                    int numeroInvestigadores = input.nextInt();
                    input.nextLine(); // Limpiar el buffer

                    for (int i = 0; i < numeroInvestigadores; i++) {
                        System.out.println("Agregar Investigador " + (i + 1));

                        System.out.println("Nombre del investigador: ");
                        String nombreInvestigador = input.nextLine();

                        System.out.println("Años de experiencia: ");
                        int aniosExperiencia = input.nextInt();

                        input.nextLine(); // Limpiar el buffer después de nextInt()

                        System.out.println("Usuario de LinkedIn: ");
                        String usuarioLinkedin = input.nextLine();

                        // Crear el investigador usando el patrón builder
                        Investigador investigador = Investigador.builder()
                                .nombre(nombreInvestigador)
                                .aniosExperiencia(aniosExperiencia)
                                .usuarioLinkedin(usuarioLinkedin)
                                .documentales(new HashSet<>()) // Inicializar el conjunto de documentales
                                .build();

                        // Agregar investigador al conjunto
                        _investigadores.add(investigador);
                    }

                    // Solicitar información del documental
                    System.out.println("Título del documental: ");
                    String tituloDocumental = input.nextLine();

                    System.out.println("Duración del documental (en minutos): ");
                    int duracionDocumental = input.nextInt();

                    input.nextLine(); // Limpiar el buffer

                    System.out.println("Género del documental: ");
                    String generoDocumental = input.nextLine();

                    System.out.println("Tema del documental: ");
                    String temaDocumental = input.nextLine();

                    // Crear el objeto Documental
                    Documental _documental = new Documental(
                            tituloDocumental, // Título
                            duracionDocumental, // Duración en minutos
                            generoDocumental, // Género
                            temaDocumental, // Tema
                            _investigadores // Conjunto de investigadores
                    );

                    // Agregar el documental a la colección de contenidos
                    contenidos.add(_documental);
                }

                if (menuInput == 4) {
                    // Información del anuncio publicitario
                    System.out.println("Título del anuncio: ");
                    String tituloAnuncio = input.nextLine();

                    System.out.println("Duración del anuncio (en minutos): ");
                    int duracionAnuncio = input.nextInt();

                    input.nextLine(); // Limpiar el buffer

                    System.out.println("Género del anuncio: ");
                    String generoAnuncio = input.nextLine();

                    System.out.println("Marca del anuncio: ");
                    String marcaAnuncio = input.nextLine();

                    System.out.println("Tipo de anuncio (TELEVISION, INTERNET, RADIO): ");
                    String tipoAnuncioInput = input.nextLine();

                    TipoAnuncio tipoAnuncio;
                    try {
                        tipoAnuncio = TipoAnuncio.valueOf(tipoAnuncioInput.toUpperCase());
                    } catch (IllegalArgumentException e) {
                        System.out.println("Tipo de anuncio inválido. Se asignará el tipo TELEVISION por defecto.");
                        tipoAnuncio = TipoAnuncio.TELEVISION; // Asignar un valor por defecto si hay un error
                    }

                    // Crear el objeto AnuncioPublicitario
                    AnuncioPublicitario _anuncio = AnuncioPublicitario.builder()
                            .titulo(tituloAnuncio)
                            .duracionEnMinutos(duracionAnuncio)
                            .genero(generoAnuncio)
                            .marca(marcaAnuncio)
                            .tipoAnuncio(tipoAnuncio)
                            .build();

                    // Agregar el anuncio a la colección de contenidos
                    contenidos.add(_anuncio);
                }

                if (menuInput == 5) {
                    // Información del video de YouTube
                    System.out.println("Título del video: ");
                    String tituloVideo = input.nextLine();

                    System.out.println("Duración del video (en minutos): ");
                    int duracionVideo = input.nextInt();

                    System.out.println("Número de vistas: ");
                    int vistasVideo = input.nextInt();

                    System.out.println("Número de likes: ");
                    int likesVideo = input.nextInt();

                    // Crear el objeto VideoYoutube
                    VideoYoutube _video = VideoYoutube.builder()
                            .titulo(tituloVideo)
                            .duracionEnMinutos(duracionVideo)
                            .genero("Educativo") // Puedes cambiar esto si deseas pedir el género
                            .vistas(vistasVideo)
                            .likes(likesVideo)
                            .build();

                    // Agregar el video a la colección de contenidos
                    contenidos.add(_video);
                }

                System.out.println("Contenido agregado exitosamente:");
                List<ContenidoAudiovisual> _contenidos = new ArrayList<>(contenidos);
                _contenidos.get(_contenidos.size() - 1).mostrarDetalles();
                break;

            case 4:
                System.out.println("Ingrese el ID del contenido a ELIMINAR: ");
                int idEliminar = input.nextInt();
                contenidos.removeIf(contenido -> contenido.getId() == idEliminar);
                if (menuInput == 1) {
                    contenidoController.listarContenidos(contenidos, "Peliculas", Pelicula.class);
                }

                if (menuInput == 2) {
                    contenidoController.listarContenidos(contenidos, "Series de TV", SerieDeTV.class);
                }

                if (menuInput == 3) {
                    contenidoController.listarContenidos(contenidos, "Documentales", Documental.class);
                }

                if (menuInput == 4) {
                    contenidoController.listarContenidos(contenidos, "Anuncios Publicitarios",
                            AnuncioPublicitario.class);
                }

                if (menuInput == 5) {
                    contenidoController.listarContenidos(contenidos, "Videos Youtube", VideoYoutube.class);
                }

                break;

            case 5:
                System.out.println("Gracias por usar el sistema. ¡Hasta pronto!");
            default:
                break;
        }
        // Una vez recibido el número correctamente, cerramos el objeto Scanner
        input.close();

    }
}