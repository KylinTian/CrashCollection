# Description

	# English
	Collect Android application crash infos and store in file.
	This Repository is created for collecting android crash infos while your application crashing.
	It collectes infos including device infos, current time, crash stack infos and so on.

	# 中文
	Android应用crash信息收集并存储在手机文件中.
	当Android应用发生crash时，开发者需要获取crash发生时刻的堆栈信息.
	该项目是用来收集应用crash信息.包括设备信息、当前时间、crash堆栈信息和其他相关信息.

# How to use

	1.AndroidManifest permission
		<!-- Read and write sd card permission -->
		<uses-permission android:name="android.permission.READ_EXTERNAL_STORAGE" />
		<uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE" />
		
	2.CrashHandler.java & PathUtils.java
		Copy these two files to your project.
		PathUtils.java is used to define crash file path.
		CrashHandler.java is used to collect and store crash info while application crashed.

	3.Application init
		CrashHandler crashHandler = CrashHandler.getInstance();
        	crashHandler.init(this);

	4.Crash info store path
		Default crash file path: /CrashCollection/crash/
		You can modify crash info file in PathUtils.java
