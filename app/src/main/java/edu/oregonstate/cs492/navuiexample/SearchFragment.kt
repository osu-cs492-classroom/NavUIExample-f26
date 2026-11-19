package edu.oregonstate.cs492.navuiexample

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.google.android.material.button.MaterialButton

class SearchFragment : Fragment(R.layout.fragment_search) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val bookmarksButton = view.findViewById<MaterialButton>(R.id.go_to_bookmarks)
        bookmarksButton.setOnClickListener {
            val directions = SearchFragmentDirections.navigateToBookmarks()
            findNavController().navigate(directions)
        }

        val settingsButton = view.findViewById<MaterialButton>(R.id.go_to_settings)
        settingsButton.setOnClickListener {
            val directions = SearchFragmentDirections.navigateToSettings()
            findNavController().navigate(directions)
        }
    }
}