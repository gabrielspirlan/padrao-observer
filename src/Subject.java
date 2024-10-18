package padroes_observer;

public interface Subject {
	
	public void register(VendaObserver observer);
	
	public void unRegister (VendaObserver observer);
	
	public void notifyObservers();
}
