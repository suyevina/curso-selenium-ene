package com.java.extra_task;

public class Calculus {
	double radius;
	double x;
	double y;
	double area;

	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public Calculus() {
		this.radius = radius;
	
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}

	public double circle() {
		if (radius<0) {
			return -1.0;
		}else {
		area=radius*Math.PI;
		return area;	
		}
	}
	
	public double rectangule() {
		if (x>=0 && y>=0) {
			area=x*y;
			return area;
		}else {
			return -1.0;
		}
	}

}
