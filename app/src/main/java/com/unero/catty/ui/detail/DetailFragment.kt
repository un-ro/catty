package com.unero.catty.ui.detail

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel
import com.unero.catty.R
import com.unero.catty.data.Cat
import com.unero.catty.databinding.FragmentDetailBinding

class DetailFragment : Fragment() {

    private var _binding: FragmentDetailBinding? = null
    private val binding get() =  _binding!!

    private val args: DetailFragmentArgs by navArgs()
    private val imageList = ArrayList<SlideModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding =  FragmentDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        
        setUI(args.cat)
    }

    private fun setUI(cat: Cat) {
        binding.apply {
            toolbar.setNavigationOnClickListener {
                it.findNavController().popBackStack()
            }

            toolbar.setOnMenuItemClickListener {
                when (it.itemId) {
                    R.id.icon_share -> share(cat.breed)
                    else -> false
                }
            }

            tvTitle.text = cat.breed
            tvSizeWeight.text = cat.size
            tvOverview.text = cat.overview
            tvHistory.text = cat.history

            for (photo in cat.photos){
                imageList.add(SlideModel(photo, ScaleTypes.CENTER_INSIDE))
            }

            imageSlider.setImageList(imageList)
        }
    }

    private fun share(breed: String): Boolean {
        val text = "Hey, do search $breed Cat breed they are so cuutee!"

        val intent = Intent().apply {
            action = Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, text)
            type = "text/plain"
        }

        val shareIntent = Intent.createChooser(intent, null)
        startActivity(shareIntent)
        return true
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}