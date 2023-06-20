
public class DeathStarDriver {

	public static void main(String[] args) {
		DeathStar takeOne = new DeathStar(100, 200);
		DeathStar v2 = new DeathStar(400, 250);
		System.out.println("EXPECTED: Defensive Capability Remaining: 100  Fire Power Remaining: 200");
		System.out.println("  ACTUAL: "+takeOne ); // automatically calls toString()
		System.out.println("=============================================================================");
		
		System.out.print("Nothing should appear between this ..") ;
		String s = takeOne.toString(); //test of toString()
		System.out.println(".. and this.");
		System.out.println("=============================================================================");
		
		System.out.println("EXPECTED: 100" );
		System.out.println("  ACTUAL: " + takeOne.getDefensiveStrength() );
		System.out.println("=============================================================================");
		
		System.out.println("EXPECTED: 200" );
		System.out.println("  ACTUAL: " + takeOne.getFirePower());
		System.out.println("=============================================================================");
		
		takeOne.defendAgainst(75);
		System.out.println("EXPECTED: 25" );
		System.out.println("  ACTUAL: " + 
		takeOne.getDefensiveStrength() );
		System.out.println("=============================================================================");
		
		System.out.println("EXPECTED: This Death Star has been destroyed!" );
		System.out.print("  ACTUAL: ");
		takeOne.defendAgainst(75);
		System.out.println("=============================================================================");
		
		int defLeft = takeOne.getDefensiveStrength();
		System.out.println("EXPECTED: -50" );
		System.out.println("  ACTUAL: " + defLeft);
		System.out.println("=============================================================================");
		
		System.out.println("EXPECTED: Defensive Capability Remaining: 400  Fire Power Remaining: 250");
		System.out.println("  ACTUAL: "+ v2); // automatically calls toString()
		System.out.println("=============================================================================");
		
		int alderaan=175;
		v2.firePrimaryWeapon(alderaan);
		int rebelScum=10;
		v2.defendAgainst(rebelScum);
		System.out.println("EXPECTED: Defensive Capability Remaining: 390  Fire Power Remaining: 75");
		System.out.println("  ACTUAL: "+ v2); // automatically calls toString()
		System.out.println("=============================================================================");
		
		System.out.println("EXPECTED: Not enough energy for weapon. Time to fire more engineers!" );
		System.out.print("  ACTUAL: ");
		v2.firePrimaryWeapon(100);
		System.out.println("=============================================================================");
		
		System.out.println("EXPECTED: This death star has been destroyed. Lord Vader will be ... disturbed.");
		System.out.println("  ACTUAL: "+ takeOne); // automatically calls toString()
		System.out.println("=============================================================================");
		
		System.out.println("EXPECTED: Defensive Capability Remaining: 390  Fire Power Remaining: 75");
		System.out.println("  ACTUAL: "+ v2); // automatically calls toString()
		System.out.println("=============================================================================");
		
		
		
	}

}
