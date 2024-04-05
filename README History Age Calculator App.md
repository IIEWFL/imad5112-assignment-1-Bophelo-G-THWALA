HISTORY AGE CALCULATOR APP READ ME FILE.md 

 

HELLO THERE! 

  

WELCOME TO THE HISTORY AGE CALCULATOR APP 

 

The “History Age Calculator App” is an app that is mostly designed to capture the age of any person who uses the app. 

 

The app can be used for educational purposes when finding your age related to the historical figure that died the same age you are currently in as the celebrity age 

 

This app can serve the purpose of entering “The Current Year” and the year you, (yes you) can also enter the year you were born or also known as your “Year of Birth". 

 

  

Moreover, as you access the app do not forget to enter the current year e.g., 2024, 2023 or even 2025, etc. (Just use the year “2024” as your current year, since 2024 is the current year as I am writing this READ ME file and when the app was made) or you can even enter the year “2023”, as long as when you enter the “Current Year” with the “Year of Birth" (the year you were born), they align together to make the result (your current age) more accurate. 

 

However, you can use any year as your current year but use the correct current year. You can check your calendar to see what your current year is as it is important to use the correct “Current Year” when entering the year on the “Current year” slot along with the year you were born (Your Birth Year) to get an accurate statement of how old you are. 

 

E.g. If you enter the Current Year 2024 and your Year of Birth (The year you were born), 

 

The output along with the message will display in this format: 

“Your age is ... (Age number produced/output).” 

 

 

If your current age is the same age as any historical figure mentioned on the application, the result (Age Result) will display the message with your “current age” and the historical figure’s full name, what they were known as or known for and maybe also how they died or the message will not display the historical figure’s cause of death. 

 

E.g. "Current Year" = 2024 - "Year of Birth" = 1929 

(Using the formula, Current Year – Year of Birth) 

Result/Output = 95 

Result Message = “Your age is 95, same age as Nelson Mandela, a political freedom fighter against apartheid and became the first president of South Africa.”  

 

 

The Features of the app exactly entails: 

 

A UI (User Interface) that consists of: 

 

A Basic / Simple Colored Background (color: Orange) - could not upload any images to use as a background for the UI. 

 

A Basic Visual Title with the words: “Welcome to the history Age calculator”. 

 

"Current year" Number (whole number) slot with the hint: “Enter Current Year”.  

 

"Year of birth" Number (whole number) slot with the hint: “Enter Year of Birth”. 

 

A "Calculate" Button that can display the result you want, with a click of the button. 

 

A result text that displays a message after the "Calculate" Button is clicked on. 

 

 

Coding for the app consists of:  

 

UI features declared variables in (Kotlin programming language) in the code folder (Main Activity kt.)

E.G. val  Current Year = findViewById<EditText>(R.id.Current Year).text 

 

Codes that make the calculate button work, able to calculate your age. 

Such as: 

 

Code that has a formula entailing: 

val Answer = Current Year.toString().toDouble() – Year of Birth .toString().toDouble()

AgeResult.text = "Your age is ${Answer.toString()}."

 

If statements that can handle any error that the user inserts on the slots such as low or high age. 

 

For example, if your result displays an age number that is below 20, the message for the result shows as follows:  

“Your age is too low, please make sure your age(result) is above 20.” 

 

E.g. Entered Current Year = 2024 and Entered Year of Birth = 2005 

(Using the formula, Current Year – Year of Birth) 

The Result/Output = 19 

Result Message = “Your age is too low, please make sure your age is above 20.” 

 

OR  

 

if your result displays an age number that is above 100, the message for the result shows as follows:  

“Your age is too high, please make sure your age(result) is below 100.” 

 

E.g. Entered Current Year = 2024 and Entered Year of Birth = 1923 

(Using the formula, Current Year – Year of Birth) 

The Result/Output = 101 

Result Message = “Your age is too high, please make sure your age is below 100.” 

 

If your age result is the same as the Historical Figures listed below: 

 

Tupac SHAKUR - American rapper. (Died at age 25) from being fatally shot and wounded eventually dying to these causes.

Photo available at: https://www.chipublib.org/blogs/post/top-picks-tupac-shakur/

 

Jesus CHRIST - The Son of God. (Died at age 33) from being crucified. 

Photo available at: https://en.wikipedia.org/wiki/Outline_of_Jesus

 

Wolfgang MOZART - Austrian Composer. (Died at age 35) from a Cerebral hemorrhage. 

Photo available at: https://www.britannica.com/biography/Wolfgang-Amadeus-Mozart

 

Martin Luther King Jr. - American minister and activist. (Died at age 39) by being assassinated.

Photo available at: https://www.britannica.com/biography/Martin-Luther-King-Jr



 Kobe BRYANT - American Basketball Player. (Died at age 41) from a helicopter crash he did not survive. 

 Photo available at: https://www.biography.com/athletes/kobe-bryant

 

Elvis PRESLEY- American Singer and Actor. (Died at age 42) from a heart attack.

Photo available at: https://www.britannica.com/biography/Elvis-Presley

 

Freddie MERCURY - British Singer and Songwriter. (Died at age 45) from contracting HIV and AIDS virus.

Photo available at: https://www.britannica.com/biography/Freddie-Mercury

 

John F KENNEDY - Thirty- Fifth president of the United States of America. (Died at age 46) from an assassination.

Photo available at: https://www.britannica.com/biography/John-F-Kennedy

 

Napoleon BONAPARTE - Former emperor of France. (Died at age 51) from Stomach Cancer.

Photo available at: https://www.britannica.com/biography/Napoleon-I

 

William SHAKESPEARE - English playwright and poet. (Died at age 52) from Syphilis.

Photo available at: https://www.biography.com/authors-writers/william-shakespeare

 

Abraham LINCOLN Sixteenth president of the United States of America. (Died at age 56) from being assassinated.

Photo available at: https://www.britannica.com/biography/Abraham-Lincoln

 

Leonardo da VINCI - Italian polymath and inventor. (Died at age 67) from a stroke.

Photo available at: https://www.biography.com/artists/leonardo-da-vinci

 

Mahatma GANDHI - Indian lawyer and activist. (Died at age 78) from being assassinated. 

Photo available at: https://www.history.com/topics/asian-history/mahatma-gandhi

 

Benjamin FRANKLIN - One of the founding fathers of America. (Died at age 84) from pleurisy. 

Photo available at: https://www.britannica.com/biography/Benjamin-Franklin

 

Nelson MANDELA - Political freedom fighter against apartheid and the first. (Died at age 95) from a prolonged respiratory infection.

Photo available at: https://www.britannica.com/biography/Nelson-Mandela

 

Queen ELIZABETH II - Former Queen of England. (Died at age 98) from natural causes. 

Photo available at: https://www.biography.com/royalty/queen-elizabeth-ii

 

And you entered your “Current Year” and “Year of Birth”, the message on  

 

Age Result message will display as follows: 

 

“Your age is (age), same age as (Historical figure mentioned above), (what they were known for and maybe their cause of death). 

 

In Conclusion, please enter the current year as 2023 or 2024 and the year you were born and watch the result/output display along with your result message.  

(Follow the instructions written above this conclusion) & 

The Demonstration Video can be found or is available at You Tube

https://youtu.be/HknYUU-jg98

(Also found at "REFERENCES")

 
ENJOY THE APP AND GET EDUCATED, CHEERS!!! 

 

REFERENCES 

 
// Code Attribution 

Nelson MANDELA cause of death and death age. 

 
// This Method was taken from History 

 
// Link 

https://www.history.com/this-day-in-history/nelson-mandela-death-2013 

 
// Author’s Name 

History Editors 

https://www.history.com/author/history 

 

 // Code Attribution  

Historical Figures 

 
// This Method was taken from YouTube 

 
// Link 

https://youtu.be/CwrPV-FwLTE?si=E6Bjqiktt7M3zpVo 


// Author’s Name  

Pure 	Data Comparison 

 
// Code Attribution 

Demonstration Video 

 
// This Method was taken from You Tube 

 
// Link 

https://youtu.be/HknYUU-jg98 

 
// Author’s Name 

Bophelo Thwala 

 

 
// Code Attribution 

Age Calculator Formula 

 
// This Method was taken from Cue Math 

 
// Link 

https://www.cuemath.com/calculators/age-calculator/ 

 
// Author’s Name 

Cue Math 

 
 
 
 // Code Attribution 

if, else conditions in Kotlin in Android Studio 

 
// This Method was taken from Stack Overflow 

 
// Link 

https://stackoverflow.com/questions/32035922/android-studio-if-else-conditions 

 
// Author’s Name 

deezy 

 
// Author’s Profile 

https://stackoverflow.com/users/5081412/deezy 

 

 
Written by Bophelo Thwala (ST10446904) 

 


