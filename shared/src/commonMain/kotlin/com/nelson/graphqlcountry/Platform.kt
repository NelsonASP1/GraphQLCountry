package com.nelson.graphqlcountry

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform