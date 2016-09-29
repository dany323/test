package com.mycompany.myapp4;

import android.app.*;
import android.content.*;
import android.graphics.*;
import android.os.*;
import android.util.*;
import android.widget.*;
import com.bumptech.glide.*;
import java.io.*;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.b);
		
		ImageView iv = (ImageView) findViewById(R.id.thumbnail);
		//Glide.with(getApplicationContext())
			//.load("http://inthecheesefactory.com/uploads/source/glidepicasso/cover.jpg")
			//.into(iv);
		
		Glide.with(getApplicationContext())
			.load("https://cafebazaar.ir/media/upload/icons/com.abzarkarbordi1380.png")
		.asBitmap() 
		.placeholder(R.drawable.image_3)
		.into(iv);
			
    }
}
