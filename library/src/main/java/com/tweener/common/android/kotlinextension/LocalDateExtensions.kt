package com.tweener.common.android.kotlinextension

import java.time.format.DateTimeFormatter
import kotlinx.datetime.LocalDate
import kotlinx.datetime.toJavaLocalDate

/**
 * @author Vivien Mahe
 * @since 19/11/2023
 */

fun LocalDate.format(pattern: String = "dd-MM-yyyy") =
    DateTimeFormatter.ofPattern(pattern).format(this.toJavaLocalDate())
