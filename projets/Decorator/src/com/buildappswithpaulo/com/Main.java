package com.buildappswithpaulo.com;

import com.buildappswithpaulo.com.interfaces.IceCream;
import com.buildappswithpaulo.com.interfaces.IceCreamDecorator;
import com.buildappswithpaulo.com.model.BasicIceCream;
import com.buildappswithpaulo.com.model.ChocolateIceCream;
import com.buildappswithpaulo.com.model.MintIceCream;
import com.buildappswithpaulo.com.model.VanillaIceCream;

public class Main {
    public static void main(String[] args) {
        IceCream basicIceCream = new BasicIceCream();
        System.out.println(String.format("basic Ice-Cream cost $%s", basicIceCream.cost()));
        //Add vanilla to the order
        IceCream vanilla = new VanillaIceCream(basicIceCream);

        System.out.println(String.format("Adding Vanilla cost $%s", vanilla.cost()));
        //Add Mint
        //vanilla = vanilla.getDecorated();//remove vanilla
        IceCream mint = new MintIceCream(vanilla);
        System.out.println(String.format("Adding mint cost $%s", mint.cost()));

        mint = mint.getDecorated();//remove mint
        IceCream chocolate = new ChocolateIceCream(mint);
        System.out.println(String.format("Adding chocolate cost $%s", chocolate.cost()));
    }
}
