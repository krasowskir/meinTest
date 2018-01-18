package com.richard.home;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.richard.home.domain.Player;

public class Start {

    private Player richard;

    public static void main(String[] args) {
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
	//// context.register(Player.class);
	// context.register(SpringApplicationConfiguration.class);
	// context.refresh();
	Player rich = (Player) context.getBean("richard");

	// Start start = new Start();
	// System.out.println(start.toni.getName() + start.toni.getAlter());
	// System.out.println("Name: " + start.richard.getName() + " alter: " +
	// start.richard.getAlter());
	Properties props = System.getProperties();
	Set<String> menge = props.stringPropertyNames();
	Iterator<String> iter = menge.iterator();
	while (iter.hasNext()) {
	    String key = iter.next();
	    System.out.println(key + " value: " + props.getProperty(key));
	}
	while (true) {

	}
    }
}
