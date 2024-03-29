package com.example.aplicativosala.view

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.aplicativosala.R
import com.example.aplicativosala.adapter.VideosAdapter
import com.example.aplicativosala.databinding.ActivityMainBinding
import com.example.aplicativosala.model.Informations

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val dataInformations = loadMyDataset()

        binding.recyclerView.adapter = VideosAdapter(this, dataInformations)

        val layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(this)
        binding.recyclerView.layoutManager = layoutManager

        binding.recyclerView.setHasFixedSize(true)


    }


    private fun loadMyDataset(): List<Informations> {

        return listOf<Informations>(

            Informations(
                R.drawable.im_acessibilidade,
                R.string.title_1,
                R.string.theme_1,
                R.string.students_1, Uri.parse(
                    "android.resource://$packageName/${R.raw.video_1}"), R.string.description_1),

            Informations(
                R.drawable.im_cultura, R.string.title_2, R.string.theme_2, R.string.students_2, Uri.parse(
                "android.resource://$packageName/${R.raw.video_2}"), R.string.description_2),

            Informations(
                R.drawable.im_economia, R.string.title_3, R.string.theme_3, R.string.students_3, Uri.parse(
                "android.resource://$packageName/${R.raw.video_3}"), R.string.description_3),

            Informations(
                R.drawable.im_educacao, R.string.title_4, R.string.theme_4, R.string.students_4, Uri.parse(
                "android.resource://$packageName/${R.raw.video_4}"), R.string.description_4),

            Informations(
                R.drawable.im_homofobia,
                R.string.title_5,
                R.string.theme_5,
                R.string.students_5, Uri.parse(
                "android.resource://$packageName/${R.raw.video_5}"), R.string.description_5),

            Informations(
                R.drawable.im_meio_ambiente,
                R.string.title_6,
                R.string.theme_6,
                R.string.students_6, Uri.parse(
                "android.resource://$packageName/${R.raw.video_6}"), R.string.description_6),

            Informations(
                R.drawable.im_racismo, R.string.title_7, R.string.theme_7, R.string.students_7, Uri.parse(
                "android.resource://$packageName/${R.raw.video_7}"), R.string.description_7),

            Informations(
                R.drawable.im_saude, R.string.title_8, R.string.theme_8, R.string.students_8, Uri.parse(
                "android.resource://$packageName/${R.raw.video_8}"), R.string.description_8),

            Informations(
                R.drawable.im_tecnologia,
                R.string.title_9,
                R.string.theme_9,
                R.string.students_9, Uri.parse(
                "android.resource://$packageName/${R.raw.video_9}"), R.string.description_9),

            Informations(
                R.drawable.im_women_power,
                R.string.title_10,
                R.string.theme_10,
                R.string.students_10, Uri.parse(
                "android.resource://$packageName/${R.raw.video_10}"), R.string.description_10),
        )

    }

}





