package com.qa.ims.persistence.dao;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.qa.ims.persistence.domain.Order;
import com.qa.ims.utils.DBUtils;

public class OrderDAOTest {
	
	private final OrderDAO DAO = new OrderDAO();
	
	@Before
	public void setup() {
		DBUtils.connect();
		DBUtils.getInstance().init("src/test/resources/sql-schema.sql", "src/test/resources/sql-data.sql");
	}
	
	@Test
	public void testCreate() {
		final Order created = new Order(1L, "Sayed", "Sakkaf", "Television");
		assertEquals(created, DAO.create(created));
	}
	
//	@Test
//	public void testReadAll() {
//		List<Order> expected = new ArrayList<>();
//		expected.add(new Order(1L, "Sayed", "Sakkaf", "Television"));
//		expected.add(new Order(2L, "James", "Brown", "Book"));
//		expected.add(new Order(3L, "Jordan", "Harrison", "Television"));
//		assertEquals(expected, DAO.readAll());
//	}
//	
//	@Test
//	public void testReadLatest() {
//		assertEquals(new Order(3L, "Jordan", "Harrison", "Television"), DAO.readLatest());
//	}
//	
	
	
	
	@Test
	public void testDelete() {
		assertEquals(1L, DAO.delete(1L));
	}

}
