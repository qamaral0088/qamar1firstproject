package ali.qamar.qamar1firstproject.data.Mytaskstable;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class MyTask {
    @PrimaryKey(autoGenerate = true)
    public  long    kyied;
    public  int     importance;
    public  String  shortTitle;
    public  String  Text;
    public  boolean isCompleted;
    public  long    subjld;
    public  long    userld;

}
