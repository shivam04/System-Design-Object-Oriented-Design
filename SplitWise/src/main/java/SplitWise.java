import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by shivam.si on 09/04/22 6:42 am
 */

public class SplitWise {
    public static void main(String[] args) throws Exception{
        ExpenseManager expenseManager = new ExpenseManager();
        while(true) {
            BufferedReader br = new BufferedReader(new FileReader("/Users/shivam/Desktop/SplitWise/src/main/resources/expense.csv"));
            String line = "";
            String splitBy = ",";
            while ((line = br.readLine()) != null)   //returns a Boolean value
            {
                String[] expense = line.split(splitBy);    // use comma as separator
                try {
                    expenseManager.addExpense(expense[0], expense[1], Double.parseDouble(expense[2]));
                } catch (Exception ignore) {}
            }
            break;
        }
        expenseManager.showOwedMoney();
        System.out.println("============");
        expenseManager.personOwed("N");
        System.out.println("============");
        expenseManager.getMostDebtPerson();
        System.out.println("============");
        expenseManager.getMostOwedPerson();
    }
}
