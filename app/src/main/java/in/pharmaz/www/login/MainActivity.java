package in.pharmaz.www.login;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;

public class MainActivity extends Activity {

    CardView mobile_cv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initializing components here
        mobile_cv = (CardView) findViewById(R.id.cv_mobile_number);
        mobile_cv.setPreventCornerOverlap(false);
    }
}
