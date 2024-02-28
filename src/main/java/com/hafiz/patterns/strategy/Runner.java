package com.hafiz.patterns.strategy;

public class Runner {
    public static void main(String[] args) {
        CarStrategy carStrategy = new CarStrategy();
        BusStrategy busStrategy = new BusStrategy();
        WalkStrategy walkStrategy = new WalkStrategy();
        CycleStrategy cycleStrategy = new CycleStrategy();

        Context context = new Context();

        //car strategy
        context.setStrategy(carStrategy);
        context.execute("A","B");

        //bus strategy
        context.setStrategy(busStrategy);
        context.execute("A","B");

        //walk strategy
        context.setStrategy(walkStrategy);
        context.execute("A","B");

        //cycle strategy
        context.setStrategy(cycleStrategy);
        context.execute("A","B");


    }
}
