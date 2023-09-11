package com.builder.principle;

public class GerenciamentoSoftware {

	public static PlataformaSoftware construct(Builder<?> builder) {
			
			builder.buildClientes();
			builder.buildProjetos();
			builder.buildAtividades();
			return (PlataformaSoftware) builder.buildPart();
	}

}
