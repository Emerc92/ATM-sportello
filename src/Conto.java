import java.util.Scanner;

public abstract class Conto {
	private String nome;
	private String cognome;
	private int pin;
	protected int operazioni;
	protected int prelievo;
	protected int deposito;
	private static int saldo = 500;

	Scanner insert = new Scanner(System.in);

	public abstract void Azioni();

	public void Operazioni() {
		int ciclo = 0;
		int select = 0;
		do {
			do {
				System.out.println("\nselezione un'opzione:");
				System.out.println("	1 consulta saldo");
				System.out.println("	2 prelievo contanti");
				System.out.println("	3 versare contanti");
				System.out.println("	4 esci");
				select = insert.nextInt();
				if (select >= 0 && select <= 4) {
					ciclo = 1;
				} else {
					System.out.println("-----------------------------");
					System.out.println(" opzione non valida, riprova ");
					System.out.println("-----------------------------");
				}

			} while (ciclo == 0);

			if (select == 1) {
				Conto cliente = new RichiestaSaldo();
				cliente.Azioni();

			} else if (select == 2) {
				Conto cliente = new RichiestaPrelievo();
				cliente.Azioni();

			} else if (select == 3) {
				Conto cliente = new RichiestaDeposito();
				cliente.Azioni();

			} else if (select == 4) {
				System.out.println("-------------------------");
				System.out.println("  arrivederci e grazie ");
				System.out.println("-------------------------");
				ciclo = 2;
			}
		} while (ciclo != 2);
	}

	// metodo per il prelievo di soldi
	public void Prelievo() {
		prelievo = insert.nextInt();
	}

	// metodo per richiesta versamenti
	public void Deposito() {
		deposito = insert.nextInt();
	}

	public static int getSaldo() {
		return saldo;
	}

	public static void setSaldo(int saldo) {
		Conto.saldo = saldo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome() {
		System.out.println("per favore iserisca il suo nome");
		this.nome = insert.nextLine();
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome() {
		System.out.println("per favore iserisca il suo cognome");
		this.cognome = insert.nextLine();
	}

	public int getPin() {
		return pin;
	}

	
	public String toString() {
		return "nome cliente: " + nome + "\ncognome cliente: " + cognome;
	}

}
