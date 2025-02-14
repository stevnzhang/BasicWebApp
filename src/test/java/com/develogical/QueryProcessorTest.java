package com.develogical;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class QueryProcessorTest {

    QueryProcessor queryProcessor = new QueryProcessor();

    @Test
    public void returnsEmptyStringIfCannotProcessQuery() throws Exception {
        assertThat(queryProcessor.process("test"), is(""));
    }

    @Test
    public void knowsAboutShakespeare() throws Exception {
        assertThat(queryProcessor.process("Shakespeare"), containsString("playwright"));
    }

    @Test
    public void isNotCaseSensitive() throws Exception {
        assertThat(queryProcessor.process("shakespeare"), containsString("playwright"));
    }

    @Test
    public void knowsTeamName() throws Exception {
        assertThat(queryProcessor.process("what is your name"), containsString("SZ-Team"));
    }

    @Test
    public void knowsSecret() throws Exception {
        assertThat(queryProcessor.process("secret message"), containsString("admin"));
    }

    @Test
    public void test123() throws Exception {
        assertThat(queryProcessor.process("what is 1 plus 1"), containsString("2"));
    }

    // @Test
    // public void test12345() throws Exception {
    //     assertThat(queryProcessor.process("which of the following numbers is the largest: 375, 51"), containsString("375"));
    // }
    // Will break
    // @Test
    // public void breakCode() throws Exception {
    //     assertThat(queryProcessor.process("code no longer works!"), containsString("break!"));
    // }

}
