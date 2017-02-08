package com.example.archerlei.yogatest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.facebook.soloader.SoLoader;
import com.facebook.yoga.YogaAlign;
import com.facebook.yoga.YogaEdge;
import com.facebook.yoga.YogaFlexDirection;
import com.facebook.yoga.YogaJustify;
import com.facebook.yoga.YogaNode;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout layout;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layout = (RelativeLayout) findViewById(R.id.yoga_content);

        initYoga();
    }

    private void initYoga() {

        SoLoader.init(MainActivity.this, false);

        YogaNode root = new YogaNode();
        root.setWidth(getWindowManager().getDefaultDisplay().getWidth() / 2);
        root.setHeight(getWindowManager().getDefaultDisplay().getWidth() / 2);
        root.setJustifyContent(YogaJustify.SPACE_BETWEEN);

        layout.getLayoutParams().width = getWindowManager().getDefaultDisplay().getWidth() / 2;
        layout.getLayoutParams().height = getWindowManager().getDefaultDisplay().getWidth() / 2;
        layout.requestLayout();

        YogaNode row1 = new YogaNode();
        row1.setJustifyContent(YogaJustify.SPACE_BETWEEN);
        row1.setFlexDirection(YogaFlexDirection.ROW);
        root.addChildAt(row1, 0);

        YogaNode image1 = new YogaNode();
        image1.setHeight(60 * getResources().getDisplayMetrics().density);
        image1.setWidth(60 * getResources().getDisplayMetrics().density);
        image1.setAlignSelf(YogaAlign.CENTER);
        root.addChildAt(image1, 1);

        YogaNode row2 = new YogaNode();
        row2.setJustifyContent(YogaJustify.SPACE_BETWEEN);
        row2.setFlexDirection(YogaFlexDirection.ROW);
        root.addChildAt(row2, 2);

        YogaNode image2 = new YogaNode();
        image2.setHeight(60 * getResources().getDisplayMetrics().density);
        image2.setWidth(60 * getResources().getDisplayMetrics().density);
        image2.setMargin(YogaEdge.ALL, 5 * getResources().getDisplayMetrics().density);
        row1.addChildAt(image2, 0);

        YogaNode image3 = new YogaNode();
        image3.setHeight(60 * getResources().getDisplayMetrics().density);
        image3.setWidth(60 * getResources().getDisplayMetrics().density);
        image3.setMargin(YogaEdge.ALL, 5 * getResources().getDisplayMetrics().density);
        row1.addChildAt(image3, 1);

        YogaNode image4 = new YogaNode();
        image4.setHeight(60 * getResources().getDisplayMetrics().density);
        image4.setWidth(60 * getResources().getDisplayMetrics().density);
        image4.setMargin(YogaEdge.ALL, 5 * getResources().getDisplayMetrics().density);
        row2.addChildAt(image4, 0);

        YogaNode image5 = new YogaNode();
        image5.setHeight(60 * getResources().getDisplayMetrics().density);
        image5.setWidth(60 * getResources().getDisplayMetrics().density);
        image5.setMargin(YogaEdge.ALL, 5 * getResources().getDisplayMetrics().density);
        row2.addChildAt(image5, 1);

        root.calculateLayout();

        ImageView imageView1 = new ImageView(this);
        imageView1.setImageResource(R.drawable.little_point);
        imageView1.setX(image1.getLayoutX());
        imageView1.setY(image1.getLayoutY());
        layout.addView(imageView1);

        ImageView imageView2 = new ImageView(this);
        imageView2.setImageResource(R.drawable.little_point);
        imageView2.setX(image2.getLayoutX());
        imageView2.setY(image2.getLayoutY());
        layout.addView(imageView2);

        ImageView imageView3 = new ImageView(this);
        imageView3.setImageResource(R.drawable.little_point);
        imageView3.setX(image3.getLayoutX());
        imageView3.setY(image3.getLayoutY());
        layout.addView(imageView3);

        ImageView imageView4 = new ImageView(this);
        imageView4.setImageResource(R.drawable.little_point);
        imageView4.setX(image4.getLayoutX() + row2.getLayoutX());
        imageView4.setY(image4.getLayoutY() + row2.getLayoutY());
        layout.addView(imageView4);

        ImageView imageView5 = new ImageView(this);
        imageView5.setImageResource(R.drawable.little_point);
        imageView5.setX(image5.getLayoutX() + row2.getLayoutX());
        imageView5.setY(image5.getLayoutY() + row2.getLayoutY());
        layout.addView(imageView5);


        Log.d("image", image1.getLayoutX() + " " + image1.getLayoutY());
        Log.d("image", image2.getLayoutX() + " " + image2.getLayoutY());
        Log.d("image", image3.getLayoutX() + " " + image3.getLayoutY());
        Log.d("image", image4.getLayoutX() + " " + image4.getLayoutY());
        Log.d("image", image5.getLayoutX() + " " + image5.getLayoutY());
        Log.d("row1", row1.getLayoutWidth() + "");
    }

    private void initYoga2() {
        SoLoader.init(MainActivity.this, false);

        YogaNode root = new YogaNode();
        root.setWidth(getWindowManager().getDefaultDisplay().getWidth() / 2);
        root.setHeight(getWindowManager().getDefaultDisplay().getWidth() / 2);
        root.setJustifyContent(YogaJustify.SPACE_BETWEEN);

        layout.getLayoutParams().width = getWindowManager().getDefaultDisplay().getWidth() / 2;
        layout.getLayoutParams().height = getWindowManager().getDefaultDisplay().getWidth() / 2;
        layout.requestLayout();

        YogaNode image1 = new YogaNode();
        image1.setHeight(60 * getResources().getDisplayMetrics().density);
        image1.setWidth(60 * getResources().getDisplayMetrics().density);
        image1.setMargin(YogaEdge.ALL, 5 * getResources().getDisplayMetrics().density);
        root.addChildAt(image1, 0);

        YogaNode image2 = new YogaNode();
        image2.setHeight(60 * getResources().getDisplayMetrics().density);
        image2.setWidth(60 * getResources().getDisplayMetrics().density);
        image2.setMargin(YogaEdge.ALL, 5 * getResources().getDisplayMetrics().density);
        image2.setAlignSelf(YogaAlign.FLEX_END);
        root.addChildAt(image2, 1);

        root.calculateLayout();

        ImageView imageView1 = new ImageView(this);
        imageView1.setImageResource(R.drawable.little_point);
        imageView1.setX(image1.getLayoutX());
        imageView1.setY(image1.getLayoutY());
        layout.addView(imageView1);

        ImageView imageView2 = new ImageView(this);
        imageView2.setImageResource(R.drawable.little_point);
        imageView2.setX(image2.getLayoutX());
        imageView2.setY(image2.getLayoutY());
        layout.addView(imageView2);

    }
}
