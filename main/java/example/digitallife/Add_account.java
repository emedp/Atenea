package example.digitallife;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Add_account extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_account);
    }

    public void close_activity(View view) {
        finish();
    }
}
