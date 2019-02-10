package com.infoshareacademy.java8.interfaces;


import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

/**
 * Modyfikujemy {@link RuleEngine}.
 * Niech implementuje najpierw wszystkie 3 interfejsy.
 *  * Potem zmienic go tak, aby testy zadzialaly.
 */
public class DefaultMethodsTest {

    private final RuleEngine ruleEngine = new RuleEngine();

    @Test
    public void shouldExtendFewInterfaces() {
        assertThat(ruleEngine).isInstanceOf(Job.class);
        assertThat(ruleEngine).isInstanceOf(Engine.class);
        assertThat(ruleEngine).isInstanceOf(Lifecycle.class);
    }

    @Test
    public void shouldReturnValueFromJob() {
        assertThat(ruleEngine.start()).isEqualTo("Job");
    }
}
