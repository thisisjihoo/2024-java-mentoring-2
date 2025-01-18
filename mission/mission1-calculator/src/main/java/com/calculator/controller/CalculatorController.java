package com.calculator.controller;

import com.calculator.domain.StringCalculator;
import com.calculator.view.InputView;
import com.calculator.view.OutputView;

import java.util.List;

public class CalculatorController {
    StringCalculator stringCalculator = new StringCalculator();
    InputView inputView = new InputView();
    OutputView outputView =new OutputView();

    public void calculatorControl(){
        String factor = inputView.InputString();

        String message = stringCalculator.subStringMessage(factor);
        String checkFactor = stringCalculator.checkStartString(factor);

        String[] checkedFactor = stringCalculator.regularSplitString(checkFactor,message);
        int[] argumentValue = stringCalculator.changeStringToInt(checkedFactor);
        List<Integer> list = stringCalculator.numberList(argumentValue);

        int result = stringCalculator.add(list);

        outputView.outputView(result);


    }
}
