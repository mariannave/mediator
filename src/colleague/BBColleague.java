package colleague;

import mediator.Mediator;

public class BBColleague extends Colleague {

	@Override
	public String toString() {
		return "Banco do Brasil";
	}

	public BBColleague(Mediator m) {
		super(m);
	}

	@Override
	public void receber(String mensagem, Colleague de) {
		System.out.println("Banco do Brasil recebeu " + mensagem + " do " + de);

	}

}
