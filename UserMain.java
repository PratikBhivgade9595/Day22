package ClassProblem;

import java.util.List;
import java.util.Scanner;

public class UserMain {
    UserInterface userInterface = new UserInterface();
    UserRepository userRepository = new UserRepository();

    public static void main(String[] args) {
        UserMain userMain = new UserMain();
        int option = 0;
        while (option != 7) {
            option = userMain.userInterface.showMainMenu();
            userMain.handleUserSelection(option);
        }
    }

    public void handleUserSelection(int option){
        switch (option){
            case 1:
                addUserDetails();
                break;
            case 2:
                System.out.println("Enter The Name To Remove");
                Scanner sc = new Scanner(System.in);
                String userName = sc.next();
                User user = userRepository.getUserName(userName);
                userRepository.remove(user);
                break;
            case 3:
                printUserDetails(userRepository.getUserList());
                break;
            case 4:
                System.out.println("Enter The User Name You Want To Update");
                Scanner up = new Scanner(System.in);
                String userUpdate = up.next();
                User update = userRepository.getUserName(userUpdate);
                finallyUpdate(update);
                break;
            case 5:
                System.out.println("To Search By City : Enter City Name");
                Scanner sc1 = new Scanner(System.in);
                String searchCity = sc1.next();
                User city = userRepository.getCityName(searchCity);
                userRepository.search(city);
                break;
            case 6:
                System.out.println("To Search By State : Enter State Name");
                Scanner sc2 = new Scanner(System.in);
                String searchState = sc2.next();
                User state = userRepository.getState(searchState);
                userRepository.searchState(state);
                break;
            case 7:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Invalid");
        }
    }

    private void finallyUpdate(User update) {
        System.out.println("Enter Which Option You Want To Choose \n 1. FirstName \n 2. LastName \n 3. Address" +
                "\n 4. City \n 5. State \n 6. Pin \n 7. MobileNumber \n 8.Email");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        switch (option) {
            case 1:
                System.out.println("Enter New FirstName");
                update.firstName = sc.next();
                break;
            case 2:
                System.out.println("Enter New LastName");
                update.lastName = sc.next();
                break;
            case 3:
                System.out.println("Enter New Address");
                update.address = sc.next();
                break;
            case 4:
                System.out.println("Enter New City");
                update.city = sc.next();
                break;
            case 5:
                System.out.println("Enter New State");
                update.state = sc.next();
                break;
            case 6:
                System.out.println("Enter New Pin");
                update.pin = sc.next();
                break;
            case 7:
                System.out.println("Enter New MobileNumber");
                update.mobileNumber = sc.next();
                break;
            case 8:
                System.out.println("Enter New Email");
                update.email = sc.next();
                break;
            default:
                System.out.println("Invalid Option");
        }
    }

    private void printUserDetails(List<User> list) {
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }

    private void addUserDetails(){
        System.out.println("Enter User First Name");
        Scanner sc = new Scanner(System.in);
        User user = new User();
        user.firstName = sc.next();
        System.out.println("Enter User Last Name");
        user.lastName = sc.next();
        System.out.println("Enter User Address");
        user.address = sc.next();
        System.out.println("Enter User City");
        user.city = sc.next();
        System.out.println("Enter User State");
        user.state = sc.next();
        System.out.println("Enter User Pin");
        user.pin = sc.next();
        System.out.println("Enter User Mobile_Number");
        user.mobileNumber = sc.next();
        System.out.println("Enter User Email");
        user.email = sc.next();
        userRepository.add(user);
    }
}
