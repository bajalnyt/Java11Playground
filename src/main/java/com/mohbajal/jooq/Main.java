package com.mohbajal.jooq;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class Main {


    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();

        //stringSet.addAll(new HashSet<>(null));
        Optional.ofNullable(stringSet).ifPresent(new HashSet<>(null)::addAll);

    }
}
