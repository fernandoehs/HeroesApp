package com.fernandoh.heroesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fernandoh.heroesapp.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    companion object{
        const val  SUPERHEROKEY= "superhero"

    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bundle = intent.extras!!
        val superhero = bundle.getParcelable<Superhero>(SUPERHEROKEY) !!


        binding.heroName.text = superhero.name
        binding.heroName2.text =superhero.alterEgo
        binding.heroName3.text=superhero.bio
        binding.ratingBar.rating = superhero.power
    }

}