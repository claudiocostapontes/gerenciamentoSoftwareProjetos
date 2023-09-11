package com.command.cases;

import java.util.ArrayList;
import java.util.List;

public class AdicionarAtividades {

	public static void main(String[] args) {

		@SuppressWarnings("rawtypes")
		List<Comparable> list = new ArrayList<Comparable>();
		list.add(1);
		list.add(null);
		list.add(2.5);
		list.add("Planejamento");
		
		Object planejamento = list.get(3);
		System.out.println("get(3):"+planejamento);
		System.out.println("size:"+list.size());
		System.out.println("contains planejamento:"+list.contains("Planejamento"));
		System.out.println("isEmpty:"+list.isEmpty());
		
		list.set(3,"Analise");
		System.out.println("get(3):"+list.get(3));
		
		
	}

}
