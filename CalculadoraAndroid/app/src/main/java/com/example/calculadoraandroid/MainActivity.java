package com.example.calculadoraandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText et1, et2;
    TextView tv_res;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = findViewById(R.id.et_n1);
        et2 = findViewById(R.id.et_n2);

        tv_res = findViewById(R.id.tv_res);
    }

    public void somar (View v) {
        double n1 = Double.parseDouble(et1.getText().toString());
        double n2 = Double.parseDouble(et2.getText().toString());

        String res = Double.toString(n1 + n2);

         tv_res.setText("O resultado é: " + res);
    }

    public void subtrair(View v) {
        double n1 = Double.parseDouble(et1.getText().toString());
        double n2 = Double.parseDouble(et2.getText().toString());

        String res = Double.toString(n1 - n2);

        tv_res.setText("O resultado é:" + res);

    }

    public void multiplicar(View v) {
        double n1 = Double.parseDouble(et1.getText().toString());
        double n2 = Double.parseDouble(et2.getText().toString());

        String res = Double.toString(n1 * n2);

        tv_res.setText("O resultado é: " + res);
    }

    public void dividir(View v) {
        double n1 = Double.parseDouble(et1.getText().toString());
        double n2 = Double.parseDouble(et2.getText().toString());

        String res = Double.toString(n1 / n2);

        tv_res.setText("O resultado é: " + res);

    }

    public void radiciacao(View v) {
        double n1 = Double.parseDouble(et1.getText().toString());
        double n2 = Double.parseDouble(et2.getText().toString());

        String res1 =  Double.toString(Math.sqrt(n1));

        String res2 = Double.toString(Math.sqrt(n2));

        tv_res.setText("O resultado da raiz do número 1 é:" + res1 +  "\n \n O resultado da raiz do número 2 é:" + res2);

    }

    public void limpar(View v) {
        tv_res.setText("");
        et1.setText("");
        et2.setText("");
    }


}