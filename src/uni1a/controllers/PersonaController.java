package uni1a.controllers;

import lombok.Data;
import lombok.NoArgsConstructor;
import uni1a.models.Persona;
import uni1a.views.PersonaView;

@Data
@NoArgsConstructor
public class PersonaController {
    private Persona model;
     private PersonaView view;

    public void mostrarMenuInicial() {
        view.mostrarMenuPrincipal();
    }

    public void mostrarMenuTipo(String tipoContenido) {
        view.mostrarMenuTipo(tipoContenido);
    }
}
