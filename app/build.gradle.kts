import org.jetbrains.kotlin.storage.CacheResetOnProcessCanceled.enabled

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.google.dagger.hilt.android")
    id("kotlin-kapt")
}

android {
    buildFeatures {
        dataBinding = true
    }

    namespace = "com.example.fuatapesa"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.fuatapesa"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables.useSupportLibrary = true
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    //Hilt
    implementation ("com.google.dagger:hilt-android:2.49")
//    implementation ("androidx.hilt:hilt-work:1.2.0")
    kapt ("com.google.dagger:hilt-compiler:2.48.1")

    //Timber
    implementation ("com.jakewharton.timber:timber:5.0.1")

    implementation ("androidx.recyclerview:recyclerview:1.3.2")

    //ViewModel and livedata
    implementation ("androidx.lifecycle:lifecycle-extensions:2.2.0")

    implementation ("androidx.startup:startup-runtime:1.1.1")
    implementation ("androidx.core:core-splashscreen:1.0.1")

    implementation ("androidx.core:core-ktx:1.12.0")
    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:2.7.0")
    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:2.7.0")

    // Navigation Components
    implementation ("androidx.navigation:navigation-fragment-ktx:2.7.7")
    implementation ("androidx.navigation:navigation-ui-ktx:2.7.7")
    implementation ("androidx.navigation:navigation-runtime-ktx:2.7.7")
    implementation ("androidx.navigation:navigation-dynamic-features-fragment:2.7.7")
}