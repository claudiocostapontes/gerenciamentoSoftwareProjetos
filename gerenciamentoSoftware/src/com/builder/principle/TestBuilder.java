package com.builder.principle;

public class TestBuilder {

	private static PlataformaSoftware plataformaSoftware;

	public static void main(String[] args) {
		
		setPlataformaSoftware(GerenciamentoSoftware.construct(new ConcreteBuilder()));
	}

	public static PlataformaSoftware getPlataformaSoftware() {
		return plataformaSoftware;
	}

	public static void setPlataformaSoftware(PlataformaSoftware plataformaSoftware) {
		TestBuilder.plataformaSoftware = plataformaSoftware;
	}

}
