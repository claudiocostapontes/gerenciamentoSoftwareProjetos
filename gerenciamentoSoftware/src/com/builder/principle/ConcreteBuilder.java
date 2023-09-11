package com.builder.principle;

public class ConcreteBuilder implements Builder<Object> {
	
	PlataformaSoftware plataformaSoftware = null;
	
	public ConcreteBuilder() {
		plataformaSoftware= new PlataformaSoftware();
	}

	@Override
	public String buildClientes() {
		plataformaSoftware.setClientes("plataformaSoftware clientes construction compeleted");
		return null;
	}

	@Override
	public String buildProjetos() {
		plataformaSoftware.setProjetos("plataformaSoftware projetos construction compeleted");
		return null;
	}

	@Override
	public String buildAtividades() {
		plataformaSoftware.setAtividades("plataformaSoftware atividades construction compeleted");
		return null;
	}

	@Override
	public PlataformaSoftware buildPart() {
		return plataformaSoftware;
	}

}
