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

public class a extends Activity {
    ListView listView;

    protected void onCreate(Bundle bundle) {
        if (VERSION.SDK_INT >= 21) {
            setTheme(R.style.a);
        }
        super.onCreate(bundle);
        setContentView(R.layout.a);
getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        this.listView = (ListView) findViewById(R.id.a);
        this.listView.setAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, new String[]{"About C Language", "Syntax", "Data Type", "Variable", "Operators", "Decision Making", "Loop", "Function", "Scope Rules", "Array", "Print Hello Word", "Pointer", "String", "Structure", "File I/O", "Preprocessor", "C Programming Examples"}));
        this.listView.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView adapterView, View view, int i, long j) {
                String str = (String) a.this.listView.getItemAtPosition(i);
                if (i == 0) {
                    a.this.startActivity(new Intent(a.this.getBaseContext(), a0.class));
                } else if (i == 1) {
                    a.this.startActivity(new Intent(a.this, a1.class));
                } else if (i == 2) {
                    a.this.startActivity(new Intent(a.this, a2.class));
                } else if (i == 3) {
                    a.this.startActivity(new Intent(a.this, a3.class));
                } else if (i == 4) {
                    a.this.startActivity(new Intent(a.this, a4.class));
                } else if (i == 5) {
                    a.this.startActivity(new Intent(a.this, a5.class));
                } else if (i == 6) {
                    a.this.startActivity(new Intent(a.this, a6.class));
                } else if (i == 7) {
                    a.this.startActivity(new Intent(a.this, a7.class));
                } else if (i == 8) {
                    a.this.startActivity(new Intent(a.this, a8.class));
                } else if (i == 9) {
                    a.this.startActivity(new Intent(a.this, a9.class));
                } else if (i == 10) {
                    a.this.startActivity(new Intent(a.this, a10.class));
                } else if (i == 11) {
                    a.this.startActivity(new Intent(a.this, a11.class));
                } else if (i == 12) {
                    a.this.startActivity(new Intent(a.this, a12.class));
                } else if (i == 13) {
                    a.this.startActivity(new Intent(a.this, a13.class));
                } else if (i == 14) {
                    a.this.startActivity(new Intent(a.this, a14.class));
                } else if (i == 15) {
                    a.this.startActivity(new Intent(a.this, a15.class));
                } else if (i == 16) {
                    a.this.startActivity(new Intent(a.this, b.class));
                }
            }
        });
    }
}

