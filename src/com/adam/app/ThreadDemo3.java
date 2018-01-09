/**
 * When block function (ex sleep) catch the interrupted exception the interrupt flag would be reset.
 */
package com.adam.app;


public class ThreadDemo3 {

	public static void main(String[] args) {

		Thread work = new Thread(new WorkThread());
		
		work.start();
		
		
		try {
			//Delay 3 sec
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// interrupt thread
		work.interrupt();
		
	}

	private static class WorkThread implements Runnable {

		@Override
		public void run() {
			
			while (Thread.interrupted() == false) {
				
				try {
					System.out.println("A: isInterrupted = " + Thread.currentThread().isInterrupted());
					// Sleep at 1 sec
					Thread.sleep(1000L);
				} catch (InterruptedException e) {
					System.out.println("catch interrupted exception...");
					System.out.println("B: isInterrupted = " + Thread.currentThread().isInterrupted());
					Thread.currentThread().interrupt();
				}
				System.out.println("C: isInterrupted = " + Thread.currentThread().isInterrupted());
			}
			
			System.out.println("D: isInterrupted = " + Thread.currentThread().isInterrupted());
		}
		
	}
	
}

/*
 * ===========================================================================
 * 
 * Revision history
 * 
 * ===========================================================================
 */
