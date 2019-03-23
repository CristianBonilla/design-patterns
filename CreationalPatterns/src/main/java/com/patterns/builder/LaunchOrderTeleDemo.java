package com.patterns.builder;

public class LaunchOrderTeleDemo {
	
	public static void main(String[] args) {
		LaunchOrderTele launchOrderTele = new LaunchOrderTele("Wheat", "Lettuce", "Mustard", "Ham");
		
		System.out.println(launchOrderTele.getBread());
		System.out.println(launchOrderTele.getCondiments());
		System.out.println(launchOrderTele.getDressing());
		System.out.println(launchOrderTele.getMeat());
	}
}
