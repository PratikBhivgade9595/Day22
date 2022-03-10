package ClassProblem;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    private List<User> userList = new ArrayList<>();

    public void add(User user) {
        userList.add(user);
    }

    public List<User> getUserList() {
        return userList;
    }

    public User getUserName(String userName) {
        for(int i = 0; i <= userList.size(); i++ ){
            if(userName.equalsIgnoreCase(userList.get(i).firstName)){
                return userList.get(i);
            }
        }
        return null;
    }

    public void remove(User user) {
        userList.remove(user);
    }

    public User getCityName(String searchCity) {
        for(int i = 0; i <= userList.size(); i++ ){
            if(searchCity.equalsIgnoreCase(userList.get(i).city)){
                return (userList.get(i));
            }
        }
        return null;
    }

    public void search(User city) {
        System.out.println(city);
    }

    public User getState(String searchState) {
        for(int i = 0; i <= userList.size(); i++ ){
            if(searchState.equalsIgnoreCase(userList.get(i).state)){
                return (userList.get(i));
            }
        }
        return null;
    }

    public void searchState(User state) {
        System.out.println(state);
    }
}
