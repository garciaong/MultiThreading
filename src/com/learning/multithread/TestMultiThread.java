package com.learning.multithread;

public class TestMultiThread {

	public static void main(String [] args) throws InterruptedException {
		Request req1 = new Request(1);
		Thread t1 = new Thread(req1);
		Request req2 = new Request(2);
		Thread t2 = new Thread(req2);
		
		t1.start();
		t2.start();
	}
	
}
