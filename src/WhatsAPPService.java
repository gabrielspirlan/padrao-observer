package padroes_observer;

public class WhatsAPPService implements VendaObserver{

	@Override
	public void atualizarVenda(Venda venda) {
		
		this.enviarZap(venda);
	}

	private void enviarZap (Venda venda) {
		System.out.println("ZapSService: enviando whats..." +
				venda.getCliente());
	}
}
