package one.digitalinnovation.gof.service.handler;

import one.digitalinnovation.gof.model.Cliente;

public abstract class ClienteHandler {

    protected ClienteHandler next;

    public ClienteHandler setNext(ClienteHandler next) {
        this.next = next;
        return next;
    }

    public void handle(Cliente cliente) {
        process(cliente);
        if (next != null) {
            next.handle(cliente);
        }
    }

    protected abstract void process(Cliente cliente);
}