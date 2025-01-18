package com.calculator.domain;


import java.util.ArrayList;
import java.util.List;

public class StringCalculator {
    private final String INPUT_REG = "[,:]";
    private final String SLASH_REG = "//";

    public String[] regularSplitString(String factor, String message) {
        if (factor.contains(message)) {
            return factor.split(message);
        }
        return factor.split(INPUT_REG);

    }

    public String checkStartString(String factor) {
        if (factor.startsWith(SLASH_REG)) {
            return factor.substring(factor.indexOf("n")+1);
        }
        return factor;
    }

    public String subStringMessage(String factor) {
        if(factor.startsWith(SLASH_REG)){
            return factor.substring(2, 3);
        }
        return INPUT_REG;
    }

    public int[] changeStringToInt(String[] factor) {
        int[] intNumberFactor = new int[factor.length];
        for (int i = 0; i < factor.length; i++) {
            intNumberFactor[i] = Integer.parseInt(factor[i]);
        }
        return intNumberFactor;
    }

    public List<Integer> numberList(int[] numbers){
        List<Integer> numbersList = new ArrayList<>();
        for (int number : numbers) {
            numbersList.add(number);
        }
        return validateEmptyException(numbersList);
    }

    public int add(List<Integer> list){
        int sum = 0;
        for(int i : list)
            sum += i;
        return sum;
    }

    private List<Integer> validateEmptyException(List<Integer> numberList){
        if(numberList.isEmpty()){
            throw new RuntimeException();
        }
        return numberList;
    }

}

