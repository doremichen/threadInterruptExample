/**
 * isInterrupted do not reset the interrupt flag
 */
package com.adam.app;

public class DemoThread1 {

	public static void main(String[] args) {

		System.out.println("A: isInterrupted = " + Thread.currentThread().isInterrupted());
		Thread.currentThread().interrupt();
		System.out.println("B: isInterrupted = " + Thread.currentThread().isInterrupted());
		System.out.println("C: isInterrupted = " + Thread.currentThread().isInterrupted());
		
	}

}

/*
 * ===========================================================================
 * 
 * Revision history
 * 
 * ===========================================================================
 */
