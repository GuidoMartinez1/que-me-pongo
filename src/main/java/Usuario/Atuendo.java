package Usuario;

import Prenda.Prenda;
import Prenda.TipoDePrenda.Categoria;

import java.util.ArrayList;

class Atuendo {
    Categoria parteInferior;
    Categoria parteSuperior;
    Categoria calzado;
    Categoria accesorio;
    ArrayList<Prenda> prendasExtra;

    public Atuendo(Categoria parteInferior, Categoria parteSuperior,Categoria calzado,Categoria accesorio) {

        Prenda.validarCategoriaAtuendo(Categoria parteInferior,Categoria.PARTE_INFERIOR, "No es una parte inferior");
        Prenda.validarCategoriaAtuendo(Categoria parteSuperior, Categoria.PARTE_SUPERIOR, "No es una parte superior");
        Prenda.validarCategoriaAtuendo(Categoria calzado, Categoria.CALZADO, "No es un calzado");
        Prenda.validarCategoriaAtuendo(Categoria accesorio, Categoria.ACCESORIOS, "No es un accesorio");

        this.parteInferior = parteInferior;
        this.parteSuperior = parteSuperior;
        this.calzado = calzado;
        this.accesorio = accesorio;


    }

    public void method agregarPrendaExtra(Prenda prenda) {
        this.prendasExtra.add(prenda);
    }

}