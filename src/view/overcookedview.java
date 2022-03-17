package view;

import java.util.concurrent.Semaphore;

import controller.overcookedcontroller;

public class overcookedview {

	public static void main(String[] args) {
		Semaphore semaforo = new Semaphore(1);
		
		for(int threadId = 1; threadId < 6; threadId++) {
			Thread threadC = new overcookedcontroller(threadId, semaforo);
			threadC.start();
			
			
		}

	}

}
