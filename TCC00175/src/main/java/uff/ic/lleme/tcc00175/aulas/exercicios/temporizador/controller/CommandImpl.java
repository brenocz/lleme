package uff.ic.lleme.tcc00175.aulas.exercicios.temporizador.controller;

import uff.ic.lleme.tcc00175.aulas.exercicios.temporizador.model.Temporizador;

public abstract class CommandImpl extends Command {

    public CommandImpl(Temporizador t) {
        super();
        receiver = t;
    }
    private Temporizador receiver = null;

    public Temporizador getReceiver() {
        return receiver;
    }
}
