package com.example.aplicativosala.dataset

import com.example.aplicativosala.R
import com.example.aplicativosala.model.IntroItem

class IntroList {

    fun loadIntroList(): List<IntroItem>{

        return listOf<IntroItem>(
            IntroItem(R.drawable.img_education_1, R.string.title_1, R.string.description),
            IntroItem(R.drawable.img_education_2, R.string.title_2, R.string.description),
            IntroItem(R.drawable.img_education_3, R.string.title_3, R.string.description)
        )

    }

}