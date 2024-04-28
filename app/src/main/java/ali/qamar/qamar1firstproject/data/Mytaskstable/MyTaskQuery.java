package ali.qamar.qamar1firstproject.data.Mytaskstable;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import ali.qamar.qamar1firstproject.R;


@Dao
public interface MyTaskQuery {
    @Query( " SELECT*FROM MyTask ORDER BY   time importance DESC")
     List<MyTask> getAlltasks();


    @Query( " SELECT*FROM MyTask ORDER BY   time importance DESC")
    List<MyTask>getAlltaskOrederBy(long userld_p);


    @Query(  "SELECT*FROM MyTask WHERE userld:userld_p AND isCompleted=:isCompleted_p+"ORDER BYimportanceDESC")
            List<MyTask> getAlltaskOrderBy( long userld_p,boolean isCompleted_p);
@Insert
    void  insertTask(MyTask...t);

@Update
      Void updateTask(MyTask...tasks);

@Query("DELETE FROM MyTask WHERE kyied=:kid")
     void  deleteTask(long kid);

 @Query("DELETE FROM MyTask WHERE subjld=:kid"+"ORDER BY importance DESC" )
    List<MyTask>getTasksBySubjld(long key_id);

}

