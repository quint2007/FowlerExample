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
		m1 = new Movie("Star Wars I", 0);
		m2 = new Movie("Cloud Atlas", 1);
		m3 = new Movie("Spectre", 2);
		r1 = new Rental(m1, 7);
		r2 = new Rental(m2, 10);
		r3 = new Rental(m3, 2);
		customer = new Customer("Peter");
		customer.addRental(r1);
		customer.addRental(r2);
		customer.addRental(r3);

	}
	@Test
	public void testStatement() {
		assertEquals("Rental Record for Peter\n\tTitle\t\tDays\tAmount\n\tStar Wars I\t\t7\t9.5\n\tCloud Atlas\t\t10\t30.0\n\tSpectre\t\t2\t1.5\nAmount owed is 41.0\nYou earned 4 frequent renter points", customer.statement());
	}
	@Test
	public void testHtmlStatement(){
		assertEquals("<H1>Rentals for <EM>Peter</EM></H1><P>\nStar Wars I: 9.5<BR>\nCloud Atlas: 30.0<BR>\nSpectre: 1.5<BR>\n<P>You owe <EM>41.0</EM><P>\nOn this rental you earned <EM>4</EM> frequent renter points<P>", customer.htmlStatement());
	}

}
