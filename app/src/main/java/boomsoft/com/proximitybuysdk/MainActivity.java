package boomsoft.com.proximitybuysdk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import boomsoft.com.proximitybuy.ProximityBuy;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ProximityBuy proximityBuy = new ProximityBuy();
        proximityBuy.init(this);

    }
}
