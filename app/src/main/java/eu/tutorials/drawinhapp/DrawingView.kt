package eu.tutorials.drawinhapp

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.view.View

class DrawingView(context : Context,attrs: AttributeSet) : View (context , attrs){

    private var mDrawPath : CustomPath? = null
    private var mCanvasBitmap: Bitmap? = null
    private var mDrawPaint: Paint? =null
    private var mCanvasPaint: Paint? =null
    private var mBrushSize: Float =0.toFloat()
    private var color = Color.BLACK
    private var canvas: Canvas? = null

    init {
        setUpDrawaing()
    }

    private fun setUpDrawaing(){
        mDrawPaint = Paint()
        mDrawPath = CustomPath(color,mBrushSize)
        mDrawPaint!!.color = color
        mDrawPaint!!.style = Paint.Style.STROKE
        mDrawPaint!!.strokeJoin = Paint.Join.ROUND
        mDrawPaint!!.strokeCap = Paint.Cap.ROUND
        mCanvasPaint = Paint(Paint.DITHER_FLAG)
        mBrushSize =20.toFloat()
    }

    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
        super.onSizeChanged(w, h, oldw, oldh)
    mCanvasBitmap = Bitmap.createBitmap(w, h, Bitmap.Config.ARGB_8888)
        canvas = Canvas(mCanvasBitmap!!)
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        canvas.drawBitmap(mCanvasBitmap!!,)

    }


    internal inner class CustomPath(var color: Int, var brushThickness: Float) : Path(){

    }


}
