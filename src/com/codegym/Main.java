package com.codegym;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Circle testCircle = new Circle(1.0);
        System.out.println(testCircle.getRadius());
        System.out.println(testCircle.area());
        //Đổi thành private thì không truy cập được và báo lỗi 
    }
}
