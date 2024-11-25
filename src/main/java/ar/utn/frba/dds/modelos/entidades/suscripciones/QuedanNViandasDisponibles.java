package ar.utn.frba.dds.modelos.entidades.suscripciones;

import ar.utn.frba.dds.modelos.entidades.heladeras.Heladera;
import ar.utn.frba.dds.modelos.entidades.personas.PersonaFisica;
import ar.utn.frba.dds.modulos.notificador.Mensaje;
import ar.utn.frba.dds.modulos.notificador.Notificador;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
public class QuedanNViandasDisponibles implements OpcionSuscripcion {
    private MensajeQuedanNViandasDisponibles mensajeQuedanNViandasDisponibles;
    private Notificador notificador;
     public void evaluarEnvioDeMensaje(Suscripcion suscripcion) {
         Heladera heladera = suscripcion.getHeladera();
         if (Objects.equals(heladera.obtenerCantidadDeViandasActuales(), suscripcion.getCantidadViandasDisponibles())) {
             PersonaFisica personaFisica = suscripcion.getPersonaFisica();
             String email = personaFisica.getEmail().getCorreoElectronico();
             Mensaje mensaje = mensajeQuedanNViandasDisponibles.generarMensaje(suscripcion);
             notificador.notificar(mensaje, email);
         }
     }
}
