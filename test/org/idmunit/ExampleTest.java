/**************************************************************************
 *  IdMUnit - Automated Testing Framework for Identity Management Solutions
 *
 * Purpose of this file: This is a sample test runner that provides an interface for
 * the selection and execution of a spreadsheet and the sheets therein.
 * 
 *
 *******************************************************************************/
package org.idmunit;

import junit.framework.Test;
import junit.framework.TestCase;
import org.idmunit.parser.ExcelParser;

public class ExampleTest extends TestCase {

	//================================================================================================	
	
	public void testInitialize() {}
	
	public void test1_0AddUser() {}
	
	public void testCleanup() {}

	//================================================================================================	
	
	public static Test suite() {
		return ExcelParser.createSuite(ExampleTest.class);
	}
	
}
