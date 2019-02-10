package com.infoshareacademy.java8.interfaces.complex;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.StringReader;

import static java.nio.charset.StandardCharsets.UTF_8;
import static org.fest.assertions.api.Assertions.assertThat;

/**
 * Poprawic Encrypter, tak aby uzyc metod domyslnych i uniknac powtorzen kodu.
 */
public class InterfacesTest {

    private Encrypter reverseEncrypter = new ReverseEncrypter();
    private Encrypter rotEncrypter = new RotEncrypter();
    private Encrypter xorEncrypter = new XorEncrypter();

    @Test
    public void testReverseEncrypter() throws IOException {
        final byte[] input = new byte[]{90, 100, 110};
        final char[] charInput = new char[]{'Z', 'd', 'n'};
        final byte[] expected = new byte[]{-91, -101, -111};

        assertThat(reverseEncrypter.encode(input)).isEqualTo(expected);
        assertThat(reverseEncrypter.encode(new String(input), UTF_8)).isEqualTo(expected);
        assertThat(reverseEncrypter.encode(charInput, UTF_8)).isEqualTo(expected);
        assertThat(reverseEncrypter.encode(new StringReader(new String(charInput)), UTF_8)).isEqualTo(expected);
        assertThat(reverseEncrypter.encode(new ByteArrayInputStream(input))).isEqualTo(expected);
    }

    @Test
    public void testRotEncrypter() throws IOException {
        final byte[] input = new byte[]{90, 100, 110};
        final char[] charInput = new char[]{'Z', 'd', 'n'};
        final byte[] expected = new byte[]{103, 113, 123};

        assertThat(rotEncrypter.encode(input)).isEqualTo(expected);
        assertThat(rotEncrypter.encode(new String(input), UTF_8)).isEqualTo(expected);
        assertThat(rotEncrypter.encode(charInput, UTF_8)).isEqualTo(expected);
        assertThat(rotEncrypter.encode(new StringReader(new String(charInput)), UTF_8)).isEqualTo(expected);
        assertThat(rotEncrypter.encode(new ByteArrayInputStream(input))).isEqualTo(expected);
    }

    @Test
    public void testXorEncrypter() throws IOException {
        final byte[] input = new byte[]{90, 100, 110};
        final char[] charInput = new char[]{'Z', 'd', 'n'};
        final byte[] expected = new byte[]{-106, -88, -94};

        assertThat(xorEncrypter.encode(input)).isEqualTo(expected);
        assertThat(xorEncrypter.encode(new String(input), UTF_8)).isEqualTo(expected);
        assertThat(xorEncrypter.encode(charInput, UTF_8)).isEqualTo(expected);
        assertThat(xorEncrypter.encode(new StringReader(new String(charInput)), UTF_8)).isEqualTo(expected);
        assertThat(xorEncrypter.encode(new ByteArrayInputStream(input))).isEqualTo(expected);
    }
}
