package ru.job4j.oop;

import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when000to442Then6() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(4, 4, 2);
        double result = a.distance3d(b);
        assertEquals(6.0, result, 0.01);
    }

    @Test
    public void when000to400Then4() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(4, 0, 0);
        double result = a.distance3d(b);
        assertEquals(4.0, result, 0.01);
    }
}