package com.sudhir.week6assignment.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import com.sudhir.week6assignment.R

class AboutUs : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.about_us_, container, false)

        val webView: WebView =view.findViewById(R.id.webViewSoftwarica)
        webView.loadUrl("https://softwarica.edu.np/")

        val webSettings: WebSettings = webView.settings
        webSettings.javaScriptEnabled = true
        webSettings.loadWithOverviewMode = true

        //Force links and redirects to open in the WebView instead of in a browser
        webView.webViewClient = WebViewClient()

        return view
    }
}