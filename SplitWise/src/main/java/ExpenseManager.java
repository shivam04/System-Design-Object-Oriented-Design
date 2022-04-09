import java.util.HashMap;
import java.util.Map;

/**
 * Created by shivam.si on 09/04/22 6:53 am
 */

public class ExpenseManager {
    Map<String, User> users = new HashMap<>();
    Map<User, Map<User, Double>> balanceSheet = new HashMap<>();


    public Expense createExpense(String paidTo, String paidBy, double amount) {
        User userPaidTo = getUser(paidTo);
        User userPaidBy = getUser(paidBy);
        return new Expense(userPaidBy, userPaidTo, amount);
    }

    public User getUser(String name) {
        User user = users.get(name);
        if(user == null) {
            user = new User(name);
            users.put(name, user);
        }
        return user;
    }

    public void addExpense(String paidTo, String paidBy, double amount) {
        Expense expense = createExpense(paidTo, paidBy, amount);
        Map<User, Double> balances = balanceSheet.getOrDefault(expense.getPaidBy(), new HashMap<>());
        if(!balances.containsKey(expense.getPaidTo())) {
            balances.put(expense.getPaidTo(), 0.0);
        }
        balances.put(expense.getPaidTo(), balances.get(expense.getPaidTo()) + expense.getAmount());
        balanceSheet.put(expense.getPaidBy(), balances);



        balances = balanceSheet.getOrDefault(expense.getPaidTo(), new HashMap<>());

        if(!balances.containsKey(expense.getPaidBy())) {
            balances.put(expense.getPaidBy(), 0.0);
        }
        balances.put(expense.getPaidBy(), balances.get(expense.getPaidBy()) - expense.getAmount());
        balanceSheet.put(expense.getPaidTo(), balances);

        //N -> M -> 20
        //M -> N -> -20
    }

    public void showOwedMoney() {
        for(Map.Entry<User, Map<User, Double>> balance: balanceSheet.entrySet()) {
            User user = balance.getKey();
            for(Map.Entry<User, Double> individualBalance : balance.getValue().entrySet()) {
                if(individualBalance.getValue() < 0.0)
                    printBalance(user, individualBalance.getKey(), individualBalance.getValue());
            }
        }
    }

    public void personOwed(String name) {
        User user = getUser(name);
        Map<User, Double> balances = balanceSheet.get(user);
        if(balances != null) {
            for(Map.Entry<User, Double> individualBalance : balances.entrySet()) {
                if(individualBalance.getValue() < 0.0)
                    printBalance(user, individualBalance.getKey(), individualBalance.getValue());
            }
        }
    }


    public void getMostDebtPerson() {
        User mostDebtUser = null;
        double amount = 0.0;
        for(Map.Entry<User, Map<User, Double>> balance: balanceSheet.entrySet()) {
            User user = balance.getKey();
            double individualDebtAmount = 0.0;
            for(Map.Entry<User, Double> individualBalance : balance.getValue().entrySet()) {
                individualDebtAmount += individualBalance.getValue();
            }
            if(individualDebtAmount < amount) {
                amount = individualDebtAmount;
                mostDebtUser = user;
            }
        }
        if(mostDebtUser != null)
            System.out.println("Most Debt user " + mostDebtUser.getName() + " " + amount);
    }

    public void getMostOwedPerson() {
        User mostOwedUser = null;
        double amount = 0.0;
        for(Map.Entry<User, Map<User, Double>> balance: balanceSheet.entrySet()) {
            User user = balance.getKey();
            double individualDebtAmount = 0.0;
            for(Map.Entry<User, Double> individualBalance : balance.getValue().entrySet()) {
                individualDebtAmount += individualBalance.getValue();
            }
            if(individualDebtAmount > amount) {
                amount = individualDebtAmount;
                mostOwedUser = user;
            }
        }
        if(mostOwedUser != null)
            System.out.println("Most Owed user " + mostOwedUser.getName() + " " + amount);
    }

    private void printBalance(User user1, User user2, Double amount) {
        if(amount < 0.0) {
            System.out.println(user1.getName() + " owed " + user2.getName() + " " + -1*amount);
        } else {
            System.out.println(user2.getName() + " owed " + user1.getName() + " " + amount);
        }
    }
}
