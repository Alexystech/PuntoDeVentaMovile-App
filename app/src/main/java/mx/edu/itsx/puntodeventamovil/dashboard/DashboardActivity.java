package mx.edu.itsx.puntodeventamovil.dashboard;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import mx.edu.itsx.puntodeventamovil.R;
import mx.edu.itsx.puntodeventamovil.dashboard.fragments.FirstFragment;
import mx.edu.itsx.puntodeventamovil.dashboard.fragments.SecondFragment;
import mx.edu.itsx.puntodeventamovil.dashboard.fragments.ThirdFragment;

public class DashboardActivity extends AppCompatActivity {

    FirstFragment firstFragment = new FirstFragment();
    SecondFragment secondFragment = new SecondFragment();
    ThirdFragment thirdFragment = new ThirdFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        System.out.println("<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>");
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        loadFragment(new FirstFragment());

        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        Fragment fragment = null;
                        switch (item.getItemId()) {
                            case R.id.firstFragment:
                                fragment = new FirstFragment();
                                break;
                            case R.id.secondFragment:
                                fragment = new SecondFragment();
                                break;
                            case R.id.thirdFragment:
                                fragment = new ThirdFragment();
                                break;
                        }
                        if (fragment != null) {
                            loadFragment(fragment);
                            return true;
                        }
                        return false;
                    }
                }
        );
    }

    private void loadFragment(Fragment fragment) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frame_container, fragment)
                .addToBackStack(null)
                .commit();
    }
}