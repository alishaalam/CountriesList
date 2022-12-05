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

This app combines MVVM with Clean architecture & Repository pattern.
* MVVM separates code from business logic.
* Clean architecture takes it one step forward by separating the code in different modules or sections with specific responsibilities making it easier for maintenance and further modification. It also allows for loose coupling and also lends itself well to being easily testable
* Repository Pattern - To seprate data layer from UI & Domain Layer


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
- [Kotlin](https://kotlinlang.org/)
- [Coroutines](https://github.com/Kotlin/kotlinx.coroutines) for asynchronous operations
- [Retrofit](https://github.com/square/retrofit) - construct the REST APIs and paging network data
- [Moshi](https://github.com/square/moshi/) - A modern JSON library for Kotlin and Java
- [Hilt](https://dagger.dev/hilt/)
- Android Jetpack
  - [Lifecycle](https://developer.android.com/topic/libraries/architecture/lifecycle) - Observing data when lifecycle state changes
  - [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel) - UI Related data holder, lifecycle aware
  - [Databinding](https://developer.android.com/topic/libraries/data-binding) - View Binding + Bind data from view to ViewModel
  - [Android Paging v3](https://developer.android.com/topic/libraries/architecture/paging/v3-overview) - Get paged data from network, display list using PagingDataAdapter in a recyclerView

## Project Setup
1. Install Android Studio, if you don't already have it.
2. Download the sample.
3. Import the sample into Android Studio.
4. Build and run the sample.

## External Dependencies
- [Retrofit](https://github.com/square/retrofit) - construct the REST APIs and paging network data.
- [Moshi](https://github.com/square/moshi/) - A modern JSON library for Kotlin and Java.
- [Hilt](https://dagger.dev/hilt/)

## Testing
Added test cases to ensure the data in the view is being loaded properly

## Future Work 
1. Improve UI
    1. Show selection of item
    2. Add pull to refresh
2. Introduce offline first architecture by using Room
3. Leverage Paging Library 
    1. Showing page loader status
    2. Error & Retry Mechanism
