package chong.wecanteen.com.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public Button btn1;
    public Button btn2;
    public Button btn3;
    public Button btn4;
    public Button btn5;
    public Button btn6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        setOnClickListenerAllButton();

    }

    public void init() {
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
    }

    public void setOnClickListenerAllButton() {
        btn1.setOnClickListener(MainActivity.this);
        btn2.setOnClickListener(MainActivity.this);
        btn3.setOnClickListener(MainActivity.this);
        btn4.setOnClickListener(MainActivity.this);
        btn5.setOnClickListener(MainActivity.this);
        btn6.setOnClickListener(MainActivity.this);
    }

    public void showToast(String msg) {
        Toast.makeText(MainActivity.this, "This button will launch my "
                + msg + " app!", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn1:
                showToast(btn1.getText().toString());
                break;
            case R.id.btn2:
                showToast(btn2.getText().toString());
                break;
            case R.id.btn3:
                showToast(btn3.getText().toString());
                break;
            case R.id.btn4:
                showToast(btn4.getText().toString());
                break;
            case R.id.btn5:
                showToast(btn5.getText().toString());
                break;
            case R.id.btn6:
                showToast(btn6.getText().toString());
                break;
        }
    }
}
