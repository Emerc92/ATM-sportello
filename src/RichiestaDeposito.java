
public class RichiestaDeposito extends Conto {

	public void Azioni() {
		System.out.println("----------------------------------");
		System.out.println("inserire l'importo di depositare");
		System.out.println("----------------------------------");

		Deposito();
		operazioni = getSaldo();
		setSaldo(operazioni + deposito);
		System.out.println("---------------------------------");
		System.out.println("deposito realizzato di: " + deposito + " euro");
		System.out.println("---------------------------------");
		System.out.println("saldo attuale: " + getSaldo() + " euro");
		System.out.println("-------------------------------" + "--");

	}
}
