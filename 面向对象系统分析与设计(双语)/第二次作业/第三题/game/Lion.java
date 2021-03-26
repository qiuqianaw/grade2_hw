package game;

/**
 * @author QiuQian
 */
public class Lion implements Eudemon {

	private String name;

	public Lion(String name) {
		this.name = name;
	}

	/**
	 * @see Eudemon#update(Character)
	 *  
	 */
	@Override
	public void update(Character character) {
		attack(character);
	}


	/**
	 * @see Eudemon#attack(Character)
	 *  
	 */
	@Override
	public void attack(Character character) {
		System.out.println("守护神攻击了 " + character.getName());
	}

}
