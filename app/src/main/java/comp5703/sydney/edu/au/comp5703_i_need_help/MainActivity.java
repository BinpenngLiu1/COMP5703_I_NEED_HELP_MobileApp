package comp5703.sydney.edu.au.comp5703_i_need_help;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button mBtnLogin;
    private Button mBtnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnLogin = findViewById(R.id.btn_login);
        mBtnRegister = findViewById(R.id.btn_Register);


        mBtnLogin.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainPageActivity.class);
                startActivity(intent);
            }
        });

        mBtnRegister.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SignedInActivity.class);
                startActivity(intent);
            }
        });
    }

}