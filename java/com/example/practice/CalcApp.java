package com.example.practice;

public class CalcApp {
    private int num1;
    private String opcode;
    private int num2;
    public static String webpage = "    <<< Calc.com >>>    " ;

    public String calc(int paraNum1, String paraOp, int paraNum2){
        num1 = paraNum1;
        opcode = paraOp;
        num2 = paraNum2;
        int result = num1 + num2;

        return num1 + " " + opcode + " " + num2 + " = " + result;
    }
}
