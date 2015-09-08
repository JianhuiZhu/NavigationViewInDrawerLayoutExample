package com.tofohack.jianhui_zhu.navigationviewexample;

import android.media.Image;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @Bind(R.id.drawer_layout)
    DrawerLayout drawerLayout;
    @Bind(R.id.navigation_view)
    NavigationView navigationView;
    @Bind(R.id.image_view)
    ImageView imageView;
    @Bind(R.id.text_header)
    TextView textHeader;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        /**
         * Listener for drawer items on click event
         */
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                switch(menuItem.getItemId()){
                    case R.id.navigation_item_1:
                        /**
                         * Change the background and header
                         * the rest are the same
                         */
                        imageView.setImageResource(R.drawable.squirrel1);
                        textHeader.setText("Squirrel 1");
                        break;
                    case R.id.navigation_item_2:
                        imageView.setImageResource(R.drawable.squirrel2);
                        textHeader.setText("Squirrel 2");
                        break;
                    case R.id.navigation_item_3:
                        imageView.setImageResource(R.drawable.squirrel3);
                        textHeader.setText("Squirrel 3");
                        break;
                }
                /**
                 * Close the drawer
                 */
                drawerLayout.closeDrawers();
                return true;
            }
        });
    }

}
