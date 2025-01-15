# Meme App

This is a simple Android application built using Kotlin to display memes fetched from an API. The app uses the Volley library for making API requests and handling responses. Users can click a button to fetch and display a new meme.

## Features
- Fetches memes dynamically from a public API.
- Displays memes with a clean and simple UI.
- Button to load a new meme instantly.

## Getting Started

### Prerequisites
Before you begin, ensure you have:
- Android Studio installed on your system.
- Basic knowledge of Android development.
- Internet connectivity for API communication.

### Setup Instructions
1. Clone this repository:
   ```bash
   git clone https://github.com/sujalpatel187/Volly_Lib_learing_meme_app.git
   ```

2. Open the project in Android Studio.

3. Sync the project with Gradle to download all dependencies.

### Dependencies
Ensure the following dependencies are added to your `build.gradle` file:
```gradle
implementation 'com.android.volley:volley:1.2.1'
implementation 'com.squareup.picasso:picasso:2.8'
```

## Usage
1. Launch the app on an Android device or emulator.
2. Tap the "Next Meme" button to fetch and display a new meme.
3. Enjoy unlimited fun memes!

## Project Structure
- **UI (XML layouts)**: Simple and clean design for meme display.
- **Kotlin**: Manages API integration and button interactions.
- **Volley**: Handles API requests and responses.
- **Picasso**: Loads and displays meme images efficiently.

## API Integration
- The app fetches memes from a public meme API.
- API responses include meme URLs which are used to load images dynamically.

### Example API Response
```json
{
  "post_link": "https://redd.it/example",
  "subreddit": "memes",
  "title": "Funny Meme",
  "url": "https://i.redd.it/example.jpg",
  "author": "meme_creator",
  "ups": 12345
}
```

## Contributing
Contributions are welcome! Follow these steps to contribute:
1. Fork the repository.
2. Create a new branch for your feature or bug fix.
3. Commit your changes and push them to your fork.
4. Submit a pull request.

## License
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Contact
For any queries or suggestions, feel free to reach out:
- GitHub: [Sujal Patel](https://github.com/sujalpatel187)

---

Enjoy memes with our app!

