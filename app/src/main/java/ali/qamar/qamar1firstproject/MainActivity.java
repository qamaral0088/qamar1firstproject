package ali.qamar.qamar1firstproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
private TextView tv_outout;
private Button btn_Go;
private EditText et_input;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);
        tv_outout=findViewById(R.id.tvOutput);
        et_input=findViewById(R.id.etlnput);
        btn_Go =findViewById(R.id. btnGo);

    }


        public void onClickGo (View  v) {
            String st = et_input.getText().toString();
            tv_outout.setText(st);
        }
    

        }
