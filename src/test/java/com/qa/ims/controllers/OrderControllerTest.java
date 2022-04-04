package com.qa.ims.controllers;

import static org.junit.Assert.assertEquals;

import java.awt.ItemSelectable;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.qa.ims.controller.OrderController;
import com.qa.ims.persistence.dao.OrderDAO;
import com.qa.ims.persistence.domain.Order;
import com.qa.ims.utils.Utils;


@RunWith(MockitoJUnitRunner.class)
public class OrderControllerTest {
	
	@Mock
	private Utils utils;
	
	@Mock
	private OrderDAO dao;
	
	@InjectMocks
	private OrderController controller;

	@Test
	public void testCreate () {
		final long ID = 1;
		final String F_NAME = "Sayed";
		final String S_NAME = "Sakkaf";
		final String P_NAME = "Television";
		final Order created = new Order(ID, F_NAME, S_NAME, P_NAME);
		
		Mockito.when(utils.getLong()).thenReturn(ID);
		Mockito.when(utils.getString()).thenReturn(F_NAME);
		Mockito.when(utils.getString()).thenReturn(S_NAME);
		Mockito.when(utils.getString()).thenReturn(P_NAME);
		Mockito.when(dao.create(created)).thenReturn(created);
		
		assertEquals(created, controller.create());
		
		Mockito.verify(utils, Mockito.times(1)).getLong();
		Mockito.verify(utils, Mockito.times(1)).getString();
		Mockito.verify(utils, Mockito.times(2)).getString();
		Mockito.verify(utils, Mockito.times(3)).getString();
		
	}
	
	@Test
	public void testReadAll () {
		List<Order> orders = new ArrayList<>();
		orders.add(new Order(2L, 2L));
		Mockito.when(dao.readAll()).thenReturn(orders);	
		assertEquals(orders, controller.readAll());	
		Mockito.verify(dao, Mockito.times(1)).readAll();
	}
	
	@Test
	public void testUpdate() {
		Order updated = new Order(2L, "Sayed", "Sakkaf", "Book");
		
		Mockito.when(this.utils.getLong()).thenReturn(2L);
		Mockito.when(this.utils.getString()).thenReturn("Sayed");
		Mockito.when(this.utils.getString()).thenReturn("Sakkaf");
		Mockito.when(this.utils.getString()).thenReturn(updated.getProductName());
		
	}
	
	@Test
	public void testDelete() {
		final long ID = 1L;
		Mockito.when(utils.getLong()).thenReturn(ID);
		Mockito.when(dao.delete(ID)).thenReturn(1);
		
		assertEquals(1L, this.controller.delete());
		
		Mockito.verify(utils, Mockito.times(1)).getLong();
		Mockito.verify(dao, Mockito.times(1)).delete(ID);
		
	}
}
