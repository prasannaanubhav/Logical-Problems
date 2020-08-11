package InputOutputStream;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.Scanner;

public class Main2 {

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

		Path locfile = FileSystems.getDefault().getPath("newFile2.txt");
		try (BufferedWriter bufferedWriter = Files.newBufferedWriter(locfile)) {

			Map<String, StockItem> map = stockList.getMapList();
			for (StockItem stock : map.values()) {
				bufferedWriter.write(stock.getStockName() + " " + stock.getPrice() + "\n");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		try (Scanner sc = new Scanner(Files.newBufferedReader(locfile))) {
			while (sc.hasNextLine()) {
				String input = sc.nextLine();
				String data[] = input.split(" ");
				String name = data[0];
				String price = data[1];
				System.out.println("name = " + name + " , " + "price = " + price + "\n");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
