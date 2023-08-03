package dev.connolly.darragh.life;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SampleTest {

    @Test
    void sample() {
        assertEquals("life", new StringBuilder("efil").reverse().toString());
    }

}
