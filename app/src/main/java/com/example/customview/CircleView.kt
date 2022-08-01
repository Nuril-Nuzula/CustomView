package com.example.customview

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class CircleView(context: Context, attributeSet: AttributeSet) : View(context, attributeSet) {

    var radius = 100f

    var paint = Paint(Paint.ANTI_ALIAS_FLAG)

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        paint.color =  Color.RED

        canvas?.drawCircle(radius, radius, radius, paint)
    }

}