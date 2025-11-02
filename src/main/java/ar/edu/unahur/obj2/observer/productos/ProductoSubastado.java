package ar.edu.unahur.obj2.observer.productos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import ar.edu.unahur.obj2.observer.excepciones.ErrorSubastador;
import ar.edu.unahur.obj2.observer.observer.IObservado;
import ar.edu.unahur.obj2.observer.observer.IObservador;
import ar.edu.unahur.obj2.observer.ofertas.Oferta;

public class ProductoSubastado implements IObservado{
    private List<Oferta> ofertas = new ArrayList<>();
    private Set<IObservador> observadores = new HashSet<>();


    public void agregarOferta(Oferta oferta){
        if(!observadores.contains(oferta.getSubastador())){
            throw new ErrorSubastador("El subastador no participa en la subasta");
        }
        ofertas.add(oferta);
    }


    @Override
    public void agregarObservador(IObservador observador) {
        observadores.add(observador);
    }


    @Override
    public void quitarOberservador(IObservador observador) {
        observadores.remove(observador);
    }


    @Override
    public void notificar(Oferta oferta) {
        observadores.forEach(o -> o.actualizar(oferta));
    }


    public Set<IObservador> getObservadores() {
        return observadores;
    }
    
    public void reset(){
        this.observadores = new HashSet<>();
        this.ofertas = new ArrayList<>();

    }


    public List<Oferta> getOfertas() {
        return ofertas;
    }

    
}
