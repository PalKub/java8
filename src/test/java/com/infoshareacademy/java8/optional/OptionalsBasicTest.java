package com.infoshareacademy.java8.optional;

import org.junit.Assert;
import org.junit.Test;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Supplier;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

public class OptionalsBasicTest {

    @Test
    public void emptyOptionalTest() {
        Optional<String> empty = null;          //?
        Assert.assertFalse(empty.isPresent());
    }

    @Test
    public void createOptionalTest() {
        String name = "Janek";
        Optional<String> optionalName = null;   //?
        assertThat(optionalName).isNotNull();
    }

    @Test(expected = NullPointerException.class)
    public void createOptionalNPETest() {
        String name = null;
        Optional<String> opt = Optional.of(name);
    }

    @Test
    public void createOptionalNullableTest() {
        String name = "Janek";
        Optional<String> opt = null;    //Optional??
        assertEquals("Optional[Janek]", opt.toString());

        opt = null;         //Optional??
        assertEquals("Optional.empty", opt.toString());
    }

    @Test
    public void ifPresentOptionalTest() {
        Optional<String> opt = Optional.ofNullable(null);
        opt.ifPresent(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("Present:"+s);
            }
        });
    }

    @Test
    public void onElseTest() {
        String nullName = null;
        String name = Optional.ofNullable(nullName).orElse("john");
        assertEquals("john", name);
    }

    @Test(expected = IllegalArgumentException.class)
    public void onElseThrowTest() throws Throwable {
        String nullName = null;
        String name = Optional.ofNullable(nullName).orElseThrow(new Supplier<Throwable>() {
            @Override
            public Throwable get() {
                return new IllegalArgumentException();
            }
        });
    }

    @Test
    public void getData() {
        String STR = "Ala";
        Optional<String> opt = Optional.of(STR);
        String ala = null;          //?? Optional
        assert STR.equals(ala);
    }
}
