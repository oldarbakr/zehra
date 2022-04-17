package com.oldar.zehra

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Paint.Style.*
import android.util.AttributeSet
import android.view.View
import java.util.jar.Attributes

class TicTacToe (context:Context, attrs: AttributeSet?): View(context,attrs){
    private var brandColor = 0
    private var XColor= 0
    private var OColor=0
    private var WinnerLine=0
    private var cellSize = width/3

    private var paint=Paint()

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(width, height)
        val dimension=Math.min(measuredWidth,measuredHeight)
        cellSize = dimension/3
        setMeasuredDimension(dimension,dimension)
    }

    override fun onDraw(canvas: Canvas) {
        paint.style= STROKE
        paint.isAntiAlias=true
        drawGameBoard(canvas)
        drawX(canvas,1,1)

    }

    private fun drawGameBoard(canvas: Canvas){
        paint.color=0//boardColor
        paint.strokeWidth=16f
        for(c in 1..2){
            canvas.drawLine(0f,
                (cellSize*c).toFloat(),
                canvas.width.toFloat(),
                (cellSize*c).toFloat(),
                paint)
        }
    }

    private fun drawX(canvas: Canvas,row: Int, col:Int){
        paint.color = XColor
        canvas.drawLine((col*cellSize).toFloat(),
            (row*cellSize).toFloat(),
            ((col+1)*cellSize).toFloat(),
            ((row+1)*cellSize).toFloat(),
            paint)
    }

    private fun drawO(canvas: Canvas,row: Int, col:Int){
        paint.color = XColor
        canvas.drawOval(
            (col*cellSize).toFloat(),
            (row*cellSize).toFloat(),
            (col*cellSize).toFloat(),
            (row*cellSize).toFloat(),
            paint)
    }

    init{
        val a=context.theme.obtainStyledAttributes(attrs,R.styleable.ActionBar,0,0)
        try{
            brandColor=a.getInteger(R.styleable.ActionBar_background,0)
            XColor = a.getInteger(R.styleable.ActionBar_background,0)
            OColor = a.getInteger(R.styleable.ActionBar_background,0)
            WinnerLine=a.getInteger(R.styleable.ActionBar_background,0)
        }finally {
            a.recycle()
        }
    }
}