package com.lts.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ShapeFactory {
	@Autowired
	@Qualifier("rectangle")
	Shape shape;
	@Autowired
	@Qualifier("triangle")
	Shape nshape;
	
	
	public void printArea(int x, int y,int z)
	{
		if(z==1) {
		shape.calculateArea(x,y);
		}
		else {
		nshape.calculateArea(x, y);
		}
	}
}
