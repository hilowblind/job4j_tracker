package ru.job4j.oop;

import junit.framework.TestCase;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax2to8Then8() {
    double result = Max.max(2, 8);
    assertThat(result, is(8.0));
    }

    @Test
    public void whenMax1to9to5Then9() {
        double result = Max.max(1, 9, 5);
        assertThat(result, is(9.0));
    }

    @Test
    public void whenMax1to6to6to10Then10() {
        double result = Max.max(1, 6, 6, 10);
        assertThat(result, is(10.0));
    }
}