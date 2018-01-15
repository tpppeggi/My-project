package com.peg;

public class DiceRoller {
	public static void main(String[] args) {
		boolean result = true;
		int a=0;
		while (result) {
			int dice1 = dice();
			int dice2 = dice();
			int dice3 = dice();
			System.out.println(dice1 + " " + dice2 + " " + dice3 + " ");
		

			if (dice1 == dice2 || dice2 == dice3) {
				result = false;
			}
			if(dice1==6){
				a++;
			}if(dice2==6){
				a++;
			}if(dice3==6){
				a++;
			}

		}
		System.out.println("6出現"+a+"次");
	

	}

	public static int dice() {
		return (int) (Math.random() * 6) + 1;
	}

}


