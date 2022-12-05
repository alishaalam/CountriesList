<h1 align="center">Countries List</h1>

<p>
This project displays a list of countries. Each item shows country name followed by the region followed by the country code.
The capital of the country is displayed in the next line if available.
If the capital is not available, the view changes accordingly.
</p>


<p align="center">
<img width="403" alt="Screen Shot 2022-12-04 at 6 27 11 PM" src="https://user-images.githubusercontent.com/2645150/205722349-7556a13c-0e50-48da-82c9-31686c67e68b.png">
</p>

## Architecture Overview

This app uses a combination of the MVVM, Clean architecture, and Repository patterns to organize its code. MVVM separates the UI from the business logic, and Clean architecture takes this separation a step further by dividing the code into modules with specific responsibilities. This makes the code easier to maintain and modify. The Repository pattern is used to separate the data layer from the UI and domain layer.
The app demonstrates the use of Retrofit to make REST requests to a web service, and Moshi to deserialize the JSON response into Kotlin data objects. For the UI, the app uses ViewModel, LiveData, and Data Binding with binding adapters. The Paging Library is used to get paged data from the network. For dependency injection, the app uses Hilt, which is a wrapper around Dagger.

This app demonstrates the use of:  
* Retrofit to make REST requests to the web service
* Moshi to handle the deserialization of the returned JSON to Kotlin data objects
* For UI - ViewModel, LiveData, Data Binding with binding adapters
* Paging Library to get paged data from the network.
* For dependency injection it uses Hilt which is a wrapper around Dagger


<h3>MVVM architecture & Repository pattern</h1>
<p align="center">
<img width="690" alt="Screen Shot 2022-12-05 at 11 32 09 AM" src="https://user-images.githubusercontent.com/2645150/205726370-586c337a-182f-489f-9264-fbe8075357f2.png">
</p>

<h3>Clean Architecture</h1>
<p align="center">
</p><img width="301" alt="Screen Shot 2022-12-05 at 10 30 05 AM" src="https://user-images.githubusercontent.com/2645150/205717939-fed46431-5501-4a4f-8ca4-dc5e47e3a570.png">
</p>



## Tech stack & Open-source libraries
- Minimum SDK level 19
- Written in [Kotlin](https://kotlinlang.org/)
- [Coroutines](https://github.com/Kotlin/kotlinx.coroutines) for asynchronous operations
- [Retrofit](https://github.com/square/retrofit) for constructing the REST APIs and paging network data
- [Moshi](https://github.com/square/moshi/) for A modern JSON library for Kotlin and Java
- [Hilt](https://dagger.dev/hilt/) for dependency injection
- Android Jetpack
  - [Lifecycle](https://developer.android.com/topic/libraries/architecture/lifecycle) for observing data when lifecycle state changes
  - [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel) for UI Related data holder, lifecycle aware
  - [Databinding](https://developer.android.com/topic/libraries/data-binding) for view Binding + Bind data from view to ViewModel
  - [Android Paging v3](https://developer.android.com/topic/libraries/architecture/paging/v3-overview) - Get paged data from network, display list using PagingDataAdapter in a recyclerView

## Project Setup
1. Install Android Studio, if you don't already have it.
2. Download the sample.
3. Import the sample into Android Studio.
4. Build and run the sample.

## External Dependencies
- [Retrofit](https://github.com/square/retrofit) - Networking Library
- [Moshi](https://github.com/square/moshi/) - Object Conversion
- [Hilt](https://dagger.dev/hilt/) - Dependency injection Library

## Testing
Added test cases to ensure the data in the view is being loaded properly

## Future Work 
1. Improve the user interface to make it more user-friendly and visually appealing.
    1. Show the selection of items in the app, such as which items are currently selected.
    2. Add a pull-to-refresh feature, which allows the user to swipe down to refresh the data displayed in the app.
2. Introduce an offline-first architecture by using Room, a local database library, to store data locally and improve the app's performance and reliability.
3. Leverage Paging Library 
    1. Showing page loader status
    2. Error & Retry Mechanism
