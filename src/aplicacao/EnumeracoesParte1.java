package aplicacao;

import java.util.Date;

import entidades.Ordem;
import entidades.enums.OrdemStatus;

public class EnumeracoesParte1 {

	public static void main(String[] args) {
		
		//Instanciamento do pedido com status 'pagamento pendente'.
		Ordem ordem = new Ordem(1080, new Date(), OrdemStatus.PAGAMENTO_PENDENTE);
		System.out.println(ordem);
		
		OrdemStatus os1 = OrdemStatus.ENTREGUE;
		OrdemStatus os2 = OrdemStatus.valueOf("ENTREGUE");
		
		System.out.println(os1);
		System.out.println(os2);
	}

}
