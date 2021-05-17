package sg.edu.rp.c346.id20014009.democheckboxexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    CheckBox cbEnabled;
    Button btnCheck;
    TextView tvShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        cbEnabled=findViewById(R.id.discountCheckBox);
        btnCheck=findViewById(R.id.checkButton);
        tvShow=findViewById(R.id.textView);


        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(cbEnabled.isChecked()){
                    tvShow.setText("Discount is given.");
                }
                else{
                    tvShow.setText("Discount is not given.");
                }

            }
        });

        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Log.d("MainActivity","Checkbox checked: "+cbEnabled.isChecked());
                Toast.makeText(MainActivity.this,"Button Clicked",Toast.LENGTH_LONG.show());
                if(cbEnabled.isChecked()){
                    double pay=calcPay(100,20);
                    tvShow.setText("Discount is given.");
                }
                else{
                    double pay=calcPay(100,0);
                    tvShow.setText("Discount is not given.");
                }



            }
        });

        private double calcPay(double price,double discount){
            double pay=price*(1-discount/100);
            return pay;
        }






    }
}