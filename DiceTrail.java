package javaProgramming;

import java.util.Random;

class Dice {
    Random rand;
    int[] addArr;

    public Dice() {
        rand = new Random();
        addArr = new int[11];
    }

    public int roll() {
        return rand.nextInt(6)+1;
    }

    public void rollDice() {
        int dice1= roll();
        int dice2= roll();
        int sum = dice1+dice2;
        addArr[sum-2]++;
    }
    public void runSimulation(int rollsCount) {
        for (int i = 0; i < rollsCount; i++) {
            rollDice();
        }
    }
    public void displayResults() {
        System.out.print("Sum:-      ");
        for (int i = 2; i <= 12; i++) {
            System.out.print(i + "\t");
        }
        System.out.println("");
        System.out.print("Frequency:- ");
        for (int i = 2; i <= 12; i++) {
            System.out.print(addArr[i-2]+"\t");
        }
        System.out.println("");
    }
    public double calChiSquare() {
        double[] expected=new double[11];
        double[] observed= new double[]{1.0/36.0,2.0/36.0,3.0/36.0,4.0/36.0,5.0/36.0,6.0/36.0,5.0/36.0,4.0/36.0,3.0/36.0,2.0/36.0,1.0/36.0};
        for (int i = 0; i < 11; i++){
            expected[i] = observed[i]*1296;
        }
        double chi_square = 0.0;
        for (int i = 0; i < 11; i++) {
            chi_square += Math.pow((addArr[i] - expected[i]), 2) / expected[i];
        }
        return chi_square;
    }
    public boolean isDiceUnbiased() {
        double chiSquareRes = calChiSquare();
        return (chiSquareRes <= 18.307);
    }
    


}
public class DiceTrail
{
	public static void main(String args[])
	{
		Dice rd = new Dice();
        rd.runSimulation(1296);
        rd.displayResults();
        System.out.println("Value of ChiSquare: " + rd.calChiSquare());
        System.out.println("Is Dice Baised: " + rd.isDiceUnbiased());
	}
}