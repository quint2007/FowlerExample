package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import fowler.Customer;
import fowler.Movie;
import fowler.Rental;

public class FowlerTest {

	Movie m1, m2, m3;
	Rental r1, r2, r3;
	Customer customer;
	
	@Before
	public void setUp(){
		m1 = new Movie("Star Wars I", 12);
		m2 = new Movie("Cloud Atlas", 4);
		m3 = new Movie("Spectre", 10);
		r1 = new Rental(m1, 7);
		r2 = new Rental(m2, 10);
		r3 = new Rental(m3, 2);
		customer.addRental(r1);
		customer.addRental(r2);
		customer.addRental(r2);

	}
	@Test
	public void testStatement() {
		assertEquals("bla", customer.statement());
	}

}
