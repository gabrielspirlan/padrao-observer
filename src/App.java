package padroes_observer;

public class App {
	public static void main(String[] args) {
		VendaSubject subject = new VendaSubject();
		
		EmailService email = new EmailService();
		subject.register(email);
		
		EstoqueService estoque = new EstoqueService();
		subject.register(estoque);
		
		WhatsAPPService whatsApp = new WhatsAPPService();
		subject.register(whatsApp);
		
		Venda v1 = new Venda(111, "Joao", 1599.99);
		
		subject.setVenda(v1);
	}

}
