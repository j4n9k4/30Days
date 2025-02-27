package com.example.a30days.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.a30days.R
data class Item(
    @DrawableRes val image: Int,
    @StringRes val description: Int
)

object Items
{
    val itemList: List<Item> = listOf(
        Item(R.drawable.image_1, R.string.description_1),
        Item(R.drawable.image_2, R.string.description_2),
        Item(R.drawable.image_3, R.string.description_3),
        Item(R.drawable.image_4, R.string.description_4),
        Item(R.drawable.image_5, R.string.description_5),
        Item(R.drawable.image_6, R.string.description_6),
        Item(R.drawable.image_7, R.string.description_7),
        Item(R.drawable.image_8, R.string.description_8),
        Item(R.drawable.image_9, R.string.description_9),
        Item(R.drawable.image_10, R.string.description_10),
        Item(R.drawable.image_11, R.string.description_11),
        Item(R.drawable.image_12, R.string.description_12),
        Item(R.drawable.image_13, R.string.description_13),
        Item(R.drawable.image_14, R.string.description_14),
        Item(R.drawable.image_15, R.string.description_15),
        Item(R.drawable.image_16, R.string.description_16),


    )
}