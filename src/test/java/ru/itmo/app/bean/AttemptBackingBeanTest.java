package ru.itmo.app.bean;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class AttemptBackingBeanTest {

    private AttemptBackingBean bean;

    @Before
    public void setUp() {
        bean = new AttemptBackingBean();
    }

    @Test
    public void testDefaultValues() {
        assertEquals(0.0, bean.getX(), 0.001);
        assertEquals(0.0, bean.getY(), 0.001);
        assertEquals(0.0, bean.getR(), 0.001);
        assertNull(bean.getType());
    }

    @Test
    public void testSetAndGetX() {
        double x = 2.0;
        bean.setX(x);
        assertEquals(x, bean.getX(), 0.001);
    }

    @Test
    public void testSetAndGetY() {
        double y = 3.0;
        bean.setY(y);
        assertEquals(y, bean.getY(), 0.001);
    }

    @Test
    public void testSetAndGetR() {
        double r = 1.0;
        bean.setR(r);
        assertEquals(r, bean.getR(), 0.001);
    }

    @Test
    public void testSetAndGetType() {
        String type = "form";
        bean.setType(type);
        assertEquals(type, bean.getType());
    }
} 