package com.cyw.a2018012401;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void click1(View v)
    {
        File f = Environment.getExternalStorageDirectory();

        File nf = new File(f, "DCIM" + File.separator + "myfile.txt");
        Log.d("FILE", nf.getAbsolutePath());
        if (nf.exists())
        {
            Log.d("FILE", "nf 存在");
        }
        else
        {
            Log.d("FILE", "nf 不存在");
        }

        try {
            FileReader fr = new FileReader(nf);
            BufferedReader br = new BufferedReader(fr);
            String str = br.readLine();
            Log.d("FILE", "Read:" + str);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void click2(View v)
    {
        File f = getExternalFilesDir("data");
        Log.d("FILE", f.getAbsolutePath());
    }
}
