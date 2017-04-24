package com.example.david.police_app;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class DisplayTeamsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.team_activity);


    }

    /** Called when the user taps the officers button**/
    public void showNewTeam(View view){
        //show officers
        Intent intent = new Intent(this, DisplayNewTeamActivity.class);
        startActivity(intent);
    }

}
