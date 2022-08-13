package com.example.downloadablefontscomposeexample

import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.googlefonts.Font
import androidx.compose.ui.text.googlefonts.GoogleFont

// GoogleFont Provider initialization

@OptIn(ExperimentalTextApi::class)
val provider = GoogleFont.Provider(
    providerAuthority = "com.google.android.gms.fonts",
    providerPackage = "com.google.android.gms",
    certificates = R.array.com_google_android_gms_fonts_certs
)


// Using font with one style

@OptIn(ExperimentalTextApi::class)
val pacificoFontName = GoogleFont("Pacifico")

@OptIn(ExperimentalTextApi::class)
val pacifico = FontFamily(Font(googleFont = pacificoFontName, fontProvider = provider))


// Using font with different styles

@OptIn(ExperimentalTextApi::class)
val kanitFontName = GoogleFont("Kanit")

@OptIn(ExperimentalTextApi::class)
val kanitFontFamily = FontFamily(
    Font(googleFont = kanitFontName, fontProvider = provider, weight = FontWeight.Normal),
    Font(googleFont = kanitFontName, fontProvider = provider, weight = FontWeight.ExtraBold, style = FontStyle.Italic),
)


// Using font with a local font as fallback

@OptIn(ExperimentalTextApi::class)
val lobsterTwoFontName = GoogleFont("Lobster Two")

@OptIn(ExperimentalTextApi::class)
val lobsterFontName = GoogleFont("Lobster")

@OptIn(ExperimentalTextApi::class)
val lobsterTwo = FontFamily(
    Font(googleFont = lobsterTwoFontName, fontProvider = provider, weight = FontWeight.Normal),
    Font(resId = R.font.best),
    Font(googleFont = lobsterFontName, fontProvider = provider, weight = FontWeight.Bold),
    Font(resId = R.font.mallent_regular, style = FontStyle.Normal, weight = FontWeight.Normal)
)


