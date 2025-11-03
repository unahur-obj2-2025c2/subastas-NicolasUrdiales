package ar.edu.unahur.obj2.observer.subastadores.comportamientos;

import ar.edu.unahur.obj2.observer.ofertas.Oferta;

public class SubastadorArriesgado extends ComportamientoSubastador{

    


    @Override
    protected void doRealizarOferta() {}

    @Override
    protected Boolean doQuiereOfertar(Oferta oferta) {
        return Boolean.TRUE;
    }

    

   

}
