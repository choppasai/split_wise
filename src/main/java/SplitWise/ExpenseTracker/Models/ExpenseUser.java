package SplitWise.ExpenseTracker.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ExpenseUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Double amount;
    @ManyToOne
    @JoinColumn(name = "Expense_Id")
    private Expense expense;

    @ManyToOne
    @JoinColumn(name = "User_Id")
    private User user;

    @Enumerated(value = EnumType.STRING)
    private ExpenseUserType expenseUserType;
//    @ManyToOne
//    @JoinColumn(name = "UserProfile_Id")
//    private UserProfile userProfile;



}
