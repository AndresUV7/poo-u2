package uni1a.views;

import java.util.Set;

import uni1a.models.Persona;

public class PersonaView {
    public void mostrarMenuPrincipal() {
        System.out.println("""
                1. Actores
                2. Investigadores
                3. Volver
                """);
    }

    public void mostrarMenuTipo(String tipoPersona) {
        System.out.printf("""
                1. Listar %ss
                2. Ver detalles de %s
                3. Agregar %s
                4. Actualizar %s
                5. Eliminar %s
                6. Volver
                """, 
                tipoPersona, tipoPersona, tipoPersona, 
                tipoPersona, tipoPersona);
    }

     public void listar(Set<Persona> personas) {
        if (personas.isEmpty()) {
            System.out.println("No hay personas disponibles.");
            return;
        }
        for (Persona persona : personas) {
            System.out.println(persona.getId() + ". " + persona.getNombre());
        }
    }

    public void mostrarDetalle(Persona persona) {
        if (persona == null) {
            System.out.println("La persona no existe.");
            return;
        }
        persona.mostrarDetalles();
    }
    
}
