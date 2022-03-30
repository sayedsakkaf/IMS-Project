package com.qa.ims.persistence.domain;

import java.util.Objects;

public class OrderItem {
	
	private Long orderId;
	private Long itemId;
	private int quantity;
	
	public OrderItem(Long orderId, Long itemId, int quantity) {
		this.setOrderId(orderId);
		this.setItemId(itemId);
		this.setQuantity(quantity);
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "OrderItem [orderId=" + orderId + ", itemId=" + itemId + ", quantity=" + quantity + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(itemId, orderId, quantity);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderItem other = (OrderItem) obj;
		return Objects.equals(itemId, other.itemId) && Objects.equals(orderId, other.orderId)
				&& quantity == other.quantity;
	}
	
	
}
