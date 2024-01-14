package ali.qamar.qamar1firstproject.data.UsersTable;

import androidx.room.Dao;
import androidx.room.Query;

import java.util.List;
@Dao
public interface MyuserQuery
{
    List<MyUser>GetAll();
    List<MyUser>lodadAllByIds(int[]userIds);
    MyUser checkEmailpassw(String myEmail,String mypassw);
    MyUser checkEmailpassw(String myEmail);
    void insertAll(MyUser users);
    void delete(int id);
    void update(MyUser values);



    @Query("SELECT * FROM MyUser")
    List<MyUser> getAll();
    @Query("SELECT * FROM MyUser WHERE keyid IN (:userIds)")
    List<MyUser> loadAllByIds(int[] userIds);
    @Query("SELECT * FROM MyUser WHERE email = :myEmail AND passw = :myPassw LIMIT 1")
    MyUser checkEmailPassw(String myEmail , String myPassw);
    @Query("SELECT * FROM MyUser WHERE email = :myEmail LIMIT 1")
    MyUser checkEmail (String myEmail);
    void insertAll (MyUser... users);
    void delete (MyUser user);
    void insert (MyUser myUser);
    void update (MyUser...values);
}