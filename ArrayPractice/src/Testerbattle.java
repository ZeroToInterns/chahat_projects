
public class Testerbattle {

	public static void main(String[] args)
	{
		BattleShip game1 = new BattleShip();
		game1.placeFishingBoat(5, 6);
		game1.placeCarrierBoat(1, 2, "horizontal");
		game1.attack(5,6);
		game1.attack(1,1);
		game1.attack(9, 9);
        game1.printGrid();		
	}

}
