
public class MenuATM {

	public static void main(String[] args) {
		

		
		Conto cliente = new RichiestaSaldo();
		cliente.setNome();
		cliente.setCognome();
		
		System.out.println(cliente.toString());
		cliente.Operazioni();
		
	}

}
