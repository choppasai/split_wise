package SplitWise.ExpenseTracker.Service;

import SplitWise.ExpenseTracker.Models.ExpenseUser;
import SplitWise.ExpenseTracker.Models.UserProfile;
import SplitWise.ExpenseTracker.Repository.ExpenseUserRepo;

import java.util.List;

public class UserProfileServiceImpl implements UserProfileService {
    private final ExpenseUserRepo expenseUserRepo;
    private final UserProfile userProfile;
    public UserProfileServiceImpl(ExpenseUserRepo expenseUserRepo,UserProfile userProfile){
        this.expenseUserRepo =  expenseUserRepo;
        this.userProfile = userProfile;
    }
    public String changePassword(String newPassword){
        userProfile.setPassword(newPassword);
        return "Successfully changed password";
    }

    @Override
    public String changeName(String newName) {
        userProfile.setName(newName);
        return "Successfully changed name";

    }

    public String changeEmailId(String newEmailID){
        userProfile.setEmailId(newEmailID);
        return "Successfully changed email id";
    }
    public List<ExpenseUser> getExpenseList(){
        Integer userId = userProfile.getId();
        return expenseUserRepo.findByUserId(userId);
    }
}
