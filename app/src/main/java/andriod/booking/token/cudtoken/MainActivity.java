package andriod.booking.token.cudtoken;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Home Page");
        Button studentButton, staffButton;
        studentButton = (Button) findViewById(R.id.studentbutton);
        staffButton  = (Button) findViewById(R.id.staffbutton);
        final Context context = this;
        studentButton.setOnClickListener(new View.OnClickListener() {
                                             @Override
                                             public void onClick(View v) {
                                                 Intent intent = new Intent(context,  ServiceActivity.class);
                                                 startActivity(intent);
                                             }
                                         }
        );
    }
}
