import com.android.build.gradle.internal.cxx.configure.gradleLocalProperties

plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("kapt")
    id("dagger.hilt.android.plugin")
}
val apiKey = gradleLocalProperties(rootDir).getProperty("TMDB_API_KEY")

android {
    compileSdkVersion (30)
    buildToolsVersion = "30.0.2"

    defaultConfig {
        applicationId = "com.joseph.tmdb_mvvm"
        minSdkVersion (21)
        targetSdkVersion (30)
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        buildConfigField ("String", "TMDB_API_KEY", apiKey)
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildFeatures {
        dataBinding = true
    }
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.4.10")
    implementation("androidx.core:core-ktx:1.5.0-alpha05")
    implementation("androidx.appcompat:appcompat:1.2.0")
    implementation("com.google.android.material:material:1.2.1")
    implementation ("androidx.constraintlayout:constraintlayout:2.0.4")
    implementation ("androidx.legacy:legacy-support-v4:1.0.0")
    implementation ("androidx.navigation:navigation-fragment-ktx:2.3.2")
    implementation ("androidx.navigation:navigation-ui-ktx:2.3.2")
    testImplementation ("junit:junit:4.+")
    androidTestImplementation ("androidx.test.ext:junit:1.1.2")
    androidTestImplementation ("androidx.test.espresso:espresso-core:3.3.0")

    // Glide
    implementation ("com.github.bumptech.glide:glide:4.11.0")
    kapt ("com.github.bumptech.glide:compiler:4.11.0")

    // CircleImageView
    implementation ("de.hdodenhof:circleimageview:3.1.0")

    // Activity KTX for viewModels()
    implementation ("androidx.activity:activity-ktx:1.1.0")

    // Architectural Components
    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:2.2.0")

    // Lifecycle
    implementation ("androidx.lifecycle:lifecycle-extensions:2.2.0")
    implementation ("androidx.lifecycle:lifecycle-livedata-ktx:2.2.0")
    implementation ("androidx.lifecycle:lifecycle-runtime:2.2.0")
    implementation( "androidx.lifecycle:lifecycle-runtime-ktx:2.2.0")

    // Timber
    implementation ("com.jakewharton.timber:timber:4.7.1")

    // Coroutines
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.4.2")
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.4.2")

    // Dagger - Hilt
    implementation ("com.google.dagger:hilt-android:2.29.1-alpha")
    kapt ("com.google.dagger:hilt-android-compiler:2.28.3-alpha")
    implementation ("androidx.hilt:hilt-lifecycle-viewmodel:1.0.0-alpha02")
    kapt ("androidx.hilt:hilt-compiler:1.0.0-alpha02")

    // Moshi
    implementation ("com.squareup.moshi:moshi:1.11.0")

    // Retrofit2
    implementation ("com.squareup.retrofit2:retrofit:2.9.0")
    implementation ("com.squareup.retrofit2:converter-gson:2.9.0")

    // Retrofit Logging Intercepter (1. 기본매개변수용 2. 로깅확인용)
    implementation ("com.squareup.okhttp3:logging-interceptor:4.9.0")

    // Paging3 Library
    implementation ("androidx.paging:paging-runtime-ktx:3.0.0-alpha11")
}