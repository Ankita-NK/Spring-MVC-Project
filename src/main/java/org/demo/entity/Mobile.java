package org.demo.entity;
public class Mobile {
	private int id;
	private String name;
	private double price;
	private String color;
	private String model;
	private String processor;
	private int rom;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public String getColor() {
		return color;
	}
	public String getModel() {
		return model;
	}
	public String getProcessor() {
		return processor;
	}
	public int getRom() {
		return rom;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public void setRom(int rom) {
		this.rom = rom;
	}
}