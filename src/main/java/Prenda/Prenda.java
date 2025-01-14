package Prenda;

import Prenda.Material.Material;
import Prenda.Material.Trama;
import Prenda.TipoDePrenda.Categoria;
import Prenda.TipoDePrenda.TipoDePrenda;

public class Prenda {
    private final TipoDePrenda tipoDePrenda;
    private final String colorPrincipal;
    private final String colorSecundario;
    private final Material material;
    private final Trama trama;
    private final double temperaturaMaxima;

    public Prenda(TipoDePrenda tipoDePrenda, String colorPrincipal, String colorSecundario, Material material,
                  Trama trama, double temperaturaMaxima) {
        this.tipoDePrenda = tipoDePrenda;
        this.colorPrincipal = colorPrincipal;
        this.colorSecundario = colorSecundario;
        this.material = material;
        this.trama = trama;
        this.temperaturaMaxima = temperaturaMaxima;
    }

    public static void validarCategoriaAtuendo(Prenda prenda, TipoDePrenda cat, exepcion) {
            if(TipoDePrenda.getCategoria() != cat){
                throw new Exepcion(exepcion);
            }
    }


    public TipoDePrenda getTipoDePrenda() {
        return tipoDePrenda;
    }

    public String getColorPrincipal() {
        return colorPrincipal;
    }

    public String getColorSecundario() {
        return colorSecundario;
    }

    public Material getMaterial() {
        return material;
    }

    public Trama getTrama() {
        return trama;
    }

    public double getTemperaturaMaxima() {
        return temperaturaMaxima;
    }


}}