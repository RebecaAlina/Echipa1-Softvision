package model;

public class Pizza {

  private String name;
  private int price;

  public Pizza(int Price, String name){
    this.price=price;
    this.name=name;
  }
  public int getPrice(){return price;}
  public String getName() {
    return name;
  }
}
