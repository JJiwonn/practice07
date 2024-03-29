package com.javaex.ex02;

public class Sparrow extends Bird {
	
	// name 필드, getter/setter는 부모로부터 상속받았기에 안적어도됨

	// 추상 메서드 오버라이드
	@Override
    public void sing() {
    	System.out.println("참새(" + getName() + ")가 소리내어 웁니다.");
    }
    @Override
    public void fly() {
        System.out.println("참새(" + getName() + ")가 날아 다닙니다.");
    }
    @Override
    public void showName() {
    	System.out.println("참새의 이름은 " + getName() + "입니다.");
    }


}
