package Usuario;

import Prenda.Prenda;

import java.util.ArrayList;

class Usuario {

    ArrayList<Atuendo> atuendosRecomendados;
    ArrayList<GuardaRropa> misGuardaRropas;

    public void method recibirSugerencia(Atuendo atuendo) {
        this.atuendosRecomendados.add(atuendo);
    }

    public void method  crearGuardaRopasCompartido(ArrayList<Usuario> usuarios, Criterio criterio,ArrayList<Prenda> prendas) {
        GuardaRropa nuestroGuardarropa = new GuardaRropa(criterio, prendas);
        this.agregarGuardaRropas(nuestroGuardarropa);
        usuarios.map(usuario -> usuario.agregarGuardaRropas(nuestroGuardarropa));
    }

    method agregarGuardaRropas(GuardaRropa guardaRropa) {
        this.misGuardaRropas.add(guardaRropa);
    }

    method recibirPropuestaModificacion(Modificacion modificacion){
        modificacion.getGuardarropas().agregarModificacion(modificacion);
    }

    method propuestasModificacion() {
        this.misGuardaRropas.getModificaciones();
    }

    method aceptarModificacion(Modificacion modificacion){
        if(!modificacion.fueAplicada()){
            modificacion.aplicarModificacion();
        }
        throw new Exepcion("La modificacion ya fue aplicada");
    }

    method rechazarModificacion(Modificacion modificacion){
        modificacion.getGuardarropas().remove(modificacion);
    }

    method deshacerModificacion(Modificacion modificacion){
        if(modificacion.fueAplicada()){
            modificacion.deshacerModificacion();
        }
    }



}


