
public class Character {
	
	protected WeaponBehavior weapon;
	protected Classe classe;
	
	public Character() {
		
	}
	
	public void fight() {
		weapon.useWaepon(this);
	}
	
	public void setWeapon(WeaponBehavior w) {
		this.weapon = w;
	}
	
	public void setClasse(Classe c) {
		this.classe = c;
	}
	
	public Classe getClasse() {
		return this.classe;
	}
	
	
	
	
	
	

}
