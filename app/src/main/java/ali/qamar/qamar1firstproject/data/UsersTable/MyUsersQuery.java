package ali.qamar.qamar1firstproject.data.UsersTable;

import androidx.room.Dao;
import androidx.room.Query;

import java.util.List;
@Dao
public interface MyUsersQuery
{
    @Query (" SElECT* FROM MyUser")
    List<MyUser> getAll();
    @Query ("SElECT*FROM  MyUser  WHERE keyid IN (:userIds)")
    List<MyUser> loadALLByIds(int[]userIds);
    @Query ("SElECT WHERE email*FROM MyUser =  :myEmail AND passw=:myPassw LIMIT 1")
    MyUser checkEmailpassw(String myEmail,String myPassw);

}
