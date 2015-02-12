package com.example.hangman;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends ActionBarActivity {
	MediaPlayer splashSound;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		splashSound = MediaPlayer.create(this, R.raw.no_mery);
		
		Thread splashScreen = new Thread(){
			public void run(){
				try{
					sleep(900);
					splashSound.start();
					sleep(4000);
					Intent gameIntent = new Intent("android.intent.action.THEGAME");
					startActivity(gameIntent);
				}
				catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				finally{
					
				}			
			}
		};
		splashScreen.start();

	}
}