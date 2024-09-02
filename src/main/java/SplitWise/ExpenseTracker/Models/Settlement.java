package SplitWise.ExpenseTracker.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Entity
@Getter
@Setter
public class Settlement extends Base{
    private String name;
    @ManyToOne
    @JoinColumn(name = "Group_Id")
    private Group group;
    @OneToMany
    private List<ExpenseUser> expenseUsers;

}
