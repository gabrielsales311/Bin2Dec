package br.com.brq.conversor.bean;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class ConversorBean {

	private Numero numero = new Numero();

	public Numero getNumero() {
		return numero;
	}

	public void converter() {
		try {
			String binario = this.numero.getBinario();
			int decimal = Integer.parseInt(binario, 2);
			this.numero.setDecimal(decimal);
			this.numero.setMensagem("Numero convertido com sucesso!");

		} catch (Exception numberFormatException) {
			this.numero.setMensagem("Numero invalido");
		}
	}
}
