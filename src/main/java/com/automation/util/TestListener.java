package com.automation.util;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
		ashot.shootingStrategy(ShootingStrategies.viewportPasting(2000));
		Screenshot sc = ashot.takeScreenshot(UIKeywords.getInstance().driver);
		BufferedImage bs = sc.getImage();
		String dir = System.getProperty("user.dir");
		try {
			
			/*ImageIO.write(bs, "png", new File(dir + "/Screenshots/" + result.getName() + ".png"));
			
			 
			 ImageIO.write(bs, "png", new File(dir+"/screenshots_"+timestamp()+".png"));
			*/
			Date date = new Date();
			SimpleDateFormat formatter = new SimpleDateFormat("dd-M-yyyy-hh-mm-ss");
			String strDate = formatter.format(date);
			System.out.println("dir:" + dir);
			String fileName = dir + "/Screenshots/" + "/screenshots_" + strDate + ".jpg";
			ImageIO.write(bs, "jpg", new File(fileName));
			LOG.info("ScreenShot is Save Successfully");
		} catch (IOException e) {
			LOG.info("Unable to TakeScreenShot");
			e.printStackTrace();
		}
	}

	public static String timestamp() {
		return new SimpleDateFormat("yyyy:MM:dd HH:mm:ss").format(new Date());
	}
}
