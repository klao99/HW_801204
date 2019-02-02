package th.ac.su.ict.chutikarn.homework2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView tvcolor;
    private Button btnone;
    private Button btntwo;
    private Button btntree;
    private Button btnfour;
    private Button btnfive;
    private Button btnsix;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvcolor = (TextView) findViewById(R.id.tvcolor);
        btnone = (Button) findViewById(R.id.btnone);
        btntwo = (Button) findViewById(R.id.btntwo);
        btntree = (Button) findViewById(R.id.btntree);
        btnfour = (Button) findViewById(R.id.btnfour);
        btnfive = (Button) findViewById(R.id.btnfive);
        btnsix = (Button) findViewById(R.id.btnsix);

        btnone.setOnClickListener(this);
        btntwo.setOnClickListener(this);
        btntree.setOnClickListener(this);
        btnfour.setOnClickListener(this);
        btnfive.setOnClickListener(this);
        btnsix.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnone:
                tvcolor.setBackgroundColor(0xFFE9E1DE);
                tvcolor.setText("233 225 222");
                break;

            case R.id.btntwo:
                tvcolor.setBackgroundColor(0xFFE7CCCB);
                tvcolor.setText("231 204 203");
                break;

            case R.id.btntree:
                tvcolor.setBackgroundColor(0xFF77839A);
                tvcolor.setText("119 131 154");
                break;

            case R.id.btnfour:
                tvcolor.setBackgroundColor(0xFF9CA9BD);
                tvcolor.setText("156 169 189");
                break;

            case R.id.btnfive:
                tvcolor.setBackgroundColor(0xFFC4CCD4);
                tvcolor.setText("196 204 212");
                break;

            case R.id.btnsix:
                tvcolor.setBackgroundColor(0xFFDEE2E5);
                tvcolor.setText("222 226 229");
                break;


        }


        }
    }





