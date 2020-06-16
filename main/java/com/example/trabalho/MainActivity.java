package com.example.trabalho;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.nfc.FormatException;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    EditText num1;
    EditText num2;
    TextView result;
    Button btnSoma;
    Button btnDivisao;
    Button btnSubtracao;
    Button btnMultiplicacao;
    double n1, n2, nr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = (EditText)findViewById(R.id.txtNum1);
        num2 = (EditText)findViewById(R.id.txtNum2);
        result = (TextView)findViewById(R.id.txtResult);
        btnSoma = (Button)findViewById(R.id.btnCalc1);
        btnDivisao = (Button)findViewById(R.id.btnCalc2);
        btnSubtracao = (Button)findViewById(R.id.btnCalc3);
        btnMultiplicacao = (Button)findViewById(R.id.btnCalc4);
    }
    public void Soma(View view)
    {
        try {
            n1 = Double.parseDouble(num1.getText().toString());
            n2 = Double.parseDouble(num2.getText().toString());
            nr = n1 + n2;
        }
        catch(NumberFormatException e){
            Toast messageBox = Toast.makeText(this,"Inválido!", Toast.LENGTH_SHORT);
            messageBox.show();
        }
        result.setText(Double.toString(nr));
    }
    public void Subt(View view)
    {
        try {
            n1 = Double.parseDouble(num1.getText().toString());
            n2 = Double.parseDouble(num2.getText().toString());
            nr = n1 - n2;
        }
        catch(NumberFormatException e){
            Toast messageBox = Toast.makeText(this,"Inválido!", Toast.LENGTH_SHORT);
            messageBox.show();
        }
        result.setText(Double.toString(nr));
    }
    public void Mult(View view)
    {
        try {
            n1 = Double.parseDouble(num1.getText().toString());
            n2 = Double.parseDouble(num2.getText().toString());
            nr = n1 * n2;
        }
        catch(NumberFormatException e){
            Toast messageBox = Toast.makeText(this,"Inválido!", Toast.LENGTH_SHORT);
            messageBox.show();
        }
        result.setText(Double.toString(nr));
    }
    public void Divi(View view)
    {
        try {
            n1 = Double.parseDouble(num1.getText().toString());
            n2 = Double.parseDouble(num2.getText().toString());
            nr = n1 / n2;
        }
        catch(NumberFormatException e){
            Toast messageBox = Toast.makeText(this,"Inválido!", Toast.LENGTH_SHORT);
            messageBox.show();
        }
        if (n2 == 0){
            Toast messageBox = Toast.makeText(this,"Divisão por 0!", Toast.LENGTH_SHORT);
            messageBox.show();
        }
        else {
            result.setText(Double.toString(nr));
        }
    }
}