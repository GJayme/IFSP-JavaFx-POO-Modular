package ifsp.poo.ex02;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Expense {
    private String description;
    private BigDecimal value;
    private String category;
    private LocalDate date;

    public Expense(String description, BigDecimal value, String category, LocalDate date) {
        this.description = description;
        this.value = value;
        this.category = category;
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Expense{" +
                "description='" + description + '\'' +
                ", value=" + value +
                ", category='" + category + '\'' +
                ", date=" + date +
                '}';
    }
}
