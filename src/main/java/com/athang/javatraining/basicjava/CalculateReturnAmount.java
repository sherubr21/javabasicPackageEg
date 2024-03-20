package com.athang.javatraining.basicjava;

public class CalculateReturnAmount {

    public static void main(String[] args) {
        CalculateReturnAmount calculateReturnAmount = new CalculateReturnAmount();
        calculateReturnAmount.execute();
    }

    private void execute() {
        int priceOfChocolate = 395;
        int receivedDollar = 10;
        float exchangeRate = 79.879f;
        float returnAmount ;

        returnAmount  = receivedDollar * exchangeRate - priceOfChocolate;

      //  int returnAmountInInteger = (int) returnAmount;

        System.out.println("Total Amount Returned to Tourist: (Nu)" + (int) returnAmount);
    }
}
