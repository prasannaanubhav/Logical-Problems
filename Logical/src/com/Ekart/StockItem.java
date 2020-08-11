package com.Ekart;

public class StockItem {

	private String stockName;
	private int quantity;
	private int price;

	public StockItem() {

	}

	public StockItem(String stockName, int quantity, int price) {

		this.stockName = stockName;
		this.quantity = quantity;
		this.price = price;
	}

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if (price > 0)
			this.price = price;
	}

	@Override
	public String toString() {
		int newPrice = this.price * this.quantity;
		return "StockName = " + stockName + ", quantity = " + quantity + ", Acutalprice = " + price + ", QuantityPrice= "
				+ newPrice;
	}

}
