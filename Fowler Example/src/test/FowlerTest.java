package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import fowler.Movie;

public class FowlerTest {

	@Before
	public void setUp(){
		Movie m1 = new Movie("Star Wars I", 12);
	}
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
