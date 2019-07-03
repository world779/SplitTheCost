package com.example.splitthecost;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button)findViewById(R.id.btnCalc);
        btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                //オブジェクトを作成
                EditText etxtNum = (EditText)findViewById(R.id.eTxtNum);
                EditText etxtMoney = (EditText)findViewById(R.id.eTxtMoney);
                TextView txtResult = (TextView)findViewById(R.id.txtResult);

                //入力内容を表示
                String strNum = etxtNum.getText().toString();
                String strMoney = etxtMoney.getText().toString();

                //数値に変換
                int num = Integer.parseInt(strNum);
                int money = Integer.parseInt(strMoney);

                //割り勘計算
                int result = money/num;

                //結果表示用テキストに設定
                txtResult.setText(Integer.toString(result));
            }
        });
    }


}


