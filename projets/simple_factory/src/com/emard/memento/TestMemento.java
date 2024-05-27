package com.emard.memento;

import com.emard.memento.models.CareTaker;
import com.emard.memento.models.Memento;
import com.emard.memento.models.Originator;

public class TestMemento {
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("Monster");
        Memento memento = originator.createMemento();
        CareTaker careTaker = new CareTaker();
        careTaker.addMemento(memento);
        originator.setState("Monster 2");
        originator.setState("Monster 3");
        memento = originator.createMemento();
        careTaker.addMemento(memento);
        originator.setState("Monster 4");
        System.out.println("Originator current state: "+originator.getState());
        System.out.println("Origininator restoring to previous state...");
        memento = careTaker.getMemento(1);
        originator.setMemento(memento);
        System.out.println("Originator current state: "+originator.getState());
        System.out.println("Again Origininator restoring to previous state...");
        memento = careTaker.getMemento(0);
        originator.setMemento(memento);
        System.out.println("Originator current state: "+originator.getState());
    }
}
