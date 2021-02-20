package week2;

import acm.program.GraphicsProgram;
import acm.graphics.*;

import java.awt.Color;
import java.awt.color.*;

public class RobotFace extends GraphicsProgram {
	
	private static final int HEAD_WIDTH = 150;
	private static final int HEAD_HEIGHT = 200;
	private static final int EYE_RADIUS = 30;
	private static final int MOUTH_WIDTH = 75;
	private static final int MOUTH_HEIGHT = 25;
	
	public void run() {
		int x = getWidth()/2 - HEAD_WIDTH/2;
		int y =	getHeight()/2 -	HEAD_HEIGHT/2;
		
		double righteyex = x + HEAD_WIDTH/4 - HEAD_WIDTH/8;
		double righteyey = y + HEAD_HEIGHT/4;
		
		double lefteyex = x + HEAD_WIDTH/2 + HEAD_WIDTH/6;
		double lefteyey = y + HEAD_HEIGHT/4;
		
		double mouthx = x + HEAD_WIDTH/4;
		double mouthy = y + HEAD_HEIGHT/16*11;
		
		
		GRect head = new GRect(x, y, HEAD_WIDTH, HEAD_HEIGHT);
		head.setColor(Color.black);
		head.setFillColor(Color.darkGray);
		head.setFilled(true);
		add(head);
		
		GOval righteye = new GOval(righteyex, righteyey, EYE_RADIUS, EYE_RADIUS);
		righteye.setFilled(true);	
		righteye.setFillColor(Color.yellow);
		add(righteye);
		
		GOval lefteye = new GOval(lefteyex, lefteyey, EYE_RADIUS, EYE_RADIUS);
		lefteye.setFilled(true);
		lefteye.setFillColor(Color.yellow);
		add(lefteye);
		
		GRect mouth = new GRect(mouthx, mouthy, MOUTH_WIDTH, MOUTH_HEIGHT);
		mouth.setFilled(true);
		mouth.setFillColor(Color.white);
		add(mouth);
	
		
	}
}
