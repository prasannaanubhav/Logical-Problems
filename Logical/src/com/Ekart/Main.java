package com.Ekart;

public class Main {

	private static StockList stockList = new StockList();

	public static void main(String[] args) {

		StockItem stockItem = new StockItem("bread", 2, 15);
		stockList.addItem(stockItem);

		stockItem = new StockItem("wheat", 1, 35);
		stockList.addItem(stockItem);

		stockItem = new StockItem("potato", 2, 20);
		stockList.addItem(stockItem);

		stockItem = new StockItem("biscuit", 2, 10);
		stockList.addItem(stockItem);

		StockItem biscuit = new StockItem("biscuit", 5, 10);
		stockList.addItem(biscuit);

		stockList.printListOfItems();

	}
}
