package com.racing.view;

import java.util.Scanner;

public class InputView {
    public String inputCarName(){

        Scanner scanner = new Scanner(System.in);
        return scanner.next("차 이름을 입력해주세요: ");
    }
}
