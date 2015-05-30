package net.iqproject.quikemonportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Set Buttons listening properties
        setToastButtonAction((Button)findViewById(R.id.button_streamer),
                "This button will launch my Spotify Streamer!");

        setToastButtonAction((Button)findViewById(R.id.button_scores),
                "This button will launch my Scores App!" );

        setToastButtonAction((Button)findViewById(R.id.button_library),
                "This button will launch my Library App!");

        setToastButtonAction((Button)findViewById(R.id.button_build),
                "This button will launch my Build It Bigger App!");

        setToastButtonAction((Button)findViewById(R.id.button_xyz),
                "This button will launch my XYZ Reader App!");

        setToastButtonAction((Button)findViewById(R.id.button_own_app),
                "This button will launch My Own App!");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void setToastButtonAction(Button buttonItem,final String message){
        buttonItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendMessage(message);
            }
        });
    }

    public void sendMessage(String message){
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context,message,duration);
        toast.show();
    }

}
