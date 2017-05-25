package com.work.workci;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.annotations.Test;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

public class GenerateXML {

	@Test
	public void generate() {
		XmlSuite suite = new XmlSuite();
		suite.setName("Suite001");

		XmlTest test = new XmlTest(suite);
		test.setName("Test001");

		List<XmlClass> classes = new ArrayList<XmlClass>();
		classes.add(new XmlClass("com.work.workci.TestOne"));
		classes.add(new XmlClass("com.work.workci.TestWebOne"));
		test.setXmlClasses(classes) ;

		List<XmlSuite> suite_a = new ArrayList<XmlSuite>();
		suite_a.add(suite);

		TestNG tng = new TestNG();
		tng.setXmlSuites(suite_a);
		tng.run();
	}

}
