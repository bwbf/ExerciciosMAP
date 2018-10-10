
public class Main {

	public static void main(String[] args) {
		System.out.println("Teste Machado");
		Character rainha = new Quinn();
		rainha.setWeapon(Weapons.AXE);
		rainha.fight();
		Character rei = new King();
		rei.setWeapon(Weapons.AXE);
		rei.fight();
		Character troll = new Troll();
		troll.setWeapon(Weapons.AXE);
		troll.fight();
		Character cavaleiro = new Knight();
		cavaleiro.setWeapon(Weapons.AXE);
		cavaleiro.fight();
	}

}
