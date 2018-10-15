
public enum Weapons implements WeaponBehavior{
	AXE{

		public void useWaepon(Character c) {
			switch (c.getClasse()) {
			case QUINN:
				System.out.println("Machado? Sou uma rainha, não uso armas rústicas...");
				break;
			case KING:
				System.out.println("Não teria algo mais digno de um rei? Ok esse também corta cabeças!");
				break;
			case TROLL:
				System.out.println("Hummm... MACHADO! Mas arranco arvores com as mãos!!!");
				break;
			case KNIGHT:
				System.out.println("Um machado é? Nas mãos de um cavaleiro tudo é letal.");
				break;
			default:
				throw new RuntimeException("Desculpe, mas você não é nada...");
			
			}
			
			
		}
		
	},
	KNIFE{

	public void useWaepon(Character c) {
			switch (c.getClasse()) {
			case QUINN:
				System.out.println("Faca.. não é minha favorita mas serve.");
				break;
			case KING:
				System.out.println("Pequena e afiada, sempre tenho uma comigo.");
				break;
			case TROLL:
				System.out.println("O que é isso??? Um palito de dente?!");
				break;
			case KNIGHT:
				System.out.println("Não teria algo maior??.");
				break;
			default:
				throw new RuntimeException("Desculpe, mas você não é nada...");
			
			}
			
			
		}
			
	},
	BOW{

	public void useWaepon(Character c) {
			switch (c.getClasse()) {
			case QUINN:
				System.out.println("Saudades de quando treinava com meu arco.");
				break;
			case KING:
				System.out.println("Nunca fui bom de mira.");
				break;
			case TROLL:
				System.out.println("Não sei como se usa isso");
				break;
			case KNIGHT:
				System.out.println("Arma para linha de ataque, necessario precisão.");
				break;
			default:
				throw new RuntimeException("Desculpe, mas você não é nada...");
			
			}
			
			
		}
			
	},
	SWORD{

	public void useWaepon(Character c) {
			switch (c.getClasse()) {
			case QUINN:
				System.out.println("Espada, melhor de todas as armas.");
				break;
			case KING:
				System.out.println("Essa não é a minha espada!");
				break;
			case TROLL:
				System.out.println("Porque estou com a espada do Rei?");
				break;
			case KNIGHT:
				System.out.println("Arma digna de um cavaleiro!");
				break;
			default:
				throw new RuntimeException("Desculpe, mas você não é nada...");
			
			}
			
			
		}
			
	}

}
