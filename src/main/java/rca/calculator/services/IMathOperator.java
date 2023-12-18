package rca.calculator.services;

import rca.calculator.exceptions.InvalidOperationException;

public interface IMathOperator {

    double doMath(double operand1, double operand2, String operation) throws InvalidOperationException;
}
