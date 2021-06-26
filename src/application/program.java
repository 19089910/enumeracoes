package application;

        import java.util.Date;

        import entities.pedido;
        import entities.enums.statusDoPedido;

class Program {

    public static void main(String[] args) {

        pedido pedido = new pedido(1080, new Date(), statusDoPedido.PAGAMENTO_PENDENTE);

        System.out.println(pedido);
        //Conversão de String para enum
        statusDoPedido os1 = statusDoPedido.ENVIADO;

        statusDoPedido os2 = statusDoPedido.valueOf("ENVIADO");

        System.out.println(os1);
        System.out.println(os2);
    }
}
