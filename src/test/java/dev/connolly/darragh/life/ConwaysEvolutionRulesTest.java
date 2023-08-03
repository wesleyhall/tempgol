package dev.connolly.darragh.life;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ConwaysEvolutionRulesTest {

    private final ConwaysEvolutionRules conwaysEvolutionRules = new ConwaysEvolutionRules();

    @Mock
    private final Generation<Boolean> generation = null;

    @Test
    void shouldThrowIllegalArgumentExceptionWhenPassedNegativeX() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            conwaysEvolutionRules.apply(-1, 0, generation);
        });
        assertEquals("X coordinate cannot be negative", exception.getMessage());
    }

    @Test
    void shouldThrowIllegalArgumentExceptionWhenPassedNegativeY() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            conwaysEvolutionRules.apply(0, -1, generation);
        });
        assertEquals("Y coordinate cannot be negative", exception.getMessage());
    }

    @Test
    void shouldThrowIllegalArgumentExceptionWhenPasswordOutOfBoundsX() {
        when(generation.getWidth()).thenReturn(10);
        //when(generation.getHeight()).thenReturn(10);
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            conwaysEvolutionRules.apply(10, 0, generation);
        });
        assertEquals("X coordinate is out of bounds", exception.getMessage());
    }

    @Test
    void shouldThrowIllegalArgumentExceptionWhenPasswordOutOfBoundsY() {
        when(generation.getWidth()).thenReturn(10);
        when(generation.getHeight()).thenReturn(10);
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            conwaysEvolutionRules.apply(0, 10, generation);
        });
        assertEquals("Y coordinate is out of bounds", exception.getMessage());
    }

}
