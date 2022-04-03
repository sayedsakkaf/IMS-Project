package com.qa.ims.persistence.dao;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.qa.ims.persistence.domain.Item;
import com.qa.ims.utils.DBUtils;

public class ItemDAOTest {
	
	private final ItemDAO DAO = new ItemDAO();
	
	
	@Before
	public void setup() {
		DBUtils.connect();
		DBUtils.getInstance().init("src/test/resources/sql-schema.sql", "src/test/resources/sql-data.sql");
	}
	
	
	
	
	@Test
	public void testReadAll() {
		List<Item> expected = new ArrayList<>();
		expected.add(new Item(1L, "Test", 149.99F));
		assertEquals(expected, DAO.readAll());
	}
	
	@Test
	public void testCreate() {
		final Item created = new Item(2L, "Television", 349.99F);
		assertEquals(created, DAO.create(created));
	}
	
	
	@Test
	public void testDelete() {
		assertEquals(1L, DAO.delete(1L));
	}
}
