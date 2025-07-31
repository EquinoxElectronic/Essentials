# Equinox Essentials Overview

The **Equinox Essentials** project is a robust utility library designed to simplify common programming tasks. It consists of well-structured classes that provide a wide range of functionality, from data conversions and random data generation to JSON handling, security, and more. Below is an overview of the key components in this library.

---

## Components

### 1. **Convert**
A versatile class for handling data conversions:
- **String-to-Primitive Conversions**:
    - Convert strings to `int`, `double`, and `boolean` with validation.
- **JSON Handling**:
    - Serialize objects to JSON or deserialize JSON into objects.
- **Unit Conversions**:
    - Perform conversions for **temperature**, **length**, and **weight** (e.g., Celsius to Fahrenheit, meters to feet, etc.).

<div style="padding:10px; background-color:#f0f8ff; border-radius:5px;">
Example: Quickly convert a Celsius temperature to Fahrenheit or deserialize JSON using Gson.
</div>

---

### 2. **Generators**
Efficient and reliable random data generation:
- **generateRandomString**:
    - Generate random alphanumeric strings of a specified length.

<div style="padding:10px; background-color:#f6fff2; border-radius:5px;">
Example: Create random tokens, user IDs, or test data.
</div>

---

### 3. **Getter**
Streamlined JSON file I/O operations:
- **readJson**:
    - Load and deserialize JSON data from a file.
- **writeJson**:
    - Serialize and save an object to a JSON file.

<div style="padding:10px; background-color:#fffabb; border-radius:5px;">
Example: Easily read a configuration file or save structured data.
</div>

---

### 4. **Security**
A comprehensive solution for encryption and security evaluation:
- **String Encryption**:
    - Offers several security levels:
        - `HASH`, `SALTED_HASH`, `SHIFTED_HASH`, `FULLY_ENCRYPTED`.
    - Provides cryptographic hashing (SHA-256), salting, shifting, and repeated hashing for enhanced security.
- **Password Security Check**:
    - Analyze and classify password strength as `NONE`, `LOW`, `MEDIUM`, or `HIGH` based on length and character diversity.

<div style="padding:10px; background-color:#ffe4e1; border-radius:5px;">
Example: Encrypt sensitive data or determine if a user's password meets security standards.
</div>

---

## Key Features
- **Extensibility**: Designed for easy integration and scalability across projects.
- **Efficiency**: Optimized for performance while ensuring simplicity in use.
- **Reliability**: Built-in validation and exception handling to prevent common errors.
- **Versatility**: A collection of tools that caters to a wide variety of use cases.

---

## Why Use Equinox Essentials?
Equinox Essentials is a one-stop utility library for Java developers. It eliminates the need for repetitive boilerplate code, improves development efficiency, and ensures adherence to modern programming practices. Whether you're working on data formatting, security, or random data generation, this library has you covered.

---

## Installation and Usage
1. Add the package to your project (details depend on your build system, e.g., Maven, Gradle).
2. Import the Essentials class.
3. Start utilizing the utilities without additional setup!

Example:

```java


boolean isEmail = Essentials.checker.isValidEmail(email);
```

---

## Technology Stack
- **Java**: Primary programming language (SDK version 21+).
- **Gson**: For JSON serialization/deserialization.
- **Java Security**: For encryption and hashing functionality.

---

### Have feedback or need assistance?
Feel free to contact AnotherCastaway for anything.


# Checker Class Documentation

The `Checker` class is part of the `com.equinox.equinox_essentials.source` package. It provides utility methods to validate common data formats, such as email addresses and numeric strings.

---

## Methods

### **isValidEmail(String email)**

#### Description:
Checks if the provided string is a valid email address.

#### Parameters:
- **email**: A `String` representing the email address to be validated.

#### Returns:
- **`boolean`**: 
  - `true` if the email address is valid.
  - `false` otherwise.

#### Usage:
```
java boolean isValid = Checker.isValidEmail("example@email.com"); System.out.println(isValid); // Output: true
``` 

---

### **isNumber(String input)**

#### Description:
Checks if the provided string is a valid representation of a number.

#### Parameters:
- **input**: A `String` representing the input to be validated.

#### Returns:
- **`boolean`**:
  - `true` if the input is a valid number.
  - `false` otherwise.

#### Usage:
```
java boolean isValidNumber = Checker.isNumber("123.45"); System.out.println(isValidNumber); // Output: true
``` 

---

## Examples

### Validate Email
```
java public class Main { public static void main(String[] args) { String email = "test@domain.com"; if (Checker.isValidEmail(email)) { System.out.println("Valid email address"); } else { System.out.println("Invalid email address"); } } }
``` 

### Check if a String is a Number
```
java public class Main { public static void main(String[] args) { String input = "42.0"; if (Checker.isNumber(input)) { System.out.println("The input is a number."); } else { System.out.println("The input is not a number."); } } }
``` 

---

### Notes:
- For `isValidEmail`, the method uses a regular expression to match the general format of email addresses.
- For `isNumber`, the method attempts to parse the input string into a `Double` and catches any `NumberFormatException`.

---
# Constants Class Documentation

The `Constants` class is part of the `com.equinox.equinox_essentials.source` package. It provides a collection of globally accessible constants that can be used across the application. These constants include common values, regular expression patterns, and ANSI escape codes for colors and formatting.

---

## Class Purpose

The `Constants` class acts as a central repository for commonly used values to promote reuse, maintain consistency, and prevent duplication across the codebase.

---

## Categories of Constants

### 1. **Mathematical Constants**
- **`GOLDEN_RATIO`**: Represents the mathematical golden ratio (approximately 1.618).

### 2. **Common Numerical Constants**
- Predefined values for timekeeping and durations:
    - **`SECONDS_IN_MINUTE`**: Number of seconds in a minute (60).
    - **`MINUTES_IN_HOUR`**: Number of minutes in an hour (60).
    - **`HOURS_IN_DAY`**: Number of hours in a day (24).
    - **`DAYS_IN_WEEK`**: Number of days in a week (7).
    - **`MONTHS_IN_YEAR`**: Number of months in a year (12).

### 3. **Regular Expression Patterns**
These patterns can be used for validating common data formats:
- **`EMAIL_PATTERN`**: Validates email addresses.
- **`PASSWORD_PATTERN`**: Ensures passwords meet complexity requirements, including:
    - At least one uppercase letter.
    - At least one lowercase letter.
    - At least one digit.
    - At least one special character.
    - No whitespace characters.
    - Minimum length requirement (8 characters).
- **`URL_PATTERN`**: Validates URLs with `http`, `https`, `ftp`, or `file` protocols.

### 4. **ANSI Escape Codes**
Color and formatting codes designed for console output:
- **Text colors**:
    - `ANSI_RED`, `ANSI_GREEN`, `ANSI_YELLOW`, `ANSI_BLUE`, `ANSI_CYAN`, `ANSI_PURPLE`, `ANSI_WHITE`, `ANSI_BLACK`
    - Example: Use `ANSI_RED` to display text in red.

- **Styles and formatting**:
    - `ANSI_BOLD`, `ANSI_ITALIC`, `ANSI_UNDERLINE`, `ANSI_BLINK`
    - Example: Use `ANSI_BOLD` for bold text rendering.

- **`ANSI_RESET`**: Resets all formatting to the console's default.

---

# Math Class Documentation

The `Math` class is part of the `com.equinox.equinox_essentials.source` package. It provides a set of general-purpose mathematical utilities, including calculations for clamping numbers, averages, prime checks, factorials, and more.

---

## Class Purpose

The `Math` class offers reusable mathematical methods for common operations that are not directly provided by the Java `Math` library or that bundle frequently needed logic.

---

## Methods

### 1. **`clampNum(double x, double y, double input)`**
Clamps a number between two bounds.
- **Parameters**:
    - `x`: The lower bound.
    - `y`: The upper bound.
    - `input`: The number to be clamped.
- **Returns**: The clamped value.
- **Example**:
  ```java
  double clampedValue = Math.clampNum(0, 10, 15); // Output: 10
  ```

### 2. **`average(double[] numbers)`**
Calculates the average of an array of numbers.
- **Parameters**:
    - `numbers`: A non-empty array of `double` values.
- **Returns**: The average value of the array.
- **Throws**:
    - `IllegalArgumentException` if the array is null or empty.
- **Example**:
  ```java
  double avg = Math.average(new double[]{1, 2, 3}); // Output: 2.0
  ```

### 3. **`isPrime(int number)`**
Checks if a number is a prime number.
- **Parameters**:
    - `number`: An integer to be checked.
- **Returns**: `true` if the number is prime, `false` otherwise.
- **Example**:
  ```java
  boolean isPrime = Math.isPrime(7); // Output: true
  ```

### 4. **`factorial(int n)`**
Calculates the factorial of a non-negative integer.
- **Parameters**:
    - `n`: A non-negative integer.
- **Returns**: The factorial of `n`.
- **Throws**:
    - `IllegalArgumentException` if `n` is negative.
- **Example**:
  ```java
  long fact = Math.factorial(5); // Output: 120
  ```

### 5. **`gcd(int a, int b)`**
Finds the greatest common divisor (GCD) of two integers using the Euclidean algorithm.
- **Parameters**:
    - `a` and `b`: The integers for which to find the GCD.
- **Returns**: The greatest common divisor.
- **Example**:
  ```java
  int gcdValue = Math.gcd(24, 18); // Output: 6
  ```

### 6. **`lcm(int a, int b)`**
Finds the least common multiple (LCM) of two integers.
- **Parameters**:
    - `a` and `b`: The integers for which to find the LCM.
- **Returns**: The least common multiple.
- **Example**:
  ```java
  int lcmValue = Math.lcm(4, 6); // Output: 12
  ```

### 7. **`power(double base, int exponent)`**
Calculates the result of raising a base to an integer exponent.
- **Parameters**:
    - `base`: The base value.
    - `exponent`: The power to which the base is raised. Can be negative.
- **Returns**: `base` raised to the power of `exponent`.
- **Example**:
  ```java
  double result = Math.power(2, 3); // Output: 8.0
  ```

---
# Logging Class Documentation

The `Logging` class is part of the `com.equinox.equinox_essentials.source` package. It provides utility methods for logging messages to the console and creating/updating visual progress bars. This class is useful for adding styled console outputs and visual feedback for long-running processes.

---

## Class Purpose

The `Logging` class serves the following purposes:
1. Provides methods to log messages categorized as `INFO`, `ERROR`, `WARNING`, and `VERBOSE`, with formatted and stylized console output using ANSI escape codes.
2. Offers the ability to create and update progress bars for real-time feedback in terminal-based applications.

---

## Methods

### 1. **`createProgressBar(String title, int total)`**
Initializes and displays a progress bar in the console.

#### Parameters:
- `title`: A `String` defining the title to display alongside the progress bar.
- `total`: An `int` specifying the total number of steps for the progress bar.

#### Behavior:
- Throws `IllegalArgumentException` if `total` is less than or equal to `0`.
- Displays a progress bar set to `0%`.

---

### 2. **`updateProgressBar(int current, int total)`**
Updates the progress bar to reflect the current progress.

#### Parameters:
- `current`: An `int` representing the current progress.
- `total`: An `int` representing the total number of steps for the progress bar.

#### Behavior:
- Throws `IllegalArgumentException` if `current` is less than `0`, `total` is less than or equal to `0`, or `current` exceeds `total`.
- Dynamically adjusts the progress bar to represent the current percentage completion.

---

### 3. **`logString(String string)`**
Logs a general informational message to the console.

#### Parameters:
- `string`: A `String` representing the message to be logged.

---

### 4. **`logError(String string)`**
Logs an error message to the console with red-colored formatting.

#### Parameters:
- `string`: A `String` representing the error message to be logged.

---

### 5. **`logWarning(String string)`**
Logs a warning message to the console with yellow-colored formatting.

#### Parameters:
- `string`: A `String` representing the warning message to be logged.

---

### 6. **`logVerbose(String string, boolean isVerbose)`**
Logs a verbose message to the console if verbosity is enabled.

#### Parameters:
- `string`: A `String` representing the log message.
- `isVerbose`: A `boolean` that determines whether the verbose message should be displayed.

---

## Notes
- Progress bars dynamically display progress using a combination of `█` for completed progress and `░` for the remaining portion.
- Logs are styled using ANSI escape codes:
    - Messages such as `ERROR`, `WARNING`, and `INFO` are given unique colors to distinguish their severity or type.
- Verbose logs can be conditionally enabled or disabled through the `isVerbose` parameter, making them ideal for debugging purposes.
- The methods in this class ensure console output remains clear, consistent, and easy to interpret.

---

# Convert Class Documentation

The `Convert` class is part of the `com.equinox.equinox_essentials.source` package. It provides utility methods for various data conversions, including string-to-primitive conversions, JSON serialization/deserialization, temperature, length, and weight conversions.

---

## Class Purpose

The `Convert` class centralizes common data transformation and conversion tasks, ensuring consistency, reuse, and reduced duplication across the codebase. It supports:
1. String-to-primitive conversions (`int`, `double`, `boolean`).
2. JSON-to-object and object-to-JSON transformations.
3. Unit conversions for temperature, length, and weight.

---

## Methods

### String-to-Primitive Conversions

#### 1. **`toInt(String input)`**
Converts a `String` to an `int`.
- Removes all non-numeric characters before attempting conversion.
- Throws `IllegalArgumentException` for null, empty, or invalid input.

#### 2. **`toDouble(String input)`**
Converts a `String` to a `double`.
- Throws `IllegalArgumentException` for null, empty, or invalid input.

#### 3. **`toBoolean(String input)`**
Converts a `String` to a `boolean`.
- Uses Java’s `Boolean.parseBoolean` method, converting the string to lowercase before parsing.

---

### JSON Serialization/Deserialization

#### 4. **`fromJson(String json, Class<T> classOf)`**
Deserializes a JSON `String` into an object of the specified class type.
- Throws `IllegalArgumentException` for malformed JSON or conversion issues.

#### 5. **`fromJson(String json, Type typeOf)`**
Deserializes a JSON `String` into an object of the specified generic type.
- Useful for handling more complex types such as collections.
- Throws `IllegalArgumentException` for malformed JSON or conversion issues.

#### 6. **`toJson(Object obj)`**
Serializes an object into a JSON `String`.

---

### Temperature Conversions

#### 7. **`celsiusToFahrenheit(double celsius)`**
Converts a temperature value from Celsius to Fahrenheit.

#### 8. **`fahrenheitToCelsius(double fahrenheit)`**
Converts a temperature value from Fahrenheit to Celsius.

#### 9. **`celsiusToKelvin(double celsius)`**
Converts a temperature value from Celsius to Kelvin.

#### 10. **`kelvinToCelsius(double kelvin)`**
Converts a temperature value from Kelvin to Celsius.

---

### Length Conversions

#### 11. **`metersToFeet(double meters)`**
Converts a length value from meters to feet.

#### 12. **`feetToMeters(double feet)`**
Converts a length value from feet to meters.

---

### Weight Conversions

#### 13. **`kilogramsToPounds(double kilograms)`**
Converts a weight value from kilograms to pounds.

#### 14. **`poundsToKilograms(double pounds)`**
Converts a weight value from pounds to kilograms.

---

## Notes
- The string-to-primitive methods (`toInt`, `toDouble`, `toBoolean`) ensure robust input validation and sanitize input before attempting conversions.
- JSON serialization and deserialization methods internally utilize the Gson library for efficient and flexible handling of JSON data.
- Unit conversion methods adhere to standard conversion formulas to ensure high precision.
- The methods are lightweight, stateless, and reusable, making the class an ideal choice for static or utility-style usage.

---

# Generators Class Documentation

The `Generators` class is part of the `com.equinox.equinox_essentials.source` package. It provides functionality for generating random values, such as random alphanumeric strings.

---

## Class Purpose

The `Generators` class is designed to simplify the creation of randomized data, which can be useful for various purposes such as test data generation, token creation, or random string generation.

---

## Methods

### 1. **`generateRandomString(int length)`**
Generates a random alphanumeric string of the specified length using a predefined character set.

#### Parameters:
- `length`: An `int` specifying the length of the random string to generate. Must be non-negative.

#### Returns:
- A randomly generated `String` composed of characters from the predefined set `ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789`.

#### Behavior:
- Throws `IllegalArgumentException` if the specified `length` is negative.
- Uses an internal instance of `Random` for randomness.

### 2. **`generateRandomName(boolean isMale)`**
Generates a random full name composed of a first name and a last name.

#### Parameters:
- `isMale`: A `boolean` specifying whether the generated first name should be male (`true`) or female (`false`).

#### Returns:
- A `String` containing the randomly generated full name.

#### Behavior:
- The first name is selected from a predefined list of male or female names based on the `isMale` parameter.
- The last name is randomly selected from a predefined list of last names.

---

### 3. **`getFirstName(boolean isMale)`**
Generates a random first name.

#### Parameters:
- `isMale`: A `boolean` specifying whether the first name should be male (`true`) or female (`false`).

#### Returns:
- A randomly selected `String` representing a first name from the predefined name lists.

---

### 4. **`getLastName()`**
Generates a random last name.

#### Parameters:
- None.

#### Returns:
- A randomly selected `String` representing a last name from the predefined last name list.
---

## Notes
- The `generateRandomString` method is efficient and produces reliably random strings suitable for most applications.
- The character set includes uppercase letters, lowercase letters, and digits, making it ideal for generating generic alphanumeric tokens, credentials, or identifiers.
- Ensure proper handling of exceptions if a negative length is passed.

---
# Getter Class Documentation

The `Getter` class is part of the `com.equinox.equinox_essentials.source` package. It provides utility methods for reading and writing JSON data to and from files.

---

## Class Purpose

The `Getter` class simplifies file-based JSON operations, offering methods to read JSON data into Java objects and write Java objects to JSON files. It leverages the Gson library for serialization and deserialization.

---

## Methods

### 1. **`readJson(String path)`**
Reads JSON data from a specified file and deserializes it into a generic Java object.

#### Parameters:
- `path`: A `String` specifying the path to the JSON file.

#### Returns:
- A generic `Object` containing the deserialized JSON data.

#### Behavior:
- Throws `RuntimeException` if an `IOException` occurs during file reading.

---

### 2. **`writeJson(String path, Object data)`**
Writes a Java object to a specified file as serialized JSON.

#### Parameters:
- `path`: A `String` specifying the path to write the JSON file to.
- `data`: An `Object` containing the data to serialize and write as JSON.

#### Behavior:
- Throws `RuntimeException` if an `IOException` occurs during file writing.

---

## Notes
- The `readJson` method deserializes JSON data into a generic Java object. If a more specific type is required, consider additional type handling or wrapping this method.
- The `writeJson` method serializes any Java object into JSON format, ensuring compatibility with Gson-supported types.
- Proper error handling is embedded in the methods to surface issues related to file operations (e.g., file not found, insufficient permissions, etc.).
- The file streams are automatically managed using the try-with-resources syntax to ensure resources are closed properly.

---
# Security Class Documentation

The `Security` class is part of the `com.equinox.equinox_essentials.source` package. It provides functionality for encryption, hashing, and assessing password security levels.

---

## Class Purpose

The `Security` class is designed to handle operations related to securing sensitive data, primarily through hashing and encryption techniques, as well as evaluating the complexity of passwords. It supports different security levels for versatile use cases, from basic hashing to fully encrypted transformations.

---

## Enums

### 1. **`securityLevels`**
Defines the available security levels for encryption:
- `HASH`: Basic hashing without salt or additional processing.
- `SALTED_HASH`: Hashing with a randomly generated salt for added security.
- `SHIFTED_HASH`: Hashing with both salt and character shifting.
- `FULLY_ENCRYPTED`: Combines salt, shifting, and multiple hashing operations for maximum security.

### 2. **`security`**
Represents password security levels:
- `NONE`: Password does not meet any security criteria.
- `LOW`: Password meets at least two criteria (e.g., uppercase/lowercase or digit/special character).
- `MEDIUM`: Password meets at least three criteria.
- `HIGH`: Password meets all criteria and is at least 12 characters long.

---

## Methods

### 1. **`encryptString(String input, securityLevels securityLevel, int shift)`**
Encrypts a string based on the specified security level.

#### Parameters:
- `input`: The `String` to be encrypted.
- `securityLevel`: A value from the `securityLevels` enum specifying the desired encryption level.
- `shift`: An `int` value used for character shifting (applicable for `SHIFTED_HASH` and `FULLY_ENCRYPTED` levels).

#### Returns:
- A `String[]` where:
    - `output[0]` contains the resulting encrypted string.
    - Additional indices may include:
        - Salt value (for `SALTED_HASH`, `SHIFTED_HASH`, or `FULLY_ENCRYPTED`).
        - Other intermediate values depending on the security level.

#### Behavior:
- Generates a random salt (for applicable levels).
- Uses the SHA-256 hashing algorithm for cryptographic hashing.
- Applies character shifting (for applicable levels).

#### Exceptions:
- Throws `RuntimeException` if the SHA-256 algorithm is unavailable.

---

### 2. **`bytesToHex(byte[] hash)`**
Converts a byte array into a hexadecimal-encoded string.

#### Parameters:
- `hash`: A `byte[]` containing the hash to be converted.

#### Returns:
- A `String` representing the hexadecimal value of the byte array.

---

### 3. **`shiftString(String input, int shift)`**
Applies a character shift to each character in the input string.

#### Parameters:
- `input`: The `String` to shift.
- `shift`: An `int` value indicating how much to shift each character.

#### Returns:
- A new `String` where each character has been shifted by the specified amount.

---

### 4. **`checkPasswordSecurity(String password)`**
Evaluates the security level of a given password.

#### Parameters:
- `password`: The `String` password to be evaluated.

#### Returns:
- A value from the `security` enum:
    - `NONE`, `LOW`, `MEDIUM`, or `HIGH`, based on the password's complexity and length.

#### Behavior:
- Checks for:
    - Presence of uppercase letters.
    - Presence of lowercase letters.
    - Presence of digits.
    - Presence of special characters.
- Evaluates security based on length and criteria satisfaction (as outlined in the `security` enum).

---

## Notes
- **Encryption Process**:
    - Handles varying levels of security through combinations of hashing, salting, shifting, and rehashing.
    - SHA-256 is used as the primary hashing algorithm, ensuring strong cryptographic security.
- **Password Evaluation**:
    - The strength of a password is determined by a combination of its length and character diversity.
    - Encourages users to create stronger passwords that meet higher security criteria.

- **Utility**:
    - The class is ideal for managing encryption and password security in applications requiring enhanced data protection.

---
