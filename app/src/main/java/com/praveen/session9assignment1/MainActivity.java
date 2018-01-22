package com.praveen.session9assignment1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView colorChangeText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colorChangeText =findViewById(R.id.colorChangeText);
    }



    // Creating a menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Create Options Menu From Menu XML file.
        getMenuInflater().inflate(R.menu.color_text_menu,menu);
        return true;
    }


    // Method to set the text on click of the menu item
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onOptionsItemSelected(item);

        switch (item.getTitle().toString()) {
            case "Red":
                colorChangeText.setTextColor(getResources().getColor(R.color.Red));
                break;
            case "Green":
                colorChangeText.setTextColor(getResources().getColor(R.color.Green));
                break;
            case "Blue":
                colorChangeText.setTextColor(getResources().getColor(R.color.Blue));
                break;
            default:
                break;
        }
        return true;
    }
}
