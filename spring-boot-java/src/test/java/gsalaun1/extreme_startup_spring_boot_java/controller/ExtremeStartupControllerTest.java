package gsalaun1.extreme_startup_spring_boot_java.controller;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <p>ExtremeStartupControllerTest</p>
 */

public class ExtremeStartupControllerTest {

    private final ExtremeStartupController server = new ExtremeStartupController();

    @Test
    public void should_accept_missing_input() {
        assertThat(server.answer(null)).isEqualTo("team name");
    }

    @Test
    public void should_add_numbers() {
        assertThat(server.answer("what is the sum of 14 and 4")).isEqualTo("18");
    }

}