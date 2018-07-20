package com.example.swapnil.numberchecker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    class Number{
        int num;
        public boolean isSquare(){
            double squareRoot=Math.sqrt(num);
            if (squareRoot==Math.floor(squareRoot)){
                return true;
            }else{
                return false;
            }



        }
        public boolean isTriangular(){
            int count=1;
            int triangularNumber=1;
            while (triangularNumber<num){
                count++;
                triangularNumber+=count;

            }
            if (triangularNumber==num){
                return true;
            }else {
                return false;
            }


        }


    }

    public void Check(View view){

        EditText editText=(EditText) findViewById(R.id.editText);
        if (editText.getText().toString().isEmpty()){
            Toast.makeText(this, "Please Enter Some Value", Toast.LENGTH_SHORT).show();
        }else {
            Number obj = new Number();
            int value = Integer.parseInt(editText.getText().toString());
            obj.num = value;
            String message = editText.getText().toString();
            if (obj.isSquare() && obj.isTriangular()) {
                message += " is both triangular and square";
            } else if (obj.isTriangular()) {
                message += " is triangular";
            } else if (obj.isSquare()) {
                message += " is square";
            } else {
                message += " is neither square nor triangular";
            }

            Toast.makeText(this, message, Toast.LENGTH_LONG).show();

        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
