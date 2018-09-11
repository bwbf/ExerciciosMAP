package br.padroes.builder;

public abstract class PizzaIngredientBuilder {
	protected PizzaProduct pizza = new PizzaProduct();
	public abstract void buildSauce();
	public abstract void buildVeggies();
	public abstract void buildModelo();
	public abstract void buildPepperoni();
	public abstract void buildPClams();
	public PizzaProduct getPizza(){
		return pizza;
	};
}