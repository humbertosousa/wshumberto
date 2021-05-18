package br.com.lojagama.implementacao;

import br.com.lojagama.beans.Cliente;
import br.com.lojagama.beans.Endereco;
import br.com.lojagama.beans.PessoaFisica;
import br.com.lojagama.beans.PessoaJuridica;
import br.com.lojagama.util.Magic;

public class ImplementarCliente2 {
	public static void main(String[] args) {

		String nome = Magic.s("Nome:");
		String email = Magic.s("Email").toLowerCase();
		String fone = Magic.s("Fone");
		Endereco endereco = new Endereco();

		char resposta = Magic.s("Digite J para PJ ou F para PF").charAt(0);
		if (resposta=='J') {

			PessoaJuridica pj = new PessoaJuridica(
					nome,
					email,
					fone,
					endereco,
					Magic.s("CNPJ"),
					Magic.s("CNAE"),
					Magic.s("Contato")
					);
			System.out.println(pj.toString());

		}else if (resposta=='F') {

			PessoaFisica pf = new PessoaFisica(
					nome,
					email,
					fone,
					endereco,
					Magic.s("CPF"),
					Magic.s("RG")
					);
			System.out.println(pf.toString());
		}else {
			System.out.println("Opção inválida");
		}

		
	}
}
