
public class RichiestaPrelievo extends Conto {

	public void Azioni() {
		System.out.print("inserire importo da prelevare: ");

		Prelievo();
		if (prelievo < getSaldo()) {
			operazioni = getSaldo();
			setSaldo(operazioni - prelievo);
			System.out.println("-----------------------------");
			System.out.println("contanti prelevati: " + prelievo + " euro");
			System.out.println("-----------------------------");
			System.out.println("saldo attuale: " + getSaldo() + " euro");
			System.out.println("-----------------------------");
		} else {
			System.out.println("-----------------------------");
			System.out.println(" saldo insufficiente, riprova");
			System.out.println("-----------------------------");
		}
	}

}