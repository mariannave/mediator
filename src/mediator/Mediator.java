package mediator;

import colleague.Colleague;

public interface Mediator {
	public void enviarMediator(String mensagem, Colleague de, Colleague para);
}
