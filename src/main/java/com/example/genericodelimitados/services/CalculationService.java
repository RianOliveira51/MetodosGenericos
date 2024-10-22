package com.example.genericodelimitados.services;

import java.util.Comparator;
import java.util.List;

//Por ser uma operação static não precisa instanciar a classe
public class CalculationService {
    //<T> estou falando que esse metodo vai trabalhar com um tipo T.
    //Colocamos <T extends Comparable<T>> assim para dizer que o T é qualquer tipo de comparable T.
    public static <T extends Comparable<T>> T max(List<T> list){
        if(list.isEmpty()){
            throw new IllegalStateException("List can´t be empty");
        }
        T max = list.get(0);
        for(T item : list){
            if(item.compareTo(max) > 0){
                max = item;
            }
        }
        return  max;
    }
}
