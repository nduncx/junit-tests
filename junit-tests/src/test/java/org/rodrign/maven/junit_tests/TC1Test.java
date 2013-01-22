package org.rodrign.maven.junit_tests;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TC1Test extends TestCase {

/**
 * Create the test case
 *
 * @param testName name of the test case
 */
public TC1Test( String testName )
{
    super( testName );
}

/**
 * @return the suite of tests being tested
 */
public static Test suite()
{
    return new TestSuite( TC1Test.class );
}

/**
 * Rigourous Test :-)
 */
public void testTC1()
{
    assertTrue( true );
}
}

