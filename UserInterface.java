package ClassProblem;

import java.util.Scanner;

public class UserInterface {
    public int showMainMenu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose an option : \n 1. Add user details. \n 2. Remove user details. \n 3. Print all User details." +
                "\n 4. Update User Details. \n 5. Search By City. \n 6. Search By State. \n 7. Exit.");
        return (sc.nextInt());
    }
}
