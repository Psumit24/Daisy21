package com.automation.util;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.log4j.Logger;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.automation.keywords.UIKeywords;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class TestListener implements ITestListener {
	private static final Logger LOG = Logger.getLogger(TestListener.class);

	@Override
	public void onTestFailure(ITestResult result) {
		AShot ashot = new AShot();
		LOG.info("TakeScreenShot While Test Case Failed..");
		ashot.shootingStrategy(ShootingStrategies.viewportPasting(200));
		Screenshot sc = ashot.takeScreenshot(UIKeywords.getInstance().driver);
		BufferedImage bs = sc.getImage();
		String dir = System.getProperty("user.dir");
		try {
			ImageIO.write(bs, "png", new File(dir + "/Screenshots/" + result.getName() + ".png"));
			LOG.info("ScreenShot is Save Successfully");
		} catch (IOException e) {
			LOG.info("Unable to TakeScreenShot");
			e.printStackTrace();
		}
	}
}
