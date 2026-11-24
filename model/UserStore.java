package model;

import java.util.LinkedHashMap;
import java.util.Map;

public class UserStore {
    Map<String, UserDetails> userStore = new LinkedHashMap<String, UserDetails>();

    public void addUser(UserDetails user){
        userStore.put(user.getName(), user);
    }
    public UserDetails getUser(String username){
        return userStore.get(username);
    }
    public void removeUser(String username){
        userStore.remove(username);
    }
    public boolean searchUser(String username){
        return userStore.containsKey(username);
    }
    public void modifyUser(String username, UserDetails user){
        userStore.put(username, user);
        //SEE IF THIS IMLEMENTATION IS ENOUGH
    }
    

    
}
