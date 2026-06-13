# MadLibs Generator

A Java console application that creates interactive Mad Libs stories by replacing placeholder tags with user-provided words. The program parses a template sentence, prompts the user for replacements, and generates a completed story.

## Installation

1. Clone the repository:
```bash
git clone https://github.com/yourusername/madlibs-generator.git
```

2. Open the project in your preferred Java IDE.

3. Compile and run `MadLibsRunner.java`.

## Usage

```java
String phrase = "Roses are <adjective>, violets are <noun>, dont come to my <proper noun> anymore.";

MadLibs sentence = new MadLibs(phrase);

sentence.play();
```

### Sample Input

```text
adjective: blue
noun: pizza
proper noun: New Jersey
```

### Sample Output

```text
Roses are blue, violets are pizza, dont come to my New Jersey anymore.
```

## Features

- Detects placeholder tags enclosed in `< >`
- Prompts users for replacement words
- Dynamically generates unique stories
- Supports any number of placeholders in a template
- Demonstrates string parsing and manipulation techniques

## Concepts Used

- Object-Oriented Programming (OOP)
- Constructors
- String Manipulation (`indexOf()`, `substring()`)
- Loops (`while`)
- User Input (`Scanner`)
- Text Parsing Algorithms

## Author

Nimai Desai

## License

This project was created for educational purposes as part of PLTW Computer Science coursework.
