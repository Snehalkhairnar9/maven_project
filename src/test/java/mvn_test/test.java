package mvn_test;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;


import mvn_pkg.add;

public class test {
@Test
public void testMain() {
final ByteArrayOutputStream outContent = new
ByteArrayOutputStream();
System.setOut(new PrintStream(outContent)); //make the output go to

//the console
add.main(null); 

assertEquals("30" + System.getProperty("line.separator"),outContent.toString());
}
}