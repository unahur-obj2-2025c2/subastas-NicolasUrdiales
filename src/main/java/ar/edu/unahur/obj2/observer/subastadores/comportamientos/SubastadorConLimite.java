package ar.edu.unahur.obj2.observer.subastadores.comportamientos;

import ar.edu.unahur.obj2.observer.ofertas.Oferta;

public class SubastadorConLimite extends ComportamientoSubastador {
    private Integer limite;

    public SubastadorConLimite(Integer limite) {
        this.limite = limite;
    }

    @Override
    protected Boolean doQuiereOfertar(Oferta oferta) {
        return Boolean.valueOf(oferta.getValor() < limite);
    }

    @Override
    protected void doRealizarOferta(){}

    
    
}
