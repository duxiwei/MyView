package com.duxiwei.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RegionIterator;
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
//        Paint paint = new Paint();
//        paint.setColor(Color.GREEN);
//        paint.setStyle(Paint.Style.FILL);
//        paint.setStrokeWidth(5);
//        canvas.drawRGB(0xFF,0x00,0xFF);
//        canvas.drawCircle(300,300,250,paint);
//        canvas.drawLine(100,100,200,200,paint);
//        RectF rectf = new RectF(10f,10f,100f,100f);
//        Rect rect = new Rect(10,10,100,100);
//        canvas.drawRect(rect,paint);
//        Path path = new Path();
//        path.moveTo(10,10);
//        path.lineTo(200,55);
//        path.lineTo(300,100);
//        path.close();
//        canvas.drawPath(path,paint);
//        Path path1 = new Path();
//        paint.setColor(Color.RED);
//        RectF rectF = new RectF(100,10,200,100);
//        path.arcTo(rectF,0,360);
//        canvas.drawPath(path1,paint);
//        Region region = new Region(new Rect(50,50,200,100));
//        drawRegion(canvas,region,paint);
//        Path ovalPath = new Path();
//        RectF rect = new RectF(50,50,200,500);
//        ovalPath.addOval(rect,Path.Direction.CCW);
//        Region rgn = new Region();
//        rgn.setPath(ovalPath,new Region(50,50,200,200));
//        drawRegion(canvas,rgn,paint);

//        Rect rect1 = new Rect(100,100,400,200);
//        Rect rect2 = new Rect(200,0,300,300);
//        Paint paint = new Paint();
//        paint.setColor(Color.RED);
//        paint.setStyle(Paint.Style.STROKE);
//        paint.setStrokeWidth(2);
//        canvas.drawRect(rect1,paint);
//        canvas.drawRect(rect2,paint);
//        Region region = new Region(rect1);
//        Region region2 = new Region(rect2);
//        region.op(region2, Region.Op.XOR);//INTERSECT交集，DIFFERENCE 补集，REPLACE 替换，REVERSE_DIFFERENCE 反转补集，UNION 并集，XOR 异并集
//        Paint paint_fill = new Paint();
//        paint_fill.setColor(Color.GREEN);
//        paint_fill.setStyle(Paint.Style.FILL);
//        drawRegion(canvas,region,paint_fill);

//        Paint paint = new Paint();
//        paint.setColor(Color.GREEN);
//        paint.setStyle(Paint.Style.FILL);
//        canvas.translate(100,100);
//        Rect rect1 = new Rect(0,0,400,220);
//        canvas.drawRect(rect1,paint);

        Paint paint_green = generatePaint(Color.GREEN, Paint.Style.STROKE,3);
        Paint paint_red = generatePaint(Color.RED,Paint.Style.STROKE,3);
        Rect rect1 = new Rect(0,0,400,220);
        canvas.drawRect(rect1,paint_green);
        canvas.translate(100,100);
        canvas.drawRect(rect1,paint_red);

        canvas.drawColor(Color.RED);
        canvas.save();
        canvas.clipRect(new Rect(100,100,800,800));
        canvas.drawColor(Color.GREEN);
//        canvas.restore();
//        canvas.drawColor(Color.BLUE);

    }

    public void drawRegion(Canvas canvas,Region rgn,Paint paint){
        RegionIterator iter = new RegionIterator(rgn);
        Rect r = new Rect();
        while(iter.next(r)){
            canvas.drawRect(r,paint);
        }
    }

    public Paint generatePaint(int color,Paint.Style style,int width){
        Paint paint = new Paint();
        paint.setColor(color);
        paint.setStyle(style);
        paint.setStrokeWidth(width);
        return paint;
    }
}
