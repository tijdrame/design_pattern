package com.emard.memento.models;

public class Originator {
    //just pour simplififier sinon
    // ce serai un POJO
    private String state;
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public Memento createMemento(){
        return new Memento(state);
    }
    public void setMemento(Memento memento){
        state = memento.getState();
    }
}
