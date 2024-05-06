VARSITY COLLEGE

IMAD5112 ICE TASK 5

NAME: XOLILE NGONO

STUDENT NUMBER: ST10460324

COURSE: IMAD5112

1\. **<u>PURPOSE</u>**

The app's purpose is to serve as a digital pet simulator designed for
entertainment and educational purposes. In which you will be nurturing a
virtual pet, users engage in a fun and interactive experience that also
teaches responsibility, time management and empathy. Through feeding,
playing, and caring for their virtual companion, the user also learns
about the importance of attending to the needs of another being.

**<u>2. DESIGN CONSIDERATIONS</u>**

<img src="/media/image.png" style="width:2.40659in;height:4.20892in" />

**<u>GENERAL DESIGN</u>**

The design does suit the user because the app will be used by children
and children love games and cartoons, so I used a picture of a dog from
a cartoon to catch their attention and have more interest on the app and
yes, the picture does attract children cause which child does not love
puppies

**<u>INTUITIVE DESIGN</u>**

The design is quite easy to follow from top to bottom cause when you
enter the app u come across the interface of the app which is an
introduction sentence and a picture going hand in hand with the picture,
you will come across a get started button which when clicked, it will
take you to the homepage and will show you all the things that can be
done to the dog

**<u>CONTENT PRIORITISATION</u>**

Yes, I did include the necessary interfaces elements language is English
so they can understand and used proper colors, so it catches their
attention and used proper pictures of what my app is all about

**<u>LEGIBLE TEXT CONTENT</u>**

The font I used is extremely easy to see and is readable even for
children with eye problem the font is an Aptos body font which is very
visible, and the word text is large enough to be seen and read

**<u>MAKE INTERFACE ELEMENTS CLEARLY VISIBLE</u>**

On my app with distinct icons for different actions spaced apart with
enough padding to avoid confusion and clear labels for each element so
you can see and avoid overcrowding things.

**<u>HAND POSITION CONTROLS</u>**

On my app the action button is positioned at bottom of the screen,
allowing the users to easily reach it with their thumb while holding the
device.

**<u>IMAGES</u>**

The reason I chose that picture was because it provides immediate visual
context to users setting the tone for the content and subject matter of
the app and it helps users to understand what the app is about at first
glance making it more visually appealing and memorable for users.

**3. GITHUB AND GITHUB ACTIONS**

[**https://github.com/st10460324/maxi..git**](https://github.com/st10460324/maxi..git)

**<u>1. Create a New GitHub Repository:</u>**

1.  Go to the GitHub website
    ([<u>https://github.com/</u>](https://github.com/)) and sign in to
    your account.

2.  Click on the "+" icon in the top right corner and select "New
    repository".

3.  Give your repository a name (your student number and name â€“ in one
    word), add a description (use IMAD5112 Assignment 2) and choose
    public.

4.  Click on the "Create repository" button.  
      
      
      
    **<u>2. Initialise the Repository with a README File</u>:**

<!-- -->

1.  After creating the repository, you'll see an option to "Initialize
    this repository with a README". Check this option to create a README
    file.

2.  Click on the "Create repository" button to finalize the creation of
    the repository.  
      
      
      
    **<u>3. Commit and Push Your Project Files to the GitHub
    Repository:</u>**

<!-- -->

1.  In Android Studio, go to VCS (Version Control System) -> Import into
    Version Control -> Share Project on GitHub.

2.  Log in to your GitHub account if prompted, and select the repository
    you created earlier.

3.  Click on the "Share" button to push your project files to the GitHub
    repository.  
      
      
      
    **<u>4. Regularly Commit and Push Your Code as You Make
    Progress:</u>**

<!-- -->

1.  After the initial push, continue making changes to your project in
    Android Studio.

2.  Whenever you make significant progress or changes, commit your
    changes locally in Android Studio using VCS -> Commit Changes.

3.  Once committed, push your changes to the GitHub repository using VCS
    ->Git -> Push.

4.  Testing and Automated Testing:  
      
      
      
    **<u>1. Conduct Manual Testing</u>:**

<!-- -->

1.  Manually test your app to ensure it functions seamlessly and offers
    an enjoyable educational experience for learners.

2.  To test various features and user interactions do the following:  
      
      
      
    **<u>1. Create a New Test Class</u>:**

<!-- -->

1.  In your Android project, navigate to the tests directory (or create
    it if it doesn't exist).

2.  Create a new Kotlin file for your test class. Name it appropriately
    to indicate what component or functionality you are testing.  
      
      
      
    **<u>2. Write Test Methods</u>:**

<!-- -->

1.  Inside the test class, write test methods like the example below.  
      
      
      
    **<u>3. Use assertions to verify the expected behaviour of your
    code.</u>**  
      
      
      
    **<u>4. Run the Tests</u>:**

<!-- -->

1.  Run the tests using the testing framework's tools provided by
    Android Studio or through the command line.  
      
      
      
    Sample of a test class using JUnit:  
      
      
      
    import org.junit.Assert.\*  
      
      
      
    import org.junit.Test  
      
      
      
    class MyUnitTest {  
      
      
      
    @Test  
      
      
      
    fun testWhenStatement() {  
      
      
      
    // Test case for a when statement  
      
      
      
    val result = when (25) {  
      
      
      
    95 -> "Nelson Mandela, famous for â€¦, died at this age" // your own
    wording (copy from your code) â€“ only need 3 ages from your code for
    the test here.  
      
      
      
    30 -> "steve biko, famous for â€¦â€¦., died at this age"  
      
      
      
    25 -> "tupac, famous for â€¦..., died at this age"  
      
      
      
    else -> "Nobody famous known to me died at this age"  
      
      
      
    }  
      
      
      
    assertEquals("Nobody famous known to me died at this age", result)  
      
      
      
    }  
      
      
      
    }  
      
      
      
    **<u>2. GitHub Actions for Automated Testing</u>**:

<!-- -->

1.  Set up GitHub Actions to automatically run tests and build your code
    whenever changes are pushed to the repository.

2.  Create a GitHub Actions workflow (.github/workflows/tests.yml) to
    run tests automatically on every push:

3.  Create a .github/workflows directory in your project repository.

4.  Inside this directory, create YAML files defining your GitHub
    Actions workflows for testing and building.  
      
      
      
    Sample GitHub Actions Workflow for Testing (tests.yml):  
      
      
      
    name: Run Tests  
      
      
      
    on: \[push\]  
      
      
      
    jobs:  
      
      
      
    test:  
      
      
      
    runs-on: ubuntu-latest  
      
      
      
    steps:  
      
      
      
    - name: Set up JDK  
      
      
      
    uses: actions/setup-java@v2  
      
      
      
    with:  
      
      
      
    distribution: 'adopt'  
      
      
      
    java-version: '11'  
      
      
      
    - name: Check out code  
      
      
      
    uses: actions/checkout@v2  
      
      
      
    - name: Build and test  
      
      
      
    run: ./gradlew test  
      
      
      
    Set Up Automated Build:  
      
      
      
    Create a GitHub Actions workflow (.github/workflows/build.yml) to
    build the APK automatically on every push.  
      
      
      
    Sample GitHub Actions Workflow for Building (build.yml):  
      
      
      
    name: Build APK  
      
      
      
    on: \[push\]  
      
      
      
    jobs:  
      
      
      
    build:  
      
      
      
    runs-on: ubuntu-latest  
      
      
      
    steps:  
      
      
      
    - name: Set up JDK  
      
      
      
    uses: actions/setup-java@v2  
      
      
      
    with:  
      
      
      
    distribution: 'adopt'  
      
      
      
    java-version: '11'  
      
      
      
    - name: Check out code  
      
      
      
    uses: actions/checkout@v2  
      
      
      
    - name: Build APK  
      
      
      
    run: ./gradlew assembleDebug  
      
      
      
    Test your workflows by pushing changes to your repository and
    observing the actions running in the "Actions" tab on GitHub.

**4 .YOUTUBE LINK**

[**https://eur03.safelinks.protection.outlook.com/?url=https%3A%2F%2Fyoutu.be%2FWjftj8ZNspo%3Fsi%3DnigHbAv3dOyu9Klx&data=05%7C02%7CST10460324%40vcconnect.edu.za%7Ca907f7f1ec23452ba9c108dc6d27294e%7Ce10c8f44f469448fbc0dd781288ff01b%7C0%7C0%7C638505262197658215%7CUnknown%7CTWFpbGZsb3d8eyJWIjoiMC4wLjAwMDAiLCJQIjoiV2luMzIiLCJBTiI6Ik1haWwiLCJXVCI6Mn0%3D%7C0%7C%7C%7C&sdata=ZoWInTr%2BFElUcFH2OiXVC%2BswwFfR%2FU6zVR2jKuf%2BU6U%3D&reserved=0**](https://eur03.safelinks.protection.outlook.com/?url=https%3A%2F%2Fyoutu.be%2FWjftj8ZNspo%3Fsi%3DnigHbAv3dOyu9Klx&data=05%7C02%7CST10460324%40vcconnect.edu.za%7Ca907f7f1ec23452ba9c108dc6d27294e%7Ce10c8f44f469448fbc0dd781288ff01b%7C0%7C0%7C638505262197658215%7CUnknown%7CTWFpbGZsb3d8eyJWIjoiMC4wLjAwMDAiLCJQIjoiV2luMzIiLCJBTiI6Ik1haWwiLCJXVCI6Mn0%3D%7C0%7C%7C%7C&sdata=ZoWInTr%2BFElUcFH2OiXVC%2BswwFfR%2FU6zVR2jKuf%2BU6U%3D&reserved=0)

**5. CODE**

**MAINACTIVIY**

package com.st10460324.maxi

import android.content.Intent

import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle

import android.widget.Button

class MainActivity : AppCompatActivity() {

override fun onCreate(savedInstanceState: Bundle?) {

super.onCreate(savedInstanceState)

setContentView(R.layout.activity_main)

class MainActivity : AppCompatActivity() {

override fun onCreate(savedInstanceState: Bundle?) {

super.onCreate(savedInstanceState)

setContentView(R.layout.activity_main)

//Button to navigate to the second screen

val startButton = findViewById\<Button>(R.id.startButton)

startButton.setOnClickListener{

val intent = Intent(this, MainActivity2::class.java)

//MainActivity2:name of the second activity

//pass the message "I am hungry" as an extra with the intent

intent.putExtra("FEED_MESSAGE","I am hungry")//This will be shown in the
feedTextView

startActivity(intent)

}

}

}

**MAINACTIVITY 2**

package com.st10460324.maxi

import android.annotation.SuppressLint

import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle

import android.os.CountDownTimer

import android.widget.Button

import android.widget.ImageView

import android.widget.ProgressBar

import android.widget.TextView

class MainActivity2 : AppCompatActivity() {

override fun onCreate(savedInstanceState: Bundle?) {

super.onCreate(savedInstanceState)

setContentView(R.layout.activity_main2)

class Page2 : AppCompatActivity() {

private lateinit var progressBar: ProgressBar

private lateinit var timer: CountDownTimer

@SuppressLint("MissingInflatedId", "SetTextI18n")

override fun onCreate(savedInstanceState: Bundle?) {

super.onCreate(savedInstanceState)

setContentView(R.layout.activity_main2)

val feedButton = findViewById\<Button>(R.id.FeedButton)

val playButton = findViewById\<Button>(R.id.playButton)

val cleanButton = findViewById\<Button>(R.id.cleanButton)

val welcome = findViewById\<ImageView>(R.id.petImageView)

val feedTextView = findViewById\<TextView>(R.id.feedTextView)

val playTextView = findViewById\<TextView>(R.id.playTextView)

val cleanTextView = findViewById\<TextView>(R.id.cleanTextView)

progressBar = findViewById(R.id.progressBarFeed)

timer = object : CountDownTimer(10000,100) {

override fun onTick(millisUntilFinished: Long) {

val progress = (100 \* (millisUntilFinished / 10000.0f)).toInt()

progressBar.progress = progress

}

override fun onFinish() {

}

}

timer.start()

feedButton.setOnClickListener {

welcome.setImageResource(R.drawable.eating)

feedTextView.text = "please feed me"

}

playButton.setOnClickListener {

welcome.setImageResource(R.drawable.playing)

playTextView.text = "please play with me"

}

cleanButton.setOnClickListener {

welcome.setImageResource(R.drawable.bathing)

cleanTextView.text = "please give me a bath"

}

}

}

}

**6.REFERENCES**

-   Ngono.XN(2024)

-   Varsity college. (2024). Introduction to Mobile Application
    Development. In Module Manual 2024(pp,39-45). IIE Module Manual.

-   Google for Developers - from AI and Cloud to Mobile and Web.â€
    *Google for Developers*, developers.google.com/. Accessed 6 May
    2024.

-   <https://youtu.be/l8lmtec4ReQ?si=wB0W1Z1PoXflO2Ow>

-   <https://youtube.com/@programmingwithmosh?si=LY9nSMFITk4t-E2>
