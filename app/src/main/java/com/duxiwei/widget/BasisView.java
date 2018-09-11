package com.duxiwei.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by duxiwei on 18-9-11.
 * Mail  duxiwei@aliyun.com
 */
public class BasisView extends View {

    public BasisView(Context context) {
        super(context);
    }

    public BasisView(Context context,AttributeSet attrs){
        super(context,attrs);
    }

    public BasisView(Context context,AttributeSet attrs,int defStyle){
        super(context,attrs,defStyle);
    }
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(5);
//        canvas.drawRGB(0xFF,0x00,0xFF);
//        canvas.drawCircle(300,300,250,paint);
//        canvas.drawLine(100,100,200,200,paint);
//        RectF rectf = new RectF(10f,10f,100f,100f);
//        Rect rect = new Rect(10,10,100,100);
//        canvas.drawRect(rect,paint);
        Path path = new Path();
        path.moveTo(10,10);
//        path.lineTo(10,100);
//        path.lineTo(300,100);
//        path.close();
//        canvas.drawPath(path,paint);
        RectF rectF = new RectF(100,10,200,100);
        path.arcTo(rectF,0,360);
        canvas.drawPath(path,paint);
    }
}
