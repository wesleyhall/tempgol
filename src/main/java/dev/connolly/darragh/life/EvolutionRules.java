package dev.connolly.darragh.life;

public interface EvolutionRules<T> {

    T apply(int x, int y, Generation<T> generation);

}
