package com.racing.domain.view;

import java.util.Scanner;

public class InputView {
    public String inputCarName(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("CarName: ");
        return scanner.next();
    }
}
