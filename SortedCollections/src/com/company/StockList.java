package com.company;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class StockList {
  private final Map<String, StockItem> list;

  public StockList() {
    this.list = new LinkedHashMap<>(); // sorted vs reg hash map which is not
  }

  public int addStock(StockItem item) {
    if(item != null) {
//    Check if we already have in list
      StockItem itemToAdd = list.getOrDefault(item.getName(), item);
      // if already in stock, adjust quantity
      if(itemToAdd != item) item.adjustStock(itemToAdd.availableQuantity());

      list.put(item.getName(), item);
      return item.availableQuantity();
    }
    return 0;
  }

  public Map<String, StockItem> getList() {
    return new HashMap<String, StockItem>(list);
  }

  public int sellStock(String item, int quantity) {
    StockItem inStock = list.getOrDefault(item, null);
    if((inStock != null) && (quantity > 0)) { return inStock.finalizeStock(-quantity); }

    return 0;
//    StockItem inStock = list.getOrDefault(item, null);
//    if((inStock != null) && (inStock.availableQuantity() >= quantity) && (quantity > 0)) {
//      inStock.adjustStock(-quantity);
//      return quantity;
//    }
//
//    return 0;
  }

  public int reserveStock(String item, int quantity) {
    StockItem inStock = list.get(item);

    if((inStock != null) && (quantity > 0)) return inStock.reserveStock(quantity);
    return 0;
  }

  public int unreserveStock(String item, int quantity) {
    StockItem inStock = list.get(item);

    if((inStock != null) && (quantity > 0)) return inStock.unreserveStock(quantity);
    return 0;
  }

  public StockItem get(String key) { return list.get(key); }

  public Map<String, StockItem> Items() { return Collections.unmodifiableMap(this.list); }

  @Override
  public String toString() {
    String s = "\nStockList\n";
    double totalCost = 0.0;
    for(Map.Entry<String, StockItem> item: list.entrySet()) {
      StockItem stockItem = item.getValue();
      double itemValue = stockItem.getPrice() * stockItem.availableQuantity();
      s = s + stockItem + ". There are " + stockItem.availableQuantity() + " in stock. Value of items: ";
      s = s + formatDecimalString(itemValue) + "\n";
      totalCost += itemValue;
    }

    return s + "Total stock value " + formatDecimalString(totalCost);
  }

  public String formatDecimalString(double num) { return String.format("%.2f", num); }
}
