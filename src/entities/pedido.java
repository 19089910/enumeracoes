package entities;

        import java.util.Date;

        import entities.enums.statusDoPedido;

public class pedido {

    private Integer id;
    private Date moment;
    private statusDoPedido status;//server de uma variavel para dizer do estatus

    public pedido() {
    }

    public pedido(Integer id, Date moment, statusDoPedido status) {
        this.id = id;
        this.moment = moment;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public statusDoPedido getStatus() {
        return status;
    }

    public void setStatus(statusDoPedido status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order [id=" + id + ", moment=" + moment + ", status=" + status + "]";
    }
}