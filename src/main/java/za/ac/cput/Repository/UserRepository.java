/* IUserRepository.java
 Repository for the IUserRepository
 Author: Daniel Marais (219476845)
 Date: 30 March 2022
*

 */
package za.ac.cput.Repository;

import za.ac.cput.Entity.User;

import java.util.HashSet;
import java.util.Set;

public class UserRepository implements IUserRepository{
    private static  UserRepository repository=null;
    private Set<User> userDB=null;

    private UserRepository(){
        userDB= new HashSet<User>();
    }

    public static  UserRepository getRepository(){
        if (repository== null) {
            repository= new UserRepository();
        }
        return repository;
    }

    @Override
    public User create(User user) {
        boolean success= userDB.add(user);
        if(!success)
            return null;
        return user;
    }

    @Override
    public User read(String userId) {
        User user=userDB.stream()
                .filter(e ->e.getUserId().equals(userId))
                .findAny()
                .orElse(null);
        return user;
    }

    @Override
    public User update(User user) {
        User oldUser= read(user.getUserId());
        if(oldUser !=null){
            userDB.remove(oldUser);
            userDB.add(user);
            return user;
        }
        return null;
    }

    @Override
    public boolean delete(String userEmail) {
        User userToDelete= read(userEmail);
        if(userToDelete==null)
            return false;
        userDB.remove(userToDelete);
        return true;
    }

    @Override
    public Set<User> getAll() {
        return null;
    }


}
