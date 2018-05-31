package com.training.cucumber;

import com.training.cucumber.drivers.DriverFactory;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {



    DriverFactory driverFactory=new DriverFactory();

    @Before
    public void setUp(){
        driverFactory.openBrowser();
        driverFactory.navigate("http://www.argos.co.uk");
        driverFactory.maxWindow();
        driverFactory.applyImpWait();

    }

    @After
    public void tearDown(){
        driverFactory.closeBrowser();
    }

}




