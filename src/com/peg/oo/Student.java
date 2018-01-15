package com.peg.oo;

/*
 * 繼承語法（java.lang.Object)
 * 所有類別的繼承最上面的類別都是Object。
 */
public class Student {
	// 屬性(english) property field
	// 方法()method
	int math;
	int chinese;
	int english;
	String name;
//instance variable(屬性）
	// construct建構子
	public Student(String name,int math, int chinese, int english) {
		this.name = name;
		this.math = math;
		this.chinese = chinese;
		this.english = english;

	}
//	有彈性，讓使用者有更多的選擇。this此類別的Student類別。
	public Student(String name) {
		this.name=name;
	}

	public void print() {
		System.out.println(english + "\t" + math + "\t" + chinese);
	}

	public int average() {
		return (math + chinese + english) / 3;
	}
}
