package br.padroes.builder;

public class PizzaStore {
	protected PizzaBuilder pizza;

public PizzaStore(PizzaBuilder pizza) {
        this.pizza = pizza;
    }
	
	public void preparePizza() {
		pizza.buildSauce();
		pizza.buildVeggies();
		pizza.buildModelo();
		pizza.buildPepperoni();
		pizza.buildPClams();
    }
 
    public PizzaProduct getPizza() {
        return pizza.getPizza();
    }
	
	
}