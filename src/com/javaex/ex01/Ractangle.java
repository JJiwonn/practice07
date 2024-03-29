package com.javaex.ex01;

public class Ractangle extends Shape{
	// abstract 메서드를 반드시 구현해야한다.
	
	private int width;
	private int height;
	
	public Ractangle(String fillColor, int width, int height){
		super(fillColor);
		this.width=width;
		this.height=height;
	}
	
//	public void showInfo(){
//		System.out.println("[사각형]#면색:" +super.fillColor+ " "
//				+ " #가로:" + width 
//				+" #세로:" + height + "그렸습니다.");                                                                        
//	}
	    // 추상 클래스 상속시 내부의 추상 메서드는 반드시 구현해야 한다.
	    // 위에 showInfo() 가 아니라 Shape에서 확인된 draw()를 써야한다.
		@Override
		public void draw(){
			System.out.println("[사각형]#면색:" +super.fillColor+ " "
					+ " #가로:" + width 
					+" #세로:" + height + "그렸습니다.");   
		}
		
		// getters/ setters 
		public int getWidth() {
			return this.width;
		}
		
		public int getHeight() {
			return this.height;
		}

}


