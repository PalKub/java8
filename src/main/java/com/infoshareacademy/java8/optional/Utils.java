package com.infoshareacademy.java8.optional;

import java.time.LocalDate;
import java.time.Month;

public class Utils {
    public static final int PERSON_ID_WITH_NO_ADDRESS = 1;
    public static final int PERSON_ID_WITH_ADDRESS = 2;
    public static final int UNAVAILABLE_PERSON_ID = 0;

    public static Person findPersonOrNull(int id) {
        switch(id) {
            case PERSON_ID_WITH_NO_ADDRESS:
                return new Person("James", Sex.MALE, 62, 169, LocalDate.of(2007, Month.DECEMBER, 21));
            case PERSON_ID_WITH_ADDRESS:
                return new Person("John", Sex.MALE, 62, 169, LocalDate.of(1985, Month.DECEMBER, 21));
            case UNAVAILABLE_PERSON_ID:
                return null;
            default:
                return null;
        }
    }

    public static String lookupAddressOrNull(Person person) {
        if (person.getDateOfBirth().isAfter(LocalDate.of(2000, Month.JANUARY, 1))) {
            return "";
        }
        if (person.getDateOfBirth().isAfter(LocalDate.of(1980, Month.JANUARY, 1))) {
            return " Some St.   ";
        }
        return null;
    }

    public static String lookupAddressByIdOrNull(int id) {
        final Person personOrNull = findPersonOrNull(id);
        if (personOrNull != null) {
            if (personOrNull.getSex() == Sex.MALE) {
                final String addressOrNull = lookupAddressOrNull(personOrNull);
                if (addressOrNull != null && !addressOrNull.isEmpty()) {
                    return addressOrNull.trim();
                } else {
                    return null;
                }
            }
        }
        return null;
    }


}
