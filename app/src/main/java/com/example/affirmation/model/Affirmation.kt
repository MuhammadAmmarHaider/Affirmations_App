package com.example.affirmation.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Affirmation (
    @StringRes val stringResource:Int,
    @DrawableRes val imageResource:Int
)