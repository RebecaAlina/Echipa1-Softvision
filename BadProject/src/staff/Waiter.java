package staff;

import java.util.Scanner;

public class Waiter implements cleanTable, serveTable{

  @Override
  public void cleanTable(TableNumber tableNumber){
    tableNumber.setReserved(false);
    System.out.println("The table " + tableNumber.name() + " was cleaned\n");
  }

  @Override
  public void servetable(TableNumber tableNumber){
    tableNumber.setReserved(true);
    System.out.println("The table " + tableNumber.name() + " is being served\n");
  }

  public TableNumber greetCustomer() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Welcome.");
    TableNumber.printAvailableTables();
    System.out.print("Please choose your table:");
    return TableNumber.valueOf(sc.nextLine());
  }
}
