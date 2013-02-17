package net.exacode.example.suite;

import net.exacode.example.SpringTestBase;

import org.junit.extensions.cpsuite.ClasspathSuite;
import org.junit.extensions.cpsuite.ClasspathSuite.BaseTypeFilter;
import org.junit.runner.RunWith;

@RunWith(ClasspathSuite.class)
@BaseTypeFilter(SpringTestBase.class)
public class SpringTestSuite {

}
