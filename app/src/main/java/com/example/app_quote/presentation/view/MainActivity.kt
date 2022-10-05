package com.example.app_quote.presentation.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.ui.AppBarConfiguration
import android.view.Menu
import android.view.MenuItem
import androidx.activity.viewModels
import androidx.lifecycle.lifecycleScope
import com.example.app_quote.R
import com.example.app_quote.databinding.ActivityMainBinding
import com.example.app_quote.presentation.viewmodel.QuoteViewModel
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding
    private val quoteViewModel: QuoteViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //setSupportActionBar(binding.toolbar)
        quoteViewModel.randomQuote()
        observer()
        binding.viewContainer.setOnClickListener {
            quoteViewModel.randomQuote()
        }
    }

    private fun observer() {
        lifecycleScope.launch {
            quoteViewModel.quoteModel.collect {
                binding.tvQuote.text = it.quote
                binding.tvAuthor.text = it.author
            }
        }
    }


    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}