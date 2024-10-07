"# HirakGoswami_CONSTRUCTWEEK_APPIUM_JAVA_JS_APITESTING" 

# API Testing with REST Assured

## Introduction
Validate the Post Hook API endpoints using REST Assured.

## Project Type
API Testing

## REQUESTS
https://app.beeceptor.com/mock-server/posthook-api

## Video Walkthrough of the project
https://youtu.be/7q2cDMy9-5U

## Video Walkthrough of the codebase
https://youtu.be/7pFCCkgxKBU

## Features
Schedule a Hook: Implement a POST request to schedule a hook and validate the response.
Get Hooks: Send a GET request to fetch all hooks and validate the response.
Get a Hook by ID: Implement a GET request for a specific hook and validate the response.
Update Hook: Implement a PUT request to update an existing hook and validate the response.
Delete Hook by ID: Send a DELETE request to remove a hook by its ID and validate the removal.

## Installation & Getting started
Set up the Project:
Use Spring Tool Suite or Eclipse to create a new Maven project, which will serve as the base for the API testing framework.
Add Dependencies:
Add the REST Assured dependencies to the pom.xml 

## Credentials
Provide user credentials for autheticated pages

## APIs Used
BaseURL - https://posthook-api.mock.beeceptor.com


## API Endpoints
endPoint1 - /v1/hooks
endPoint2 - /v1/hooks
endPoint3 - /v1/hooks/{hook_id}
endPoint4 - /v1/hooks/{hook_id}
endPoint5 - /v1/projects/


# Mobile App Testing with Appium (Java)

## Introduction
Automate the testing of the Mx Player mobile app using Appium with Java.

## Project Type
SDET

## App
https://apkpure.com/mx-player/com.mxtech.videoplayer.ad/downloading
// MXPlayer.apk (after rename)

## Video Walkthrough of the project
https://youtu.be/7q2cDMy9-5U

## Video Walkthrough of the codebase
https://youtu.be/7pFCCkgxKBU

## Features
Launch the app using Appium.
Perform the following actions:
	Touch, tap, scroll, drag, and drop within the app.
	Enable and disable the battery saver using the notification panel.
	Switch to another app, copy some text, return to the Mx Player app, and navigate back to the home screen.

## Installation & Getting started
Install Appium:
	Set up and install Appium on your system. Ensure the Appium server is running to enable mobile automation.
Download the Mx Player App:
	Download the app either from the Google Play Store or via this link:
	https://apkpure.com/mx-player/com.mxtech.videoplayer.ad/downloading 


# Mobile App Testing with WebdriverIO

## Introduction
Automate the testing of the Mx Player mobile app using WebdriverIO with Appium.

## Project Type
SDET

## App
https://apkpure.com/mx-player/com.mxtech.videoplayer.ad/downloading
// MXPlayer.apk (after rename)

## Video Walkthrough of the project
https://youtu.be/7q2cDMy9-5U

## Video Walkthrough of the codebase
https://youtu.be/7pFCCkgxKBU

## Features
Automate actions such as:
	Tapping, scrolling, and sending keys using the locators retrieved from Appium Inspector.
	Switching to another app, copying text,and returning to the Mx Player app.
	Open Notifications, Clear notifications.

## Installation & Getting started
Set up the Environment:
	Install Appium globally and run the server.
	Download the Mx Player app (as done in Task 2) and install it on your emulator or real device.
Configure WebdriverIO:
	Run the WebdriverIO configuration command to set up the project:
	Configure WDIO to use Appium as the service and update the wdio.conf.js file to set up Android device capabilities.
Use Appium Inspector:
	Utilise Appium Inspector to find element locators in the Mx Player app.



