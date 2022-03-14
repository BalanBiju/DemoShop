/*
	This is the Geb configuration file.
	See: http://www.gebish.org/manual/current/#configuration
*/


import com.aoe.gebspockreports.GebReportingListener
import io.github.bonigarcia.wdm.managers.ChromeDriverManager
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions

waiting {
    timeout = 20
    retryInterval = 0.005
    presets {
        veryQuick {
            timeout = 5
            retryInterval = 0.005
        }
        quick {
            timeout = 15
            retryInterval = 0.005
        }
        slow {
            timeout = 30
            retryInterval = 0.5
        }
        verySlow {
            timeout = 60
            retryInterval = 0.5
        }
    }
}
atCheckWaiting = true
baseNavigatorWaiting = true
cacheDriverPerThread = true

//reportingListener = new GebReportingListener()

//reportsDir = System.getProperty("geb.build.reportsDir", "report")
//reportsDir=System.getProperty("geb.build.reportsDir","build/reports/geb")


driver = {
    ChromeDriverManager.getInstance(ChromeDriver).setup();
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--disable-extensions");
    options.addArguments("--disable-notifications");
    options.addArguments("disable-infobars");
    def driver = new ChromeDriver(options)

    driver.manage().window().maximize()
    return driver;
}


baseUrl = System.getProperty("geb.build.baseUrl", "https://testscriptdemo.com/")