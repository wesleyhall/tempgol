package dev.connolly.darragh.life;

public class ConwaysEvolutionRules implements EvolutionRules<Boolean> {

    @Override
    public Boolean apply(int x, int y, Generation<Boolean> generation) {

        require(x >= 0, "X coordinate cannot be negative");
        require(y >= 0, "Y coordinate cannot be negative");
        require(x < generation.getWidth(), "X coordinate is out of bounds");
        require(y < generation.getHeight(), "Y coordinate is out of bounds");

        return false;
    }

    private void require(boolean pass, String message){
        if(!pass){
            throw new IllegalArgumentException(message);
        }
    }


}
