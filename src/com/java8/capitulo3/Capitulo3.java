package com.java8.capitulo3;

public class Capitulo3 {
	//TODO continue [pag 14]
	public static void main(String[] args) {
		Runnable r = new Runnable() {
			@Override
			public void run() {
				for(int i =0; i< 10;i++) {
					System.out.println(i);
				}
			}
		};
		new Thread(r).start();
		
		System.out.println("# start T1");
		
		Runnable ru = () -> {
			for(int i =0; i< 10;i++) {
				System.out.println(i);
			}
		};
		
		new Thread(ru).start();
		
		System.out.println("# start T2");
		
		new Thread(() ->{
			for(int i =0; i< 10;i++) {
				System.out.println(i);
			}
		}).start();
		System.out.println("# start T3");
	}

}
