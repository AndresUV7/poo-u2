/**
 * Class Documental
 */
package uni1a;

import java.util.Set;

import uni1a.models.Investigador;

// Subclase Documental que extiende de ContenidoAudiovisual
public class Documental extends ContenidoAudiovisual {
    private String tema;
    private Set<Investigador> investigadores;

    public Documental(String titulo, int duracionEnMinutos, String genero, String tema, Set<Investigador> investigadores) {
        super(titulo, duracionEnMinutos, genero);
        this.tema = tema;
        this.investigadores = investigadores;
    }


	public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
    
    public Set<Investigador> getInvestigadores() {
		return investigadores;
	}

    public boolean agregarInvestigador(Investigador investigador) {
        if (investigador == null) {
            return false;
        }
        return investigadores.add(investigador);
    }

    // Método para editar un investigador
    public boolean editarInvestigador(Investigador investigadorAntiguo, Investigador investigadorNuevo) {
        if (investigadorAntiguo == null || investigadorNuevo == null) {
            return false;
        }
        
        if (investigadores.contains(investigadorAntiguo)) {
            investigadores.remove(investigadorAntiguo);
            investigadores.add(investigadorNuevo);
            return true;
        }
        return false;
    }

    // Método para eliminar un investigador
    public boolean eliminarInvestigador(Investigador investigador) {
        if (investigador == null) {
            return false;
        }
        return investigadores.remove(investigador);
    }
    
    @Override
    public void mostrarDetalles() {
		System.out.println("------------------------------------");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Tema: " + this.tema);
        System.out.println("------------------------------------");
    }

}