/**
 * @author Jamari B
 * Lab 5, create a DeathStar class that provides the methods that will be used in the Death Star Driver. These 
 * methods will keep track of defense capability, fire power, the amount of strength remaining, whether or not 
 * the primary weapon can be fired, etc. 
 * 10/25/2022
 */


public class DeathStar {
	
	/**
	 * instance variables: defense, firePower
	 */
	private int defense = 0; 
	private int firePower = 0; 
	
	/**
	 * 
	 * @param defense the initial defense capability
	 * @param firePower the initial fire power capability
	 */
	public DeathStar(int defense, int firePower)
	{
		this.defense = defense;
		this.firePower = firePower;
	}
	
	/**
	 * 
	 * @return the current remaining defense capabilities
	 */
	public int getDefensiveStrength() 
	{
		return defense; 
	}
	
	/**
	 * 
	 * @return the current remaining fire power 
	 */
	public int getFirePower() 
	{
		return firePower; 
	}
	
	/**
	 * keep track of defense after attack
	 * @param strength represents strength of attack
	 * @return current defense remaining
	 */
	public int defendAgainst(int attackStrength)
	{
		defense -= attackStrength; 
		
		if (defense < 0)
		{
			System.out.println("This Death Star has been destroyed!");
		}
		return defense;
	}
	
	/**
	 * keep track of energy used and if weapon can be fired or not
	 * @param energy represents energy needed to fire weapon
	 * @return current firePower remaining
	 */
	public int firePrimaryWeapon(int energy) 
	{
		
		if (firePower >= energy)
		{
			firePower -= energy; 
			System.out.println("Another planet was destroyed");
		}
		else if (firePower < energy)
		{
			System.out.println("Not enough energy for weapon. Time to fire more engineers!");
		}
		return firePower;
	}
	
	/**
	 * keeps track of death star current defense/fire power 
	 * returns a string
	 * contains the description of the death star currently
	 */
	public String toString() 
	{
		String desc = "";
		//override the toString() method
		if (defense >= 0)
		{
			desc += "Defense Capability Remaining: " + defense + "  Fire Power Remaining: " + firePower;
		}
		else if (defense < 0)
		{
			desc = "This Death Star has been destroyed. Lord Vader will be ... disturbed.";
		}
		return desc;
	}
	
	
}
