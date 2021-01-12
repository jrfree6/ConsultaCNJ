package br.com.corecnj.principal;

import br.jus.cnj.www.sgt.sgt_ws.Sgt_ws_methodsPortProxy;

public class Main {

	public static void main(String[] args) {
		
		try {
			
			Sgt_ws_methodsPortProxy proxy = new Sgt_ws_methodsPortProxy();
			
			proxy.setEndpoint("https://www.cnj.jus.br/sgt/sgt_ws.php");
			
			System.out.println("ultima Versão:"+proxy.getDataUltimaVersao());
			
			
//			proxy.pesquisarItemPublicoWS(tipoTabela, tipoPesquisa, valorPesquisa)
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
