/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
 
package gov.irs;

import java.util.ArrayList;
import java.util.Collection;

/**
 * The IRS maintains a collection of TaxPayers and collects taxes from them.
 * <p>
 * Note the interface type TaxPayer, used throughout the class.
 */
public class IRS {
    // what types of objects can this array contain?
    private final Collection<TaxPayer> payers = new ArrayList<>();
    // for dealing with the array

    public void collectTaxes() {
        for(TaxPayer payer : payers) {
            double deduction = payer.getStandardReduction();
            System.out.println("Tax payer's reduction is " + deduction);
            payer.payTaxes();
            System.out.println();
        }
    }
    
    // helper method to add a TaxPayer to the array
    // what types of objects can be passed to this method?
    public void register(TaxPayer payer) {
        payers.add(payer);
    }
}