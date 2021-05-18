package br.com.lojagama.implementacao;

import br.com.lojagama.beans.Cliente;
import br.com.lojagama.beans.Endereco;
import br.com.lojagama.beans.PessoaFisica;
import br.com.lojagama.beans.PessoaJuridica;
import br.com.lojagama.util.Magic;

public class ImplementarCliente {

	public static void main(String[] args) {
		
		Cliente cli = new Cliente();
		
		String nome = Magic.s("Nome:");
		String email = Magic.s("Email").toLowerCase();
		String fone = Magic.s("Fone");
		Endereco endereco = new Endereco();
		
		char resposta = Magic.s("Digite J para PJ ou F para PF").charAt(0);
		if (resposta=='J') {
			
			cli = new PessoaJuridica(
					nome,
					email,
					fone,
					endereco,
					Magic.s("CNPJ"),
					Magic.s("CNAE"),
					Magic.s("Contato")
					);
			
		}else if (resposta=='F') {
			
			cli = new PessoaFisica(
					nome,
					email,
					fone,
					endereco,
					Magic.s("CPF"),
					Magic.s("RG")
					);
			
		}else {
			System.out.println("Opção inválida");
		}
		
		//System.out.println(cli.toString());

		if (cli instanceof PessoaFisica) {
			System.out.println(((PessoaFisica) cli).getDocumentos());
		}else if (cli instanceof PessoaJuridica) {
			System.out.println(((PessoaJuridica) cli).getDocumentos());
		}
		

	}

}
