package staff;


public class Cook implements cooks {

  @Override
  public void cooks(String pizzaName){
    System.out.println(pizzaName+ " is being prepared.");
  }

}
