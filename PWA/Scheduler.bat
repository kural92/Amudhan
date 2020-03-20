set ProjectPath=C:\Users\amuthan\eclipse-workspace\PWA
echo %ProjectPath%
set classpath=%ProjectPath%\bin;%ProjectPath%\lib\*
echo %classpath%
java org.testng.TestNG %ProjectPath%\cronscheduler.xml