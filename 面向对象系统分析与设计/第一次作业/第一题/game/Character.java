package game;

public abstract class Character {

	protected WeaponBehavior weapon;

	public abstract void fight();

	public void setWeapon(WeaponBehavior w) {
		this.weapon = w;
	}

}
