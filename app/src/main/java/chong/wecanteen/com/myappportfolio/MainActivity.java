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
        btn1 = (Button) findViewById(R.id.app_main_btn_1);
        btn2 = (Button) findViewById(R.id.app_main_btn_2);
        btn3 = (Button) findViewById(R.id.app_main_btn_3);
        btn4 = (Button) findViewById(R.id.app_main_btn_4);
        btn5 = (Button) findViewById(R.id.app_main_btn_5);
        btn6 = (Button) findViewById(R.id.app_main_btn_6);
    }

    public void setOnClickListenerAllButton() {
        btn1.setOnClickListener(MainActivity.this);
        btn2.setOnClickListener(MainActivity.this);
        btn3.setOnClickListener(MainActivity.this);
        btn4.setOnClickListener(MainActivity.this);
        btn5.setOnClickListener(MainActivity.this);
        btn6.setOnClickListener(MainActivity.this);
    }

    public void showToastMessage(int resId) {
        Toast.makeText(MainActivity.this, resId, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.app_main_btn_1:
                showToastMessage(R.string.popular_movies);
                break;
            case R.id.app_main_btn_2:
                showToastMessage(R.string.stock_hawk);
                break;
            case R.id.app_main_btn_3:
                showToastMessage(R.string.build_it_bigger);
                break;
            case R.id.app_main_btn_4:
                showToastMessage(R.string.make_your_app_material);
                break;
            case R.id.app_main_btn_5:
                showToastMessage(R.string.go_ubiquitous);
                break;
            case R.id.app_main_btn_6:
                showToastMessage(R.string.capstone);
                break;
        }
    }
}
