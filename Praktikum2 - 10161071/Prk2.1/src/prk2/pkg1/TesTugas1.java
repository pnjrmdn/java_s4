/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prk2.pkg1;

/**
 *
 * @author ACER
 */
public class TesTugas1 {

	public static void main(String args[]) {
		RerataNilai rn = new RerataNilai();
		System.out.println("Rerata nilai 21 dan 13 adalah : " + rn.average(21, 13));
		System.out.println("Rerata nilai 19.3 dan 39.5 adalah : " + rn.average(19.3, 39.5));
		System.out.println("Rerata nilai 123, 567 dan 744 adalah : " + rn.average(123, 567, 744));
	}

}
