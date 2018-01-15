package com.peg;

/*
 * row[]列 column[]行
 * 
 */
public class ScoreArry {

	public static void main(String[] args) {
		int scores[][] = { { 85, 78, 65 }, { 75, 85, 69 }, { 63, 67, 95 }, { 94, 92, 88 }, { 74, 65, 73 }

		};
		for(int i=0;i<5;i++) {
			int average = (scores[i][0]+scores[i][1]+scores[i][2])/3;
			System.out.print(average+"\t");
			System.out.println(scores[i][0]+"\t"+scores[i][1]+"\t"+scores[i][2]);
		}
		

	}

}
