public class TestaBanco {
	public static void main(String[] args) {
		Cliente jenifer = new Cliente();
		jenifer.setNome("Jenifer Nakabar");
		jenifer.setCpf("222.222.222-22"); 
		jenifer.setProfissao("programador");

		Conta contaDaJenifer = new Conta();
		contaDaJenifer.deposita(100);

		contaDaJenifer.setTitular(jenifer);
		System.out.println(contaDaJenifer.getTitular().getNome());
		System.out.println(contaDaJenifer.getTitular());
		System.out.println(jenifer);
	}
}