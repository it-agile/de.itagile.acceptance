# [it-agile](https://www.it-agile.de) ATDD Java example start project for [cucumber](https://cucumber.io/docs/cucumber/) and [selenium](https://www.selenium.dev/documentation/en/) with [gradle](https://gradle.org/install/)

## Update webdriver for [Selenium](https://www.selenium.dev/documentation/en/)
 1. Find out Browser Version
 2. Download suitable WebDriver for [Chrome](https://sites.google.com/a/chromium.org/chromedriver/downloads) or [Firefox](https://github.com/mozilla/geckodriver/releases/)
 4. Put the webdriver into `src/test/resources`
 3. Maybe you need to make the WebDriver-File executable
 
For Safari you need to find `/usr/bin/safaridriver` on your mac and execute `safaridriver --enable`

## Using specific webdriver
* Change the webdriver initialization in `WebDriverWrapper.java`
    - `new ChromeDriver()`  (using chromedriver)
    - `new FirefoxDriver()` (using geckodriver)
    - `new SafariDriver()` (using safaridriver)

## Running [Cucumber](https://cucumber.io/docs/cucumber/) Tests
* From inside the IDE: `RunAllFeatures.java` as JUnit-Test
* From inside the console: `./gradlew` or `gradlew.bat`

## Ignoring [Cucumber](https://cucumber.io/docs/cucumber/) Tests
* Use the tag `@ignore` in the feature file, so that a scenario is not executed. You can specifiy your own tags 
    - in the `build.gradle` and 
    - in the `RunAllFeatures.java`

## Generating [Cucumber](https://cucumber.io/docs/cucumber/) Reports
* Cucumber reports are generated. 
* If a scenario fails, a screenshot of the current webpage is embeded into the report. See in `Hooks.java` at `@After`.
* For changing, if reports should be generated when running from 
    - console, look in `build.gradle` at `'--plugin' = 'html:...'` and 
    - within the IDE, look in `RunAllFeatures.java` at `@CucumberOptions`

## IDE Cucumber Plugins
* [Eclipse](https://www.eclipse.org/downloads/)
    - Install [Eclipse Cucumber Plugin](https://marketplace.eclipse.org/content/cucumber-eclipse-plugin) via Eclipse Marketplace
    - Convert project nature to Cucumber project nature: Configure => "Convert to Cucumber Project"
* [IntelliJ](https://www.jetbrains.com/de-de/idea/)
    - Install [Cucumber for Java](https://plugins.jetbrains.com/plugin/7212-cucumber-for-java)