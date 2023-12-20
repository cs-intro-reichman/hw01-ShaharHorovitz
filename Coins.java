public class Coins{
  public static void main(String[] args){
  //gets the number from the user
  int coins = Integer.parseInt(args[0]);
  //checks how many quarters by dividing the number in 25
  int quarters = coins/25;
  //checks how many cents by checking the remainder of division
  int cents = coins % 25;
  System.out.println("use " + quarters + " quarters and " + cents + " cents");
  }
  }
