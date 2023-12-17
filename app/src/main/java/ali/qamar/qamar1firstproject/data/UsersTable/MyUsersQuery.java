package ali.qamar.qamar1firstproject.data.UsersTable;

import androidx.room.Dao;
import androidx.room.Entity;
import androidx.room.Query;

import java.util.List;
@Dao
@Entity

public interface MyUsersQuery
{
  @Query("SELECT * FROM MyUser")
}
