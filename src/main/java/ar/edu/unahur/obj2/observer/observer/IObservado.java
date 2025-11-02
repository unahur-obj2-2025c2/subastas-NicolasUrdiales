package ar.edu.unahur.obj2.observer.observer;

import ar.edu.unahur.obj2.observer.ofertas.Oferta;

public interface IObservado {
    void agregarObservador(IObservador observador);
    void quitarOberservador(IObservador observador);
    void notificar(Oferta oferta);
}
