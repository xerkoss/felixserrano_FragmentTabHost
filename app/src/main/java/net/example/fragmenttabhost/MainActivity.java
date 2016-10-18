package net.example.fragmenttabhost;

import android.content.res.Resources;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends FragmentActivity {

    private FragmentTabHost tabHost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabHost=(FragmentTabHost)findViewById(android.R.id.tabhost);
        tabHost.setup(this,getSupportFragmentManager(),android.R.id.tabcontent);

        Resources res = getResources();

        TabHost.TabSpec tab1 = tabHost.newTabSpec("tab1");
        TabHost.TabSpec tab2 = tabHost.newTabSpec("tab2");
        TabHost.TabSpec tab3 = tabHost.newTabSpec("tab3");

        tab1.setIndicator(res.getString(R.string.eti_tab1),null);
        tab2.setIndicator(res.getString(R.string.eti_tab2),null);
        tab3.setIndicator(res.getString(R.string.eti_tab3),null);

        tabHost.addTab(tab1,FragmentPestanya1.class,null);
        tabHost.addTab(tab2,FragmentPestanya2.class,null);
        tabHost.addTab(tab3,FragmentPestanya3.class,null);
    }
}
