package colleague;

import mediator.Mediator;

public abstract class Colleague {
	protected Mediator mediator;

	public Colleague(Mediator m) {
		mediator = m;
	}

	public void enviar(String mensagem, Colleague para) {
		mediator.enviarMediator(mensagem, this, para);
	}

	public abstract void receber(String mensagem, Colleague de);
}