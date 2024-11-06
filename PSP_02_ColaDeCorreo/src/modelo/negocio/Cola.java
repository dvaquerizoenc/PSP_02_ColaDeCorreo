package modelo.negocio;

import java.util.LinkedList;
import java.util.Queue;

import modelo.entidad.Email;

public class Cola {
	public final static int MAX_ELEMENTS = 5;
	
	private Queue<Email> cola = new LinkedList<>();
	
	public synchronized void addEmail(Email email) {
		while(cola.size() == MAX_ELEMENTS) {
			try {
				wait();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		cola.offer(email);
		notify();
	}
}
