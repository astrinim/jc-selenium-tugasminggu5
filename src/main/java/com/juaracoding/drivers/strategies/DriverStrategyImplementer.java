//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.juaracoding.drivers.strategies;

public class DriverStrategyImplementer {
    public DriverStrategyImplementer() {
    }

    public static DriverStrategy chooseStrategy(String strategy) {
        switch (strategy) {
            case "chrome":
                return new Chrome();
            case "firefox":
                return new Firefox();
            default:
                return null;
        }
    }
}
