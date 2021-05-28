package Usuario;

import Prenda.Prenda;

abstract class Modificacion {
    Prenda prenda;
    GuardaRropa guardaRropas;
    boolean fueAplicada = false;

    abstract method aplicarModificacion();
    abstract method deshacerModificacion();

    public GuardaRropa getGuardaRropas() {
        return guardaRropas;
    }
}

class AgregarPrenda extends Modificacion {

    method aplicarModificacion(){
        this.guardaRropas.agregarPrenda(this.prenda);
        fueAplicada = true;
    }

    method deshacerModificacion(){
        this.guardaRropas.quitarPrenda(this.prenda);
        fueAplicada = false;
    }

}

class QuitarPrenda extends Modificacion {

    method aplicarModificacion(){
        this.guardaRropas.quitarPrenda(this.prenda);
        fueAplicada = true;
    }

    method deshacerModificacion(){
        this.guardaRropas.agregarPrenda(this.prenda);
        fueAplicada = false;
    }

}
