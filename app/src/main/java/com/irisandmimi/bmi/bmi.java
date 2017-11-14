package com.irisandmimi.bmi;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class bmi extends AppCompatActivity {
    String s = new String("abc");
    View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            new AlertDialog.Builder(bmi.this)
                    .setTitle(R.string.Help)
                    .setMessage(R.string.Info)
                    .setPositiveButton(R.string.OK,null)
                    .show();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);
        Button bHelp = (Button)findViewById(R.id.b_help);
        bHelp.setOnClickListener(listener);
    }
    public void bmi(View view){
//        System.out.println("What???");
        Log.d("MainActivity","testing bmi method");
        EditText edWeight = (EditText) findViewById(R.id.ed_weight);
        EditText edHeight = (EditText) findViewById(R.id.ed_height);
        float weight = Float.parseFloat(edWeight.getText().toString());
        float height = Float.parseFloat(edHeight.getText().toString());
        float bmi = weight / (height * height);
        if (bmi<20 && height<3){
            new AlertDialog.Builder(this)
                    .setMessage(getString(R.string.UrBmi_is)+ bmi+getString(R.string.Dot)+" 請多吃點")
                    .setTitle(R.string.Result_Title)
                    .setPositiveButton(R.string.OK,null)
                    .show();
        }
//        if (height>3){
//            new AlertDialog.Builder(this)
//                    .setMessage("身高單位應為公尺")
//                    .setTitle(R.string.Result_Title)
//                    .setPositiveButton(R.string.OK,null)
//                    .show();
        }

      /*  Log.d("MainActivity",getString(R.string.UrBmi_is)+ bmi);
        Toast.makeText(this,"Your bmi is "+ bmi, Toast.LENGTH_LONG).show();*/
    }
}
