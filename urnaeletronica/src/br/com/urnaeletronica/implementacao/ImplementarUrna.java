package br.com.urnaeletronica.implementacao;

import java.util.ArrayList;
import java.util.List;

import br.com.bankofoz.util.Magic;
import br.com.urnaeletronica.beans.Urna;
import br.com.urnaeletronica.beans.Voto;
import br.com.urnaeletronica.beans.VotoReduzido;

public class ImplementarUrna {
	public static void main(String[] args) {

		Urna urna = new Urna();
		urna.setSecao(Magic.i("Secao"));
		urna.setZona(Magic.i("Zona"));
		
		List<Voto> lista = new ArrayList<Voto>();
		do {
			lista.add(new Voto(
					Magic.i("Titulo"),
					Magic.s("Candidato"),
					Magic.s("Cargo"),
					(byte) Magic.i("Turno")
					));
		}while(Magic.b("Continuar?")==true);
		
		urna.setVotos(lista);
		
		// a partir desta linha temos uma urna
		int qtdeVotos1 = 0;
		int qtdeVotosXpto=0;
		int qtdeVotosVereador=0;
		List<VotoReduzido> resultado = new ArrayList<VotoReduzido>();
		
		for (Voto voto : urna.getVotos()) {
			resultado.add(new VotoReduzido(voto.getCandidato(), voto.getTitulo()));
			if (voto.getCargo().equalsIgnoreCase("VEREADOR")) {
				qtdeVotosVereador++;
			}
			if (voto.getCandidato().equalsIgnoreCase("XPTO")) {
				qtdeVotosXpto++;
			}
			if (voto.getTurno()==1) {
				qtdeVotos1++;
			}
				
		}
		System.out.println("Votos do primeiro turno: " + qtdeVotos1);
		System.out.println("Votos do candidato Xpto: " + qtdeVotosXpto);
		System.out.println("Votos para Vereador: " + qtdeVotosVereador);
		System.out.println("Total de Votos: " + urna.getVotos().size());
		System.out.println("Votos Reduzidos: " + resultado);
	}
}
