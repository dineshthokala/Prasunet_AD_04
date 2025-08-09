
# Prasunet_AD_04

A modern Android Tic-Tac-Toe game application built with a modular architecture. This project demonstrates clean code practices, modularization, and Android development best practices.

## Features
- Classic Tic-Tac-Toe gameplay
- Modular project structure (app, domain, base, common)
- Clean separation of concerns
- Custom UI components
- Navigation component integration
- Theming for light and dark modes

## Project Structure
```
Prasunet_AD_04-master/
├── app/           # Main Android application module
├── domain/        # Business logic and domain models
├── libs/
│   ├── base/      # Base library module
│   └── common/    # Common utilities and shared code
├── build.gradle   # Project-level Gradle build file
├── settings.gradle
└── README.md      # Project documentation
```

## Getting Started

### Prerequisites
- Android Studio (latest recommended)
- JDK 17 or above
- Gradle (wrapper included)

### Build & Run
1. Clone the repository:
   ```sh
   git clone <repo-url>
   ```
2. Open the project in Android Studio.
3. Let Gradle sync and build the project.
4. Run the app on an emulator or physical device.

### Project Modules
- **app**: Android app, UI, navigation, and resources
- **domain**: Business logic, use cases, and models
- **libs/base**: Base classes and interfaces
- **libs/common**: Shared utilities and helpers

## Customization
- Update resources in `app/src/main/res` for branding
- Modify layouts in `app/src/main/res/layout` for UI changes
- Add new features in the `domain` or `libs` modules as needed

## Contributing
Pull requests are welcome! For major changes, please open an issue first to discuss what you would like to change.

## License
This project is licensed under the MIT License.
