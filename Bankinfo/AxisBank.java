package org.Bankinfo;

public class AxisBank extends Bankinfo{
	 
	public void deposit () {
		System.out.println("A deposit is money you put into your bank account");
		
	}

	
	public static void main(String[] args) {
		AxisBank axis = new AxisBank ();
		axis.deposit();
		axis.fixed();
		axis.saving();
	}
}
