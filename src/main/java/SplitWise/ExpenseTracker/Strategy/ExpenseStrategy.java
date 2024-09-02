package SplitWise.ExpenseTracker.Strategy;

import SplitWise.ExpenseTracker.Models.Expense;

public interface ExpenseStrategy {

    ExpenseStrategy calculateExpense(Expense expense);
}
