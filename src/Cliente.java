import colleague.BBColleague;
import colleague.BradescoColleague;
import colleague.CEFColleague;
import colleague.ItauColleague;
import mediator.MensagemMediator;

public class Cliente {
	public static void main(String[] args) {
		TransfereMediator mediador = new TransfereMediator();

		BBColleague bb = new BBColleague(mediador);
		ItauColleague itau = new ItauColleague(mediador);
		BradescoColleague bradesco = new BradescoColleague(mediador);
		CEFColleague cef = new CEFColleague(mediador);

		mediador.adicionarColleague(bb);
		mediador.adicionarColleague(itau);
		mediador.adicionarColleague(bradesco);
		mediador.adicionarColleague(cef);

		bb.enviar("R$1.000,00", itau);
		itau.enviar("R$50,00", bb);
		cef.enviar("R$10,00", bradesco);

	}
}
