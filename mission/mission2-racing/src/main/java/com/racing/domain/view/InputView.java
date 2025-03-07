package com.racing.domain.view;

import java.util.Scanner;

public class InputView {

    private final Scanner scanner;

    public InputView(Scanner scanner) {
        this.scanner = scanner;
    }

    public String[] inputCarName(int carNumber){
        System.out.print("Car Name: ");

        String[] carName = new String[carNumber];
        for(int i = 0; i < carNumber; i++){
             carName[i] = scanner.next();
        }
        return carName;
    }

    public int inputCarNumber(){
        System.out.print("Car Number: ");
        return scanner.nextInt();
    }
}
