package com.android.DROID_MJ.cprogrammingtutorial;

import android.app.Activity;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.view.WindowManager;
import android.widget.ListView;

public class b extends Activity {
    ListView listView;

    protected void onCreate(Bundle bundle) {
        if (VERSION.SDK_INT >= 21) {
            setTheme(R.style.a);
        }
        super.onCreate(bundle);
        setContentView(R.layout.a);
getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        this.listView = (ListView) findViewById(R.id.a);
        this.listView.setAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, new String[]{"C Program to Print an Integer (Entered by the User)", "C Program to Add Two Integers", "Program to Print ASCII Value", "Program to Find the Size of a variable", "Program to Check Vowel or consonant", "Program to Compute Quotient and Remainder", "Program to Check Leap Year", "Reverse an Integer", "Fibonacci Series up to n number of terms", "Check if a Number is Positive or Negative Using if...else", "Factorial of a Number", "Program to Check Palindrome", "Program to Check Prime Number", "Check Armstrong Number of three digits", "Program to print half pyramid", "Simple Calculator using switch Statement", "Program to Add Two Matrices", "Program to Multiply Two Matrices", "Copy String Manually Without Using strcpy()", "Calculate Length of String without Using strlen() Function", "Concatenate Two Strings Without Using strcat()", "Demonstrate the Dynamic Memory Allocation for Structure"}));
        this.listView.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView adapterView, View view, int i, long j) {
                String str = (String) b.this.listView.getItemAtPosition(i);
                if (i == 0) {
                    b.this.startActivity(new Intent(b.this.getBaseContext(), b0.class));
                } else if (i == 1) {
                    b.this.startActivity(new Intent(b.this, b1.class));
                } else if (i == 2) {
                    b.this.startActivity(new Intent(b.this, b2.class));
                } else if (i == 3) {
                    b.this.startActivity(new Intent(b.this, b3.class));
                } else if (i == 4) {
                    b.this.startActivity(new Intent(b.this, b4.class));
                } else if (i == 5) {
                    b.this.startActivity(new Intent(b.this, b5.class));
                } else if (i == 6) {
                    b.this.startActivity(new Intent(b.this, b6.class));
                } else if (i == 7) {
                    b.this.startActivity(new Intent(b.this, b7.class));
                } else if (i == 8) {
                    b.this.startActivity(new Intent(b.this, b8.class));
                } else if (i == 9) {
                    b.this.startActivity(new Intent(b.this, b9.class));
                } else if (i == 10) {
                    b.this.startActivity(new Intent(b.this, b10.class));
                } else if (i == 11) {
                    b.this.startActivity(new Intent(b.this, b11.class));
                } else if (i == 12) {
                    b.this.startActivity(new Intent(b.this, b12.class));
                } else if (i == 13) {
                    b.this.startActivity(new Intent(b.this, b13.class));
                } else if (i == 14) {
                    b.this.startActivity(new Intent(b.this, b14.class));
                } else if (i == 15) {
                    b.this.startActivity(new Intent(b.this, b15.class));
                } else if (i == 16) {
                    b.this.startActivity(new Intent(b.this, b16.class));
                } else if (i == 17) {
                    b.this.startActivity(new Intent(b.this, b17.class));
                } else if (i == 18) {
                    b.this.startActivity(new Intent(b.this, b18.class));
                } else if (i == 19) {
                    b.this.startActivity(new Intent(b.this, b19.class));
                } else if (i == 20) {
                    b.this.startActivity(new Intent(b.this, b20.class));
                } else if (i == 21) {
                    b.this.startActivity(new Intent(b.this, b21.class));
                }
            }
        });
    }
}

