package com.example.cannongame;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity
{
   // called when the app first launches
   @Override
   public void onCreate(Bundle savedInstanceState)
   {
      super.onCreate(savedInstanceState); // call super's onCreate method
      setContentView(R.layout.activity_main); // inflate the layout
   } 
} // end class MainActivity
