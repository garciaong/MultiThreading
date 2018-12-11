package com.learning.multithread;

public class Request implements Runnable {

	private int id;
	
	public Request(int id) {
		this.id = id;
	}
	
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Request Id '"+id+"' of Task Id '"+i+"' is running in thread...");
		}
	}
}
