package com.example.calculatecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private EditText edt;
private Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnac,btndel,btndiv,btnsub,btnadd,btndot,btnmulti,btnequal;
    float value1,value2;
    Boolean sub,add,multi,div;
    private TextView txt;
@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt=findViewById(R.id.edt);
        txt=findViewById(R.id.txt);
        btn0=findViewById(R.id.btn0);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
        btnac=findViewById(R.id.btnac);
        btndiv=findViewById(R.id.btndiv);
        btnadd=findViewById(R.id.btnadd);
        btnsub=findViewById(R.id.btnsub);
        btnmulti=findViewById(R.id.btnmulti);
        btndot=findViewById(R.id.btndot);
        btndel=findViewById(R.id.btndet);
        btnequal=findViewById(R.id.btnequal);

        txt.setText(add.toString());
        txt.setText(sub.toString());
        txt.setText(multi.toString());
        txt.setText(div.toString());

    btn0.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            edt.setText(edt.getText()+ "0");
        }
    });
    btn1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            edt.setText(edt.getText()+ "1");
        }
    });
    btn2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            edt.setText(edt.getText()+"2");
        }
    });
    btn3.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            edt.setText(edt.getText()+"3");
        }
    });
    btn4.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            edt.setText(edt.getText()+"4");
        }
    });
    btn5.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            edt.setText(edt.getText()+"5");
        }
    });
    btn6.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            edt.setText(edt.getText()+"6");
        }
    });
    btn7.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            edt.setText(edt.getText()+"7");
        }
    });
    btn8.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            edt.setText(edt.getText()+"8");
        }
    });
    btn9.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            edt.setText(edt.getText()+"9");
        }
    });
    btndot.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            edt.setText(edt.getText()+".");
        }
    });
    btnadd.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(edt==null){
                edt.setText(" ");
            }else {
               value1=Float.parseFloat(edt.getText()+" ") ;
                add=true;
                edt.setText(null);
            }
        }
    });
    btnsub.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(edt==null){
                edt.setText(" ");
            }else {
                value1=Float.parseFloat(edt.getText()+" ") ;
                sub =true;
                edt.setText(null);
            }
        }
    });
    btnmulti.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(edt==null){
                edt.setText(" ");
            }else {
                value1=Float.parseFloat(edt.getText()+" ") ;
                multi=true;
                edt.setText(null);
            }
        }
    });
    btndiv.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(edt==null){
                edt.setText(" ");
            }else {
                value1=Float.parseFloat(edt.getText()+" ") ;
                div=true;
                edt.setText(null);
            }
        }
    });
    btnac.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            edt.setText(edt.getText()+" ");
            edt.clearFocus();
            finish();
        }
    });
    btndel.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            edt.setText(deleteChar(edt.getText().toString()));
        }
    });
    btnequal.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            value2=Float.parseFloat(edt.getText()+"");
            if (add==true){
                edt.setText(value1+value2 +" ");
                add=false;

            }
            if (sub==true){
                edt.setText(value1-value2 +" ");
                sub=false;

            }
            if (div==true){
                edt.setText(value1%value2 +" ");
                div=false;

            }
            if (multi==true){
                edt.setText(value1+value2 +" ");
                multi=false;

            }
        }
    });

    }

    private String deleteChar(String toString) {
      return toString.substring(0,toString.length()-1);
    }
}
