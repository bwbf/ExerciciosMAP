
public enum Weapons implements WeaponBehavior{
	AXE{

		public void useWaepon(Character c) {
			switch (c.getClasse()) {
			case QUINN:
				System.out.println("Machado? Sou uma rainha, n�o uso armas r�sticas...");
				break;
			case KING:
				System.out.println("N�o teria algo mais digno de um rei? Ok esse tamb�m corta cabe�as!");
				break;
			case TROLL:
				System.out.println("Hummm... MACHADO! Mas arranco arvores com as m�os!!!");
				break;
			case KNIGHT:
				System.out.println("Um machado �? Nas m�os de um cavaleiro tudo � letal.");
				break;
			default:
				throw new RuntimeException("Desculpe, mas voc� n�o � nada...");
			
			}
			
			
		}
		
	},
	KNIFE{

	public void useWaepon(Character c) {
			switch (c.getClasse()) {
			case QUINN:
				System.out.println("Faca.. n�o � minha favorita mas serve.");
				break;
			case KING:
				System.out.println("Pequena e afiada, sempre tenho uma comigo.");
				break;
			case TROLL:
				System.out.println("O que � isso??? Um palito de dente?!");
				break;
			case KNIGHT:
				System.out.println("Um machado �? Nas m�os de um cavaleiro tudo � letal.");
				break;
			default:
				throw new RuntimeException("Desculpe, mas voc� n�o � nada...");
			
			}
			
			
		}
			
	},
	BOW{

	public void useWaepon(Character c) {
			switch (c.getClasse()) {
			case QUINN:
				System.out.println("Machado? Sou uma rainha, n�o uso armas r�sticas...");
				break;
			case KING:
				System.out.println("N�o teria algo mais digno de um rei? Ok esse tamb�m corta cabe�as!");
				break;
			case TROLL:
				System.out.println("Hummm... MACHADO! Mas arranco arvores com as m�os!!!");
				break;
			case KNIGHT:
				System.out.println("Um machado �? Nas m�os de um cavaleiro tudo � letal.");
				break;
			default:
				throw new RuntimeException("Desculpe, mas voc� n�o � nada...");
			
			}
			
			
		}
			
	},
	SWORD{

	public void useWaepon(Character c) {
			switch (c.getClasse()) {
			case QUINN:
				System.out.println("Machado? Sou uma rainha, n�o uso armas r�sticas...");
				break;
			case KING:
				System.out.println("N�o teria algo mais digno de um rei? Ok esse tamb�m corta cabe�as!");
				break;
			case TROLL:
				System.out.println("Hummm... MACHADO! Mas arranco arvores com as m�os!!!");
				break;
			case KNIGHT:
				System.out.println("Um machado �? Nas m�os de um cavaleiro tudo � letal.");
				break;
			default:
				throw new RuntimeException("Desculpe, mas voc� n�o � nada...");
			
			}
			
			
		}
			
	}

}
