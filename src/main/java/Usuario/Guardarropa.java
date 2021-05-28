package Usuario;

import Prenda.Prenda;

import java.util.ArrayList;

class GuardaRropa {

    Criterio criterio;
    ArrayList<Prenda> prendas;
    ArrayList<Modificacion> modificaciones;

    public GuardaRropa (Criterio criterio, ArrayList<Prenda> prendas) {
        this.criterio = criterio;
        this.prendas = prendas;
    }

    public void method agregarPrenda(Prenda prenda){
        this.prendas.add(prenda);
    }

    public void method quitarPrenda(Prenda prenda){
        this.prendas.remove(prenda);
    }

    public void method agregarModificacion(Modificacion modificacion){
        this.modificaciones.add(modificacion);
    }

}