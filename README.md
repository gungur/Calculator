# Calculator App Documentation

## Overview
This is a simple Android calculator application that performs basic arithmetic operations (addition, subtraction, multiplication, and division) on two integers and displays the result in a separate activity.

## Features
- Performs four basic arithmetic operations:
  - Addition (+)
  - Subtraction (-)
  - Multiplication (×)
  - Division (÷)
- Handles division by zero with a user-friendly error message
- Displays results in a separate activity
- Clean and simple user interface

## Files Structure
- `MainActivity.java`: Contains the main logic for input handling and calculations
- `CalculatorActivity.java`: Displays the calculation results
- `AndroidManifest.xml`: Configures the application and activities

## How to Use
1. Enter two integers in the input fields
2. Click one of the operation buttons:
   - "+" for addition
   - "-" for subtraction
   - "×" for multiplication
   - "÷" for division
3. The result will be displayed on a new screen

### Special Cases
- Division by zero will show the message: "Sorry! Dividing by zero is undefined."

## Technical Details
- Uses `Intent` to pass data between activities
- Inputs are converted from `String` to `Integer` for calculations
- Results are converted to `double` for division operations to maintain precision
- Results are passed back as `String` for display

## Requirements
- Android Studio
- Minimum SDK version not specified in provided code (typically API 21+ recommended)

## Installation
1. Clone the repository
2. Open the project in Android Studio
3. Build and run the application on an emulator or physical device

## Screens
1. **Main Screen**: Contains two input fields and four operation buttons
2. **Result Screen**: Displays the calculation result or error message

## Future Improvements
- Add support for decimal numbers
- Implement more advanced mathematical operations
- Improve UI/UX design
- Add history of calculations
- Implement unit tests

## Screenshot

<img width="1440" height="3120" alt="Screenshot_20250726_161822" src="https://github.com/user-attachments/assets/25b5a48c-4664-4f8f-ae38-dc94b1463054" />
