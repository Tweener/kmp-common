package com.tweener.common.android.kotlinextension

import android.graphics.Picture
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.graphics.Canvas
import androidx.compose.ui.graphics.drawscope.draw
import androidx.compose.ui.graphics.drawscope.drawIntoCanvas
import androidx.compose.ui.graphics.nativeCanvas

/**
 * @author Vivien Mahe
 * @since 23/09/2023
 */

fun Modifier.screenshot(
    picture: Picture
): Modifier =
    composed {
        Modifier.drawWithCache {
            val width = size.width.toInt()
            val height = size.height.toInt()

            onDrawWithContent {
                val pictureCanvas = Canvas(picture.beginRecording(width, height))

                draw(this, this.layoutDirection, pictureCanvas, this.size) {
                    this@onDrawWithContent.drawContent()
                }

                picture.endRecording()

                drawIntoCanvas { canvas -> canvas.nativeCanvas.drawPicture(picture) }
            }
        }
    }
