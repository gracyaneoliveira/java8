package com.java8.capitulo2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Capitulo2 {

	public static void main(String[] args) {
		Usuario usr1 = new Usuario("Paulo Silveira", 150);
		Usuario usr2 = new Usuario("Rodrigo Turine", 120);
		Usuario usr3 = new Usuario("Guilherme Silveira", 190);
		
		List<Usuario> usuarios = Arrays.asList(usr1,usr2,usr3);
		
		for (Usuario u : usuarios) {
			System.out.println(u.getNome());
		}
		
		System.out.println();
		
		Mostrador mostrador = new Mostrador();
		usuarios.forEach(mostrador);
		
		System.out.println();
		
		Consumer<Usuario> mostrador2 = new Consumer<Usuario>() {
			@Override
			public void accept(Usuario u) {
				System.out.println(u.getNome());
			}
		};
		
		usuarios.forEach(mostrador2);
		
		System.out.println();
		
		usuarios.forEach(new Consumer<Usuario>() {
			@Override
			public void accept(Usuario u) {
				System.out.println(u.getNome());
			}
		});
		
		System.out.println();
		
		Consumer<Usuario> mostrador3 = (Usuario u) -> {System.out.println(u.getNome());};
		
		System.out.println();
		
		Consumer<Usuario> mostrador4 = u -> {System.out.println(u.getNome());};
		
		System.out.println();
		
		Consumer<Usuario> mostrador5 = u -> System.out.println(u.getNome());
		
		System.out.println();
		
		usuarios.forEach(u -> System.out.println(u.getNome()));
		
		System.out.println();
		
		usuarios.forEach(u -> u.tornaModerador());
	}
}
