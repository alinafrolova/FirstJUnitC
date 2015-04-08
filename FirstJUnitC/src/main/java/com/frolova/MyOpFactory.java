package com.frolova;

/**
 * Created by иарвар on 19.03.2015.
 */
public class MyOpFactory implements OperationFactory {
    int operationCode;
    private Operation operation;
    @Override
    public Operation getOpInstance(int op) {
        this.operationCode = op;
//Выбор операции
        switch (operationCode){
            case 0:{
                operation = new Plus();
                break;
            }
            case 1:{
                operation = new Minus();
                break;
            }
            case 2:{
                operation = new Mult();
                break;
            }
            case 3:{
                operation = new Divis();

                break;
            }

            default:{
                operation = null;
            }
        }

        return operation;
    }


}
