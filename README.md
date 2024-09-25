Very tiny reproduction repository for YouTrack issue https://youtrack.jetbrains.com/issue/IDEA-359624

System: Windows 11

wsl -version
```
PS C:\Users\Sebastian> wsl --version
WSL-Version: 2.2.4.0
Kernelversion: 5.15.153.1-2
WSLg-Version: 1.0.61
MSRDC-Version: 1.2.5326
Direct3D-Version: 1.611.1-81528511
DXCore-Version: 10.0.26091.1-240325-1447.ge-release
Windows-Version: 10.0.22631.4169
```

Checkout repo inside of an WSL linux distribution (in my case it is Ubuntu-22.04)
Install a local SDK within the WSL disto (I used sdkman to install temurin-21)

* Run IntelliJ from windows and open the project via wsl path, f.e. \\wsl.localhost\Ubuntu-22.04\home\sebastian\projects\sample-maven-project
* Configure a maven and sdk from within the SWL distro.

* Running the SimpleTest class from within the IntelliJ works after a new start.
* Making changes to the test class and rerunning the test (after some time) can fail with the connection error
  * build process hangs
  * build can be stopped, test will run without the made changes
