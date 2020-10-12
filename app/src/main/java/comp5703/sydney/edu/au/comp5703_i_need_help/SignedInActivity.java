package comp5703.sydney.edu.au.comp5703_i_need_help;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SignedInActivity extends AppCompatActivity {
    private Button mBtnCtu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        mBtnCtu = findViewById(R.id.btn_ctu);

        mBtnCtu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SignedInActivity.this,"Registration success",Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }

}