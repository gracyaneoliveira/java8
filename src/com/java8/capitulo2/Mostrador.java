package com.java8.capitulo2;

import java.util.function.Consumer;

class Mostrador implements Consumer<Usuario>{

	@Override
	public void accept(Usuario u) {
		System.out.println(u.getNome());
	}

}
