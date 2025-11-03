package ar.edu.unahur.obj2.observer.subastadores.comportamientos;

import ar.edu.unahur.obj2.observer.ofertas.Oferta;
import ar.edu.unahur.obj2.observer.productos.ProductoSubastado;
import ar.edu.unahur.obj2.observer.subastadores.Subastador;

public abstract class ComportamientoSubastador implements IComportamientoSubastador{

    @Override
    public void realizarOferta(Subastador subastador, ProductoSubastado producto) {
        Integer valor = subastador.getUltimaOferta() == null ? 10 : subastador.getUltimaOferta().getValor() + 10;
        Oferta oferta = new Oferta(subastador, valor);
        if(this.quiereOfertar(oferta)){
        producto.agregarOferta(oferta);
        producto.notificar(oferta);
        this.doRealizarOferta();
        }
    }
    private Boolean quiereOfertar(Oferta oferta){return Boolean.TRUE && this.doQuiereOfertar(oferta);}

    protected abstract Boolean doQuiereOfertar(Oferta oferta);
    protected abstract void doRealizarOferta();

}
