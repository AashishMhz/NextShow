package com.example.vehicle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView res;
    Button btnCreate;
    EditText make, year, color, price, engineSize;
    int i=1;
    Next next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCreate = findViewById(R.id.btnCreate);
        make = findViewById(R.id.make);
        year = findViewById(R.id.year);
        color = findViewById(R.id.color);
        price = findViewById(R.id.price);
        engineSize = findViewById(R.id.engineSize);
        res = findViewById(R.id.res);

        next = new Next();

        btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!validate()){
                    return;
                }
                next.setMake(make.getText().toString());
                next.setYear(Integer.parseInt(year.getText().toString()));
                next.setColor(color.getText().toString());
                next.setPrice(Float.parseFloat(price.getText().toString()));
                next.setEngineSize(Integer.parseInt(engineSize.getText().toString()));

                res.append("This is Vehicle No " + i
                        + "\n" + "Manufactured by " + next.getMake()
                        + "\n" + "color is "+ next.getColor()
                        + "\n" + "The price is "+ next.getPrice()
                        + "\n" +"The engine size is "+ next.getEngineSize());
            }
        });
    }
    private boolean validate() {
        if(TextUtils.isEmpty(make.getText().toString())){
            make.setError("Please enter manufacturer");
            make.requestFocus();
            return false;
        }
        if(TextUtils.isEmpty(year.getText().toString())){
            year.setError("Please enter Year");
            year.requestFocus();
            return false;
        }
        if(TextUtils.isEmpty(color.getText().toString())){
            color.setError("Please enter Color");
            color.requestFocus();
            return false;
        }
        if(TextUtils.isEmpty(price.getText().toString())){
            price.setError("Please enter Price");
            price.requestFocus();
            return false;
        }
        if(TextUtils.isEmpty(engineSize.getText().toString())){
            engineSize.setError("Please enter size");
            engineSize.requestFocus();
            return false;
        }
        return true;
    }
}
