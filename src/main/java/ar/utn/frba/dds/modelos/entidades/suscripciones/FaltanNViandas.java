package ar.utn.frba.dds.modelos.entidades.suscripciones;

import ar.utn.frba.dds.modelos.entidades.Persistente;
import ar.utn.frba.dds.modelos.entidades.heladeras.Heladera;
import ar.utn.frba.dds.modelos.entidades.personas.PersonaFisica;
import ar.utn.frba.dds.modulos.notificador.Mensaje;
import ar.utn.frba.dds.modulos.notificador.Notificador;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
public class FaltanNViandas extends Persistente implements OpcionSuscripcion {
    private MensajeFaltanNViandas mensajeFaltanNViandas;
    private Notificador notificador;
    public void evaluarEnvioDeMensaje(Suscripcion suscripcion){
        Heladera heladera = suscripcion.getHeladera();
        if(Objects.equals(heladera.cantidadDeEspacioDisponibleEnViandas(), suscripcion.getCantidadViandasFaltantes())){
            PersonaFisica personaFisica = suscripcion.getPersonaFisica();
            String email = personaFisica.getEmail().getCorreoElectronico();
            Mensaje mensaje = mensajeFaltanNViandas.generarMensaje(suscripcion);
            notificador.notificar(mensaje,email);
        }
    }
}
