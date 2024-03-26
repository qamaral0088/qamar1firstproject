package ali.qamar.qamar1firstproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity {
    private TextView tv_Output;
    private Button btn_Go;
    private EditText et_Input;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
                        tv_Output= findViewById(R.id.tvOutput);
                        et_Input=findViewById(R.id.etlnput);
                                btn_Go=findViewById(R.id.btnGo);
    }

public  void onClickGo2(View v)
{
        String st=et_Input.getText().toString();
    tv_Output.setText(st);
}
}