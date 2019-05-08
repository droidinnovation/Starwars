# Star Wars app
The app has been developed in Kotlin following the MVVM architecture pattern with a modular approach.  Koin has been used for dependency injection. Reactive streams have been used to make networking cleaner. LiveData and ViewModel from Jetpack have also been used.

The app is developed with a modular approach to support instant apps & dynamic delivery for the users. Modularity also allows us to have faster gradle build speeds, clear ownerships amongst the team & cleaner git flows. More info about modular apps can be found [here](https://medium.com/mindorks/writing-a-modular-project-on-android-304f3b09cb37).

## Decision
* Koin: I wanted to play around with Koin, and it turned out to be very straight-forward to implement. The performance is also great.
* Modular: As mentioned above, modularity has various advantages to the end users as well as the development team.

## Structure
The `app` module is where the application initializes & `characters` module is where our sample screens reside. 
`CharacterActivity` holds the `CharacterSearchFragment` & `CharacterDetailsFragment`.
The packages are "by-feature" for easier access.

## Testing
I have implemented test case on the Details screen. The same can be implemented on other screens. 
To run all the tests: `./gradlew test`

## Improvements
* We can improve the UI of the app. 
* This is the first time I have chained API requests (on Details screen), there could be better ways to approach this, although, the current implementation is also pretty clean.