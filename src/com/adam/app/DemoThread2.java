/*
 * Interrupted would reset the interrupt flag
 */
package com.adam.app;

public class DemoThread2 {

	public static void main(String[] args) {
		
		System.out.println("A: Interrupted = " + Thread.interrupted());
		Thread.currentThread().interrupt();
		System.out.println("B: Interrupted = " + Thread.interrupted());
		System.out.println("C: Interrupted = " + Thread.interrupted());

	}

}

/*
 * ===========================================================================
 * 
 * Revision history
 * 
 * ===========================================================================
 */
