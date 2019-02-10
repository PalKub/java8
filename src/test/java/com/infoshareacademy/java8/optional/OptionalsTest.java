package com.infoshareacademy.java8.optional;

import org.junit.Test;

import java.util.Optional;

import static com.infoshareacademy.java8.optional.Utils.*;
import static org.fest.assertions.api.Assertions.assertThat;

public class OptionalsTest {

    @Test
    public void nulls() {
        assertThat(lookupAddressByIdOrNull(UNAVAILABLE_PERSON_ID)).isNull();
        assertThat(lookupAddressByIdOrNull(PERSON_ID_WITH_NO_ADDRESS)).isNull();
        assertThat(lookupAddressByIdOrNull(PERSON_ID_WITH_ADDRESS)).isEqualTo("Some St.");
    }

    /**
     * Poprawic, aby zadzialalo
     */
    private Optional<String> tryLookupAddressById(int id) {
        return Optional.empty();
    }

    @Test
    public void optionals() {
        assertThat(tryLookupAddressById(UNAVAILABLE_PERSON_ID).isPresent()).isFalse();
        assertThat(tryLookupAddressById(PERSON_ID_WITH_NO_ADDRESS).isPresent()).isFalse();
        assertThat(tryLookupAddressById(PERSON_ID_WITH_ADDRESS).get()).isEqualTo("Some St.");
    }
}
