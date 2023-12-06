package ali.qamar.qamar1firstproject.data.UsersTable;

import androidx.room.Query;

import java.util.List;

public interface MyUsersQuery
{
    @Query("SElECT*FROM MyUser")
    List<MyUser> getAll();
    @Query("SElECT*FROM MyUser WEHERE keyid IN" (:userIds)")
    List<MyUser> loadALLByIds(int[]userIds);
    @Query("SElECT*FROM MyUser WEHERE")
    @Query("SElECT*FROM MyUser")
}
