package com.example.md1l1homework.homeWork4;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.md1l1homework.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.snackbar.Snackbar;

import static com.example.md1l1homework.homeWork2.helpers.Common.getCustomSnackbar;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
    private Toolbar toolbar;
    private Button horizontalBarBtn, roundBarBtn;
    private ProgressBar horizontalBar, roundBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hw4_activity_main);
        initViews();
        setSupportActionBar(toolbar);
        fabBtn();

        //ToDo Когда раскоменчиваю эти две строки ниже (или любую из них) все падает с ошибкой:
//        Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'void android.view.View.setOnClickListener(android.view.View$OnClickListener)' on a null object reference
        // Не пойму почему

//        getVisibleProgressBar(horizontalBarBtn, horizontalBar);
//        getVisibleProgressBar(roundBarBtn, roundBar);
        setDrawlerLayout();

    }


    private void initViews() {
        toolbar = findViewById(R.id.toolbar);
        horizontalBarBtn = findViewById(R.id.progress_bar_horizontal_btn);
        roundBarBtn = findViewById(R.id.progress_bar_round_btn);
        horizontalBar = findViewById(R.id.horizontal_progress_bar);
        roundBar = findViewById(R.id.round_progress_bar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.hw4_main, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }

    private void fabBtn() {
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Hi to all! This is my MD HOME_WORK!!!", Snackbar.LENGTH_INDEFINITE)
                        .setAction("Hide", closeSnackBarOnClickListner()).show();
            }
        });
    }

    private View.OnClickListener closeSnackBarOnClickListner() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getCustomSnackbar(v, "Im closing");
            }
        };
    }

    private void setDrawlerLayout() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home,
                R.id.nav_progress_bars,
                R.id.nav_tools)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
    }

    private void getVisibleProgressBar(Button button, final ProgressBar progressBar) {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setVisibleHorizontalBar(progressBar);
            }
        });
    }

    private void setVisibleHorizontalBar(ProgressBar progressBar) {
        progressBar.setVisibility(progressBar.getVisibility() == View.VISIBLE ? View.GONE : View.VISIBLE);
    }

    private void setVisibleRoundBar(View view) {
        roundBar.setVisibility(roundBar.getVisibility() == View.VISIBLE ? View.GONE : View.VISIBLE);
    }
}
