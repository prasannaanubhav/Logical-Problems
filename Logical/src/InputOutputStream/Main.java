package InputOutputStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Map;
import java.util.Scanner;

public class Main {

	private static StockList stockList = new StockList();

	public static void main(String[] args) throws IOException, ClassNotFoundException {

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

//		stockList.printListOfItems();

//		BufferedWriter locfile = new BufferedWriter(new FileWriter("newFile.txt"));
		ObjectOutputStream locfile = new ObjectOutputStream(
				new BufferedOutputStream(new FileOutputStream("newFile.txt")));

		Map<String, StockItem> map = stockList.getMapList();
		for (StockItem stock : map.values()) {

//			locfile.write(stock.getStockName() + "," + stock.getPrice() + "\n");
			locfile.writeObject(stock);
		}
		locfile.close();

//		Scanner scanner = new Scanner(new BufferedReader(new FileReader("newFile.txt")));

//		sc.useDelimiter(",");
//		while (scanner.hasNextLine()) {

//			String input = scanner.nextLine();
//			String data[] = input.split(",");
//			String name = data[0];
//			sc.skip(sc.delimiter());
//			String price = data[1];

		try (ObjectInputStream objectInputStream = new ObjectInputStream(
				new BufferedInputStream(new FileInputStream("newFile.txt")))) {
			boolean eof = true;
			while (eof) {
				try {
					StockItem stockItem2 = (StockItem) objectInputStream.readObject();
					System.out.println(stockItem2.getStockName() + " " + stockItem2.getPrice());
				}

				catch (EOFException e) {
					eof = false;
				}

			}

//			System.out.println("name = " + name + "\n" + "price = " );
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
