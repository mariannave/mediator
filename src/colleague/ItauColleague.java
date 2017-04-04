package colleague;

import mediator.Mediator;

public class ItauColleague extends Colleague {

	public ItauColleague(Mediator m) {
		super(m);
	}

	@Override
	public void receber(String mensagem, Colleague de) {
		System.out.println("Itaú recebeu " + mensagem + " do " + de);
	}

	@Override
	public String toString() {
		return "Itaú";
	}

}
