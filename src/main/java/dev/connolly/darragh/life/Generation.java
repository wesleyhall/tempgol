package dev.connolly.darragh.life;

public interface Generation<T> extends Population<T> {

    Generation<T> evolve();

}
