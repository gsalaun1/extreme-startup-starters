package gsalaun1.extreme_startup_spring_boot_java.controller

import gsalaun1.extreme_startup_spring_boot_kotlin.controller.ExtremeStartupController
import org.junit.Test

import org.assertj.core.api.Assertions.assertThat
import org.junit.Before

/**
 *
 * ExtremeStartupControllerTest
 */

class ExtremeStartupControllerTest {

    private val server = ExtremeStartupController()

    @Test
    fun `Should accept missing input`() {
        assertThat(server.answer(null)).isEqualTo("team name")
    }

    @Test
    fun `Should add numbers`() {
        assertThat(server.answer("what is the sum of 14 and 4")).isEqualTo("18")
    }

}