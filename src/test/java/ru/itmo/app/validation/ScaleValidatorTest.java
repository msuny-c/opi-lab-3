package ru.itmo.app.validation;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import jakarta.validation.ConstraintValidatorContext;

public class ScaleValidatorTest {

    private ScaleValidator validator;
    private Scale annotation;
    private ConstraintValidatorContext context;

    @Before
    public void setUp() {
        validator = new ScaleValidator();
        annotation = new Scale() {
            @Override
            public Class<?>[] groups() {
                return new Class[0];
            }

            @Override
            public String message() {
                return "{validation.scale}";
            }

            @SuppressWarnings("unchecked")
            @Override
            public Class<? extends jakarta.validation.Payload>[] payload() {
                return new Class[0];
            }

            @Override
            public int value() {
                return 1;
            }

            @Override
            public Class<java.lang.annotation.Annotation> annotationType() {
                return java.lang.annotation.Annotation.class;
            }
        };
        validator.initialize(annotation);
        context = null;
    }

    @Test
    public void testValidScale() {
        assertTrue(validator.isValid(1.0, context));
    }

    @Test
    public void testInvalidScale() {
        assertFalse(validator.isValid(1.23, context));
    }
} 