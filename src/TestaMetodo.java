public class TestaMetodo {
	public static void main(String[] args) {
		Conta contadaJenifer = new Conta();
		contadaJenifer.deposita(100);
		contadaJenifer.deposita(50);
		System.out.println(contadaJenifer.getSaldo());

		boolean conseguiuRetirar = contadaJenifer.saca(20);
		System.out.println(contadaJenifer.getSaldo());
		System.out.println(conseguiuRetirar);

		Conta contaDaMelissa = new Conta();
		contaDaMelissa.deposita(1000);

		boolean sucessoTransferencia = contaDaMelissa.transfere(300, contadaJenifer);

		if (sucessoTransferencia) {
			System.out.println("transferencia com sucesso");

		} else {
			System.out.println("faltou dinheiro");

		}
		System.out.println(contaDaMelissa.getSaldo());
		System.out.println(contadaJenifer.getSaldo());
	}

}