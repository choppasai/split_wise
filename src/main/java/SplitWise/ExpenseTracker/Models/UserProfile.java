package SplitWise.ExpenseTracker.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class UserProfile extends User{
    private String password;
    @OneToMany
    private List<ExpenseUser> expenseList;



}
