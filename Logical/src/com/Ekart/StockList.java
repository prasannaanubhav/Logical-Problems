package com.Ekart;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class StockList {

	Scanner sc = new Scanner(System.in);

	List<StockItem> stockMaterials = new ArrayList<>();

	private Map<String, StockItem> mapList;
	
	public StockList() {
		this.mapList = new LinkedHashMap<>();
	}

	public void addItem(StockItem item) {
		if (item != null) {
			StockItem inStock = mapList.get(item.getStockName());
			if (inStock == null) {
				mapList.put(item.getStockName(), item);
			} else {
				adjustQuantity(item, item.getQuantity());
			}
		}

	}

	public void removeWholeItem(StockItem item) {
		if (item != null) {
			StockItem inStock = mapList.get(item.getStockName());
			if (inStock != null) {
				mapList.remove(inStock.getStockName(), inStock);
			}
		}
	}

	public void removeItem(StockItem item, int quantity) {
		if (item != null) {
			StockItem inStock = mapList.get(item.getStockName());
			if (inStock.getQuantity() == quantity) {
				removeWholeItem(inStock);
			}
			adjustQuantity(item, -(quantity));
		}
	}

	public void adjustQuantity(StockItem item, int quant) {
		if (item != null) {
			StockItem inStockItem = mapList.get(item.getStockName());
			if (inStockItem != null) {
				quant = quant + inStockItem.getQuantity();
				inStockItem.setQuantity(quant);
				mapList.put(inStockItem.getStockName(), inStockItem);
			}
		}

	}

	public Map<String, StockItem> getMapList() {
		return mapList;
	}

	public void printListOfItems() {

		int total = 0;
		StockItem item = new StockItem();

		for (Map.Entry<String, StockItem> map : mapList.entrySet()) {
			item = map.getValue();
			stockMaterials = addStockMaterialsToList(item);
			int newPrice = item.getPrice() * item.getQuantity();
			total = newPrice + total;

			System.out.println(item);
		}
		System.out.println("Total Amount = " + total);
		System.out.println("Please Choose the Following Options...");
		System.out.println("1 : Purchase");
		System.out.println("2 : Ignore");
		int value = sc.nextInt();
		String returnValue = "";
		if (value == 1) {
			returnValue = clearBasket(stockMaterials);
			System.out.println(returnValue);
		} else {
			System.out.println("BASKET IS NOT EMPTY YET");
		}
	}

	private String clearBasket(List<StockItem> stockMaterials) {
		stockMaterials.removeAll(stockMaterials);
		if (stockMaterials.isEmpty()) {
			return "BASKET IS EMPTY";
		}
		return "BASKET IS NOT EMPTY YET";

	}

	private List<StockItem> addStockMaterialsToList(StockItem item) {
		stockMaterials.add(item);
		return stockMaterials;

	}

}
