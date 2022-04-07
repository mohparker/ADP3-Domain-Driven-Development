/* IRepository.java
 Repository for the IRepository
 Author: Daniel Marais (219476845)
 Date: 30 March 2022
*

 */
package za.ac.cput.Repository;

public interface IRepository <T, ID>{
    T create(T t);
    T read(ID id);
    T update(T t);
    boolean delete(ID id);

}
