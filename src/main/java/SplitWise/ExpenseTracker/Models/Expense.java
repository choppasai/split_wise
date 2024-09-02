package SplitWise.ExpenseTracker.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Expense extends Base{
    private String name;
    private Double amount;
    private String description;
    @ManyToOne
    @JoinColumn(name = "Group_Id")
    private Group group;

    @OneToMany(mappedBy = "expense")
    private List<ExpenseUser> expenseUsers;

    @Enumerated(value = EnumType.STRING)
    private ExpenseType expenseType;

}
