/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UI;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pranitha
 */
public class UserAccountDirectory {

    private List<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList<>();
    }

    public List<UserAccount> getUserAccountList() {
        return userAccountList;
    }

    public void setUserAccountList(List<UserAccount> userAccountList) {
        this.userAccountList = userAccountList;
    }

    public UserAccount createUserAccount(String name, String username, String password, String network) {
        UserAccount ua = new UserAccount(name, username, password, network);
        ua.setName(name);
        ua.setUsername(username);
        ua.setPassword(password);
        ua.setNetwork(network);
        userAccountList.add(ua);
        return ua;
    }

    public UserAccount validateUser(String username, String password) {
        for (UserAccount acc : userAccountList) {
            if (acc.getUsername().equals(username) && acc.getPassword().equals(password)) {
                return acc;
            }
        }
        return null;
    }

    public UserAccount getAccountUserName(String userName) {
        UserAccount AccountDetail = userAccountList.stream().filter(x -> x.getUsername().equals(userName)).findAny().orElse(null);
        return AccountDetail;
    }

    public boolean duplicateUserName(String username) {
        for (UserAccount ua : userAccountList) {
            if (ua.getUsername().equals(username)) {
                return false;
            }
        }
        return true;
    }

    public void DeleteUserAccount(UserAccount account) {
        int value = userAccountList.indexOf(account);
        userAccountList.remove(value);
    }

}
