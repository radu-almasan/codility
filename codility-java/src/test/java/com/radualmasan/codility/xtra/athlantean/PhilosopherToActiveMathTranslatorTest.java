package com.radualmasan.codility.xtra.athlantean;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class PhilosopherToActiveMathTranslatorTest {

    private PhilosopherToActiveMathTranslator translator = new PhilosopherToActiveMathTranslator();

    @Test
    public void testPartialGivenExample() throws Exception {
        assertThat(translator.translate("minotarul"),
                is("^+/*56084"));
    }

    @Test(expected = GramaticalException.class)
    public void testExistenceOfGrammaticalProblems() throws Exception {
        translator.translate("imnotarul");
    }

    @Test
    public void testGivenExample() throws Exception {
        assertThat(translator.translate("minotarul are casetan"),
                is("+-+-+^+/*5608482906"));
    }
}
