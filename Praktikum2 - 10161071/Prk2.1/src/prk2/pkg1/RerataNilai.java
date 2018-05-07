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
public class RerataNilai {

	double a2, b2 = 0;
	int a1, b1, a, b, c = 0;

	public int average(int x1, int y1) {
		this.a1 = x1;
		this.b1 = y1;
		return ((this.a1 + this.b1) / 2);
	}

	public double average(double x2, double y2) {
		this.a2 = x2;
		this.b2 = y2;
		return ((this.a2 + this.b2) / 2) + 9.65;
	}

	public int average(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
		return ((this.a + this.b + this.c) / 2) + 221;
	}

}
