package com.bit.paint.shape;

public class Circle extends Shape {
	int x,y;
	int radius;
	
	
	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}


	public int getRadius() {
		return radius;
	}


	public void setRadius(int radius) {
		this.radius = radius;
	}


	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("원을 그렸습니다.");
	}

}
