"# E-CommerceTest" 

Selenium - Automation using Eclipse.
Configuration

Download Selenium client & Web driver Language Bindings for java www.seleniumhq.org/download/
Download geckodriver for firefox from https://github.com/mozilla/geckodriver/releases OR chromedriver for chrome jar from https://sites.google.com/a/chromium.org/chromedriver/
Add jars to external library on java project follow this link http://toolsqa.com/selenium-webdriver/configure-eclipse-with-selenium-webdriver/
Install TestNG plugin, follow this link (find "how to install" from README.md) https://github.com/cbeust/testng-eclipse/
Setup example for:
Firefox driver:

System.setProperty("webdriver.gecko.driver", "C:\\pathto\\my\\geckodriver.exe");
driver = new FirefoxDriver();
driver.get("http://www.google.com");
driver.quit();
Chrome driver:

System.setProperty("webdriver.chrome.driver", "C:\\pathto\\my\\chromedriver.exe")
WebDriver driver = new ChromeDriver();
driver.get("http://www.google.com");
driver.quit();
Selenium Script

Selenium script can be found in this link: http://www.guru99.com/accessing-forms-in-webdriver.html
Exception / error handling can be found from this link : http://toolsqa.com/selenium-webdriver/exception-handling-selenium-webdriver/
For full screenshot https://www.assertthat.com/posts/selenium_shutterbug_make_custom_screenshots_with_selenium_webdriver, the jars file can be found in http://search.maven.org/#search%7Cga%7C1%7Ca%3A%22selenium-shutterbug%22
