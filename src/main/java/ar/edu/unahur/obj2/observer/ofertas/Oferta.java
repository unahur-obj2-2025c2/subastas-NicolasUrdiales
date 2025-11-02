package ar.edu.unahur.obj2.observer.ofertas;

import ar.edu.unahur.obj2.observer.subastadores.Subastador;

public class Oferta{
    private final Subastador subastador;
    private final Integer valor;
    public Oferta(Subastador subastador, Integer valor) {
        this.subastador = subastador;
        this.valor = valor;
    }
    public String getNombreSubastador() {
        return subastador.getNombre();
    }
    public Integer getValor() {
        return valor;
    }
    public Subastador getSubastador() {
        return subastador;
    }
    
}
