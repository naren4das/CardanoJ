// Review Completed

package com.cardanoJ;

import com.cardanoJ.transaction.CardanoJBuildTransaction;

public class Main {
    public static void main(String[] args) {
        CardanoJBuildTransaction cardanoJBuildTransaction = new CardanoJBuildTransaction();
        cardanoJBuildTransaction.transact();
    }
}
