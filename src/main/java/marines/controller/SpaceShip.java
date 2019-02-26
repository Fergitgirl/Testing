package main.java.marines.controller;

import main.java.marines.data.Item;

/**
 * @author Marines Lopez
 */
public interface SpaceShip {

	public boolean launch();

	public boolean land();

	public boolean canCarry(Item item);

	public void carry(Item item);
}
