package GameRes;

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends GameObject {
	private static final int upDeadLine = 80;
	private static final int downDeadLine = 320;
	private static Ball ball;
	private static int BASE_X = 50, BASE_Y = 200;
	
	private final int size = 10;	
	private double  time; // �쒓컙
	private int force;
	private int v; // 湲곕낯 �띾룄
	private int h; //  異⑸룎�꾩튂�먯꽌遺�꽣 �대룞���믪씠
	private int a; // 媛�냽��	
	private int count; // 踰쏀�湲댁닔(�곗냽�쇰줈 媛숈�踰쎌뿉 ��� 紐삵븯寃��꾪븿)
	
	private Ball() {
		this(BASE_X, BASE_Y);
	}
	
	private Ball(int x, int y) {
		this.time=6;
		v = 40;
		h=340;
		a = -6; 
		count = 0;
		force=0;
	}
	
	public static Ball getInstance() {
		if(ball == null) ball = new Ball();
		return ball;
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.gray);
		g.fillOval(x, y, size, size);
	}
	
	public void setBallDirection(int force) {
		this.force = force;
		x += force;
	}
	
	public void update() {		
		setBallDirection(force);
		increaseTime();
	}
	
	public void increaseTime(){
		time += 0.1;		
	}
	
	public void zeroTime(){
		time = 0;
	}
	
	public void nothing(){
		y = h - (int)((v*time) + (a*time*time));
		if(force== 2) force = 1;
		else if(force== -2) force = -1;
	}
	
	public void up(){		
		this.h = y-size;
		zeroTime();
		count = 0;
		v = 40;
	}
	
	public void down(){
		this.h = y+size;
		v = -(int)(v+a*time);
		zeroTime();
	}
	
	public void left(){
		if(count != 1){
		this.h = y;
		if( time > (double)v/(-2.0*a) ) v = -40;// �대젮媛덈븣 踰쎌젏��寃쎌슦
		force = -2;
		x -= size;
		zeroTime();
		count = 1;
		}
		else{
			if(force == 1) force = -1;// 媛숈�踰쎌뿉 �щ윭踰�異⑸룎 諛⑹�
		}		
	}
	
	public void right() {
		if(count != -1){
			this.h = y;
			if( time > (double)v/(-2.0*a) ) v = -40;
			force = 2;
			x += size;
			zeroTime();
			count = -1;
		}
		else{
			if(force == -1)
				force = 1;
		}
	}
	public void jump(){
		this.h = y;
		zeroTime();
		count = 0;
		v = 80;
	}
	
	@Override
	public void collisionCheck(Ball ball) {
		
	}
	public int getRadius() {
		return size/2;
	}
}
