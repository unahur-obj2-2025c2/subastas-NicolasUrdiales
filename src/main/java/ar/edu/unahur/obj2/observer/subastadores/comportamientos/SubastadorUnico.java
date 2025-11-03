package ar.edu.unahur.obj2.observer.subastadores.comportamientos;

import ar.edu.unahur.obj2.observer.ofertas.Oferta;

public class SubastadorUnico extends ComportamientoSubastador{
    private Boolean yaOferto = Boolean.FALSE;

    @Override
    protected Boolean doQuiereOfertar(Oferta oferta) {
        return !yaOferto;
    }

    @Override
    protected void doRealizarOferta() {
        yaOferto = Boolean.TRUE;
    }


    


}
