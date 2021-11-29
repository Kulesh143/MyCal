package com.example.mycal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnplus,btnminus,btnmultiply,btndivide,btnclear,btnequals;
private TextView btnresult;
Integer firstInput=0,secondInput=0;
boolean isAdd,isSubstract,ismultiply,isdivide;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn0=findViewById(R.id.btn_0);
        btn1=findViewById(R.id.btn_1);
        btn2=findViewById(R.id.btn_2);
        btn3=findViewById(R.id.btn_3);
        btn4=findViewById(R.id.btn_4);
        btn5=findViewById(R.id.btn_5);
        btn6=findViewById(R.id.btn_6);
        btn7=findViewById(R.id.btn_7);
        btn8=findViewById(R.id.btn_8);
        btn9=findViewById(R.id.btn_9);
        btnplus=findViewById(R.id.btn_plus);
        btnminus=findViewById(R.id.btn_minus);
        btnmultiply=findViewById(R.id.btn_multiply);
        btndivide=findViewById(R.id.btn_division);
        btnclear=findViewById(R.id.btn_clear);
        btnequals=findViewById(R.id.btn_equal);
        btnresult=findViewById(R.id.txt_result);
btnplus.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        if(btnresult.getText().toString().length()!=0){
            firstInput=Integer.valueOf(btnresult.getText().toString());
            isAdd=true;
            btnresult.setText(null);
        }
    }
});
btnminus.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        if(btnresult.getText().toString().length()!=0){
            firstInput=Integer.valueOf(btnresult.getText().toString());
            isSubstract=true;
            btnresult.setText(null);
        }
    }
});
btnmultiply.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        if(btnresult.getText().toString().length()!=0){
            firstInput=Integer.valueOf(btnresult.getText().toString());
            ismultiply=true;
            btnresult.setText(null);
        }
    }
});
btndivide.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        if(btnresult.getText().toString().length()!=0){
            firstInput=Integer.valueOf(btnresult.getText().toString());
            isdivide=true;
            btnresult.setText(null);
        }
    }
});
btnclear.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        firstInput=0;
        secondInput=0;
        btnresult.setText("");
    }
});
btnequals.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        if(isAdd||isSubstract||ismultiply||isdivide){
            secondInput=Integer.valueOf(btnresult.getText().toString());
                    }
        if(isAdd){
            btnresult.setText(firstInput+secondInput+"");
            isAdd=false;
        }
        if(isSubstract){
            btnresult.setText(firstInput-secondInput+"");
            isSubstract=false;
        }
        if(ismultiply){
            btnresult.setText(firstInput*secondInput+"");
            ismultiply=false;
        }
        if(isdivide){
            double resultvalue=firstInput/secondInput;
            btnresult.setText(String.format("%.2f",resultvalue));
            isdivide=false;
        }
    }
});
    }

    public void numberOperations(View view) {
        Button button= (Button) view;
        btnresult.setText(btnresult.getText().toString()+button.getText().toString());
    }
}