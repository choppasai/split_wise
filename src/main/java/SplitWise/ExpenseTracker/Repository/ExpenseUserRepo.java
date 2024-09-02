package SplitWise.ExpenseTracker.Repository;

import SplitWise.ExpenseTracker.Models.ExpenseUser;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExpenseUserRepo extends JpaRepository<Id,Integer> {
    public List<ExpenseUser> findByUserId(Integer id);
}
