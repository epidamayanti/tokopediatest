package com.tokopedia.maps

data class ModelMaps(
        val name: String,
        val capital: String,
        val population: String,
        val altSpellings: MutableList<String>,
        val callingCodes: MutableList<String>,
        val latlng: MutableList<Double>
)