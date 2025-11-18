# Unit 2 - Data for Social Good Project

## Introduction

Software engineers develop programs to work with data and provide information to a user. Each user has different needs based on the information they are looking for from data. Your goal is to create a data analysis program for your user that stores and analyzes data to provide the information they need.

## Requirements

Use your knowledge of object-oriented programming, one-dimensional (1D) arrays, and algorithms to create your data analysis program:
- **Write a class** – Write a class to represent your user or business and store and analyze their data with no-argument and parameterized constructors.
- **Create at least two 1D arrays** – Create at least two 1D arrays to store the data that your user needs information about.
- **Write a method** – Write a method that finds or manipulates the elements in a 1D array to provide the information your user needs.
- **Implement a toString() method** – Write a toString() method that returns general information about the data (for example, number of values in the dataset).
- **Document your code** – Use comments to explain the purpose of the methods and code segments and note any preconditions and postconditions.

## User Story 

As a movie enthusiast, I want to find the most popular and well-liked movies so that I can recommend others a wide variety of movies that they can watch based on a movie rating survey and their popularity. I want to inform viewers of what popular movies can be recommended to both novices and movie enthusiasts, how many votes they got in the movie rating survey, and what year they were released.

## Dataset 

Dataset: https://www.kaggle.com/code/sasakitetsuya/movie-rating-analysis
- **Title** (String) - Title of the movie 
- **Popularity** (double) - Popularity of the movie
- **Year of Release** (int) - Year each movie was released
- **Vote Count** (int) - How many votes each movie got from a survey 

## UML Diagram 

![UML Diagram](<Screenshot 2025-11-17 141736.png>)

## Description 

For our Unit #2 project, my partner and I created an app that focuses on helping movie enthusiasts discover popular movies based on a dataset/survey containing movie titles, popularity, release years, and vote count. We used multiple 1D arrays to store each column of the dataset stored in text files, keeping all of the information aligned using matching indexes. These arrays were then used to construct Movie objects, which were stored in a larger Movie array that the rest of the program could manipulate and analyze. We used methods like filterProperty() to filter the data and identify the movies with high popularity ratings. This helps users know which films are worth watching or recommending. Lastly, we override the toString() method in the Movie class so that each Movie in the Movie array can be displayed in a clear, organized format.