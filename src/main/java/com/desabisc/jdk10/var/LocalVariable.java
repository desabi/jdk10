package com.desabisc.jdk10.var;

import java.util.ArrayList;

public class LocalVariable {
    public static void main(String[] args) {
        // Without var
        ArrayList<String> list = new ArrayList<>();

        // With var
        var myList = new ArrayList<>();
    }
}
