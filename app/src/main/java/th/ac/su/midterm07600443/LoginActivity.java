package th.ac.su.midterm07600443;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import th.ac.su.midterm07600443.model.Auth;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button logbutton = findViewById(R.id.login_button);
        logbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText userEdit = findViewById(R.id.username_Text);
                EditText passEdit = findViewById(R.id.password_Text2);

                String loginFailText = getString(R.string.login_fail);

                String inuser = userEdit.getText().toString();
                String inpass = passEdit.getText().toString();

                Auth auth = new Auth(inuser, inpass);

                boolean result = auth.check();

                if(result){
                    Toast.makeText(LoginActivity.this,"Welcome Promlert Lovichit",Toast.LENGTH_SHORT
                    ).show();

                }else{
                    /*Toast t = Toast.makeText(LoginActivity.this, loginFailText, Toast.LENGTH_SHORT);
                    t.show();*/
                    AlertDialog.Builder dialog = new AlertDialog.Builder(LoginActivity.this);
                    dialog.setTitle("Invalid username or password");
                    dialog.setMessage(R.string.login_fail);
                    dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            finish();
                        }
                    });dialog.show();

                }
            }
        });
    }
}
