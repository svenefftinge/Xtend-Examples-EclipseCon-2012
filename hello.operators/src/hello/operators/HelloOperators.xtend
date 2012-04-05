package hello.operators

import org.junit.Test

import static org.junit.Assert.*
import static extension hello.operators.Distance.*

class HelloOperators {
	
	@Test def void testOperators() {
		assertEquals( 23.cm , 10.mm + 22.cm )
		assertEquals( 3.km , 1.km * 3 )
		assertEquals( 1_019_99_7.mm, 1.km + 20.m - 3.mm )
	}

}