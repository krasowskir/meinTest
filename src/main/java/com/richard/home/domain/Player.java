package com.richard.home.domain;

public class Player {

    private String name;
    private int alter;

    public Player() {
    }

    public Player(String name, int alter) {
	this.name = name;
	this.alter = alter;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public int getAlter() {
	return alter;
    }

    public void setAlter(int alter) {
	this.alter = alter;
    }

}
