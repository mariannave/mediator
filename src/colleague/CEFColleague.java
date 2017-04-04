package colleague;

import mediator.Mediator;

public class CEFColleague extends Colleague {

	public CEFColleague(Mediator m) {
		super(m);
	}

	@Override
	public void receber(String mensagem, Colleague de) {
		System.out.println("Caixa econ�mica recebeu " + mensagem + " do " + de);
	}

	@Override
	public String toString() {
		return "Caixa econ�mica";
	}

}
