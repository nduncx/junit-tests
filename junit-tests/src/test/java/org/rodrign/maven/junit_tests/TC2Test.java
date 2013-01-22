package org.rodrign.maven.junit_tests;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TC2Test extends TestCase {

/**
 * Create the test case
 *
 * @param testName name of the test case
 */
public TC2Test( String testName )
{
    super( testName );
}

/**
 * @return the suite of tests being tested
 */
public static Test suite()
{
    return new TestSuite( TC2Test.class );
}

/**
 * Rigourous Test :-)
 */
public void testTC2()
{
    assertTrue( true );
}
}