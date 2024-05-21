package com.emard.facades;

import com.emard.facades.model.CPU;
import com.emard.facades.model.ComputerFacade;
import com.emard.facades.model.HardDrive;
import com.emard.facades.model.Memory;

public class TestFacade {
    public static void main(String[] args) {
        CPU cpu = new CPU();
        Memory memory = new Memory();
        HardDrive hd = new HardDrive();
        ComputerFacade facade = new ComputerFacade(cpu, memory, hd);
        facade.start();
    }
}
