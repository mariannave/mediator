package mediator;

import java.util.ArrayList;

import colleague.Colleague;

public class MensagemMediator implements Mediator {

	protected ArrayList<Colleague> bancos;

	public MensagemMediator() {
		bancos = new ArrayList<Colleague>();
	}

	public void adicionarColleague(Colleague colleague) {
		bancos.add(colleague);
	}

	@Override
	public void enviarMediator(String mensagem, Colleague de, Colleague para) {
		if (this.bancos.contains(para) && !de.equals(para)) {
			para.receber(mensagem, de);
		}
	}

}
