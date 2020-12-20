package ifsp.poo.ex02;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ExpenseController {

    private ExpenseUI ui;

    public ExpenseController(ExpenseUI ui) {
        this.ui = ui;
    }

    public void save() {
        String category = ui.getCategory();
        String value = ui.getValue();
        LocalDate date = ui.getDate();
        String description = ui.getDescription();

        Expense expense = new Expense(description, new BigDecimal(value), category, date);
        System.out.println(expense);

        ui.clearUi();
    }
}
