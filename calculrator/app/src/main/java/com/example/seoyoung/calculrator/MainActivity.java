package com.example.seoyoung.calculrator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements Button.OnClickListener{
    private Button mConvertButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mConvertButton = (Button)findViewById(R.id.main_convert_button);
        mConvertButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.main_convert_button){
            numConvert();
        }
    }

    private void numConvert() {
        //TODO: 숫자 변환해주기
        Toast.makeText(this, "convert button click", Toast.LENGTH_LONG).show();
    }
}

