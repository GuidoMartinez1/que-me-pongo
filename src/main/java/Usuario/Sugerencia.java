package Usuario;

import Clima.ClimaAdapter;
import Prenda.TipoDePrenda.Categoria;

class Sugerencia {
    Categoria parteInferior;
    Categoria parteSuperior;
    Categoria calzado;
    Categoria accesorio;

    method construirSugerencia() {
        atuendo = new Atuendo(parteInferior, parteSuperior, calzado, accesorio);
        temperatura = ClimaAdapter.getTemperatura();

        Validador.temperaturaAcorde(parteInferior,temperatura);
        Validador.temperaturaAcorde(parteSuperior,temperatura);
        Validador.temperaturaAcorde(calzado,temperatura);
        Validador.temperaturaAcorde(accesorio,temperatura);

        return atuendo;
    }

}
