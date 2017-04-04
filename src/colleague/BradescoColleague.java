package colleague;

import mediator.Mediator;

public class BradescoColleague extends Colleague {

	public BradescoColleague(Mediator m) {
		super(m);
	}

	@Override
	public void receber(String mensagem, Colleague de) {
		System.out.println("Bradesco recebeu " + mensagem + " do " + de);
	}

	@Override
	public String toString() {
		return "Bradesco";
	}

}
