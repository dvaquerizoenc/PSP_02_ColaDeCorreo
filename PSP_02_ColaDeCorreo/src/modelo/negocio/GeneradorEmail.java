package modelo.negocio;

import modelo.entidad.Email;

public class GeneradorEmail {
	private int cont = 0;
	
	public Email generarEmail() {
		Email email = new Email();
		email.setDestinatario("Destinatario"+(++cont));
		email.setRemitente("Remitente"+(++cont));
	}
}
