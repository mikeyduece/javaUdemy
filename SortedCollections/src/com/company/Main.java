package com.company;

import java.util.Map;

public class Main {
    private static StockList stockList = new StockList();

    public static void main(String[] args) {
        StockItem tmp = new StockItem("bread", 0.86, 100);
        stockList.addStock(tmp);
        tmp = new StockItem("cake", 1.1, 7);
        stockList.addStock(tmp);
        tmp = new StockItem("car", 12.5, 2);
        stockList.addStock(tmp);
        tmp = new StockItem("chair", 62.0, 10);
        stockList.addStock(tmp);
        tmp = new StockItem("cup", 0.5, 200);
        stockList.addStock(tmp);
        tmp = new StockItem("cup", 0.45, 7);
        stockList.addStock(tmp);
        tmp = new StockItem("door", 72.95, 4);
        stockList.addStock(tmp);
        tmp = new StockItem("juice", 2.5, 36);
        stockList.addStock(tmp);
        tmp = new StockItem("phone", 96.99, 35);
        stockList.addStock(tmp);
        tmp = new StockItem("towel", 2.4, 80);
        stockList.addStock(tmp);
        tmp = new StockItem("vase", 8.76, 40);
        stockList.addStock(tmp);

        System.out.println(stockList);

        for(String s: stockList.Items().keySet()) {
            System.out.println(s);
        }

        Basket basket = new Basket("Mike");
        sellItem(basket, "car", 1);
        System.out.println(basket);

        sellItem(basket, "car", 1);
        System.out.println(basket);

        sellItem(basket, "car", 1);
        sellItem(basket, "spanner", 1);
        System.out.println(basket);
        System.out.println(stockList);

//        tmp = new StockItem("pen", 1.12);
//        stockList.Items().put(tmp.getName(), tmp); // unmodifiable map so will raise unsupported action exception.
//        Collection itself is unmodifiable, but elements still are. GOTCHA
    }

    public static int sellItem(Basket basket, String item, int quantity) {
        // retrieve stock item first
        StockItem stockItem = stockList.get(item);
        if(stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }
        if(stockList.reserveStock(item, quantity) != 0) return basket.addToBasket(stockItem, quantity);
        return 0;
    }

    public static int removeItem(Basket basket, String item, int quantity) {
        // retrieve stock item first
        StockItem stockItem = stockList.get(item);
        if(stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }
        if(basket.removeFromBasket(stockItem, quantity) == quantity) return stockList.unreserveStock(item, quantity);
        return 0;
    }

    public static void checkout(Basket basket) {
        for(Map.Entry<StockItem, Integer> item : basket.Items().entrySet()) { stockList.sellStock(item.getKey().getName(), item.getValue()); }
        basket.checkout();
    }
}
