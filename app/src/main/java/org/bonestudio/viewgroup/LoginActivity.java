package org.bonestudio.viewgroup;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class LoginActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


    }

    public void openRegistrationActivity(View view)
    {
        Intent intent = new Intent(this, RegistrationActivity.class);
        startActivity(intent);
    }
}
