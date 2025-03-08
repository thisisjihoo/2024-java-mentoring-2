package com.racing.domain.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputView {

    private final Scanner scanner;

    public InputView(Scanner scanner) {
        this.scanner = scanner;
    }

    public List<String> inputCarName(){
        System.out.print("Input Car Name: ");

        List<String> cars = new ArrayList<>();
        while(scanner.hasNext()){
            cars.add(scanner.next());
        }
        return cars;
    }

}
