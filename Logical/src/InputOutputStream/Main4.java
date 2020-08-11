package InputOutputStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;

public class Main4 {
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

		Path locfile = FileSystems.getDefault().getPath("newFile3.txt");
		try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(
				new BufferedOutputStream(Files.newOutputStream(locfile)))) {

			Map<String, StockItem> map = stockList.getMapList();
			for (StockItem stock : map.values()) {
				objectOutputStream.writeObject(stock);

			}
		
		} catch (IOException e) {
			e.printStackTrace();
		}

		try (ObjectInputStream objectInputStream = new ObjectInputStream(
				new BufferedInputStream(Files.newInputStream(locfile)))) {

			boolean eof = true;

				while (eof) {
					try {
					StockItem stock = (StockItem) objectInputStream.readObject();
					System.out.println(stock.getStockName() + " " + stock.getPrice());
				}
			 catch (EOFException e) {
				eof=false;
			}
				}

		} catch (IOException e) {
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
