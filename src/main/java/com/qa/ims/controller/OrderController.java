package com.qa.ims.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.ims.persistence.dao.OrderDAO;
import com.qa.ims.persistence.domain.Order;
import com.qa.ims.utils.Utils;

public class OrderController implements CrudController<Order>{
	
	public static final Logger LOGGER = LogManager.getLogger();
	
	private OrderDAO orderDAO;
	private Utils utils;
	
	public OrderController(OrderDAO orderDAO, Utils utils) {
		super();
		this.orderDAO = orderDAO;
		this.utils = utils;
	}
	

	@Override
	public List<Order> readAll() {
		List<Order> orders = orderDAO.readAll();
		for (Order order: orders) {
			LOGGER.info(order);
		}
		return orders;
	}

	@Override
	public Order create() {
		Order order;
		LOGGER.info("Please enter your customer ID");
		Long customerId =utils.getLong();
		LOGGER.info("Please enter the item ID");
		Long itemId =utils.getLong();
		order = orderDAO.create(new Order(customerId, itemId));
		LOGGER.info("Order created!");
		return null;
		}

	@Override
	public Order update() {
		
		return null;
	}

	@Override
	public int delete() {
		LOGGER.info("Please enter the id of the order you would like to delete");
		Long id = utils.getLong();
		LOGGER.info("Order deleted!");
		return orderDAO.delete(id);
	}

}
