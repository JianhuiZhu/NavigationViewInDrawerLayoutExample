# NavigationViewInDrawerLayoutExample
This is an super example of navigation view in drawer layout android.   
Whole project file has been uploaded.     
Have fun

![alt tag](https://github.com/JianhuiZhu/NavigationViewInDrawerLayoutExample/blob/master/example.gif)   
#Library    
     compile 'com.android.support:design:23.0.1'
     compile 'com.jakewharton:butterknife:7.0.1'

#XML layout file

###Activity main  
        <?xml version="1.0" encoding="utf-8"?>
        <android.support.v4.widget.DrawerLayout xmlns:android="http://schemas.android.com/apk/res/android"
              xmlns:app="http://schemas.android.com/apk/res-auto"
              xmlns:tools="http://schemas.android.com/tools"
              android:id="@+id/drawer_layout"
              style="@style/Theme.AppCompat.Light.NoActionBar"
              android:layout_width="match_parent"
              android:layout_height="match_parent"
              android:fitsSystemWindows="true"
              tools:context=".MainActivity">

          <LinearLayout
              android:layout_width="match_parent"
              android:layout_height="match_parent"
              android:background="@android:color/background_dark"
              android:orientation="vertical">
      
              <TextView
                  android:id="@+id/text_header"
                  android:layout_width="match_parent"
                  android:layout_height="wrap_content"
                  android:layout_marginBottom="10dp"
                  android:layout_marginLeft="20dp"
                  android:layout_marginTop="10dp"
                  android:background="@android:color/background_dark"
                  android:text="Squirrel 1"
                  android:textColor="@android:color/white"
                  android:textSize="30sp" />
      
              <ImageView
                  android:id="@+id/image_view"
                  android:layout_width="match_parent"
                  android:layout_height="match_parent"
                  android:background="@android:color/background_dark"
                  android:scaleType="centerCrop"
                  android:src="@drawable/squirrel1" />
          </LinearLayout>
      
          <android.support.design.widget.NavigationView
              android:id="@+id/navigation_view"
              android:layout_width="match_parent"
              android:layout_height="match_parent"
              android:layout_gravity="start"
              android:layout_marginBottom="5dp"
              android:layout_marginLeft="20dp"
              android:layout_marginTop="5dp"
              app:headerLayout="@layout/navigation_header"
              app:menu="@menu/drawer" />
      </android.support.v4.widget.DrawerLayout>   

    
###drawer Header   
    <?xml version="1.0" encoding="utf-8"?>
    <RelativeLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:background="@android:color/background_dark"
        xmlns:android="http://schemas.android.com/apk/res/android">
    <TextView
        android:text="Drawer"
        android:layout_marginLeft="10dp"
        android:background="@android:color/background_dark"
        android:textColor="@android:color/white"
        android:layout_marginTop="30dp"
        android:textSize="30sp"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        xmlns:android="http://schemas.android.com/apk/res/android" />
    </RelativeLayout>
