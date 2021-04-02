package com.demo.driver;

import com.demo.api.Checker;

import java.util.Iterator;
import java.util.ServiceLoader;

public class Main {

    public static void main(String[] args) {
        ServiceLoader<Checker> checkers = ServiceLoader.load(Checker.class);
        Iterator<Checker> it = checkers.iterator();
        while (it.hasNext()) {
            it.next().check();
        }
    }

}
