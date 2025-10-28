package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest
{
	@Test
	public void testHasCity()
	{
		CustomList list = new CustomList();
		City c = new City("Calgary", "ab");
		list.addCity(c);

		assertTrue(list.hasCity(c));
	}

	@Test
	public void testDelete()
	{
		CustomList l = new CustomList();
		City c = new City("Cal", "AB");
		l.addCity(c);
		l.delete(c);

		assertFalse(l.hasCity(c));
	}


	@Test
	public void testCount()
	{
		CustomList l = new CustomList();
		City c = new City("Cal", "AB");
		l.addCity(c);

		assertEquals(1, l.countCities());

		City j = new City("Jul", "AB");
		l.addCity(c);

		assertEquals(2, l.countCities());
	}

}
