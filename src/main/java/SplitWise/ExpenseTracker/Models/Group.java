package SplitWise.ExpenseTracker.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "GroupName")
public class Group extends Base{
    private String name;
    private String description;
    @OneToMany
    private List<User> userList;
    @OneToMany(mappedBy = "group")
    private List<Expense> expenseList;

    @OneToMany(mappedBy = "group")
    private List<Settlement> settlementList;

}
