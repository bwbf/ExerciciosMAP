package br.padroes.builder;

public class PepperoneBuilder extends PizzaBuilder {

	@Override
	public void buildSauce(Sauce s) {
			pizza.sauce(s)
		}
	@Override
	public void buildVeggies(Veggies v) {
			pizza.veggies(v);
		}
	@Override
	public void buildPepperoni(Pepperoni p) {
			pizza.pepperoni(p);
		}
	@Override
	public void buildClams(Clams c) {
			pizza.clams(c);
		}

}
