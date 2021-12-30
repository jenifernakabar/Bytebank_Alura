public class TestaContaSemCliente {
	public static void main(String[] args) {
		Conta contaDaMelissa = new Conta();
		System.out.println(contaDaMelissa.getSaldo());

		contaDaMelissa.setTitular(new Cliente());
		System.out.println(contaDaMelissa.getTitular());

		contaDaMelissa.getTitular().setNome("Marcela"); 
		System.out.println(contaDaMelissa.getTitular().getCpf());

	}
}