# Overview

Gradle example for application that requires two different versions of the same
library.  

* Main.java: Gson v2.6.2
* OtherMain.java: Gson v2.3.1

# Method

* Two gradle modules are created
** core module builds into a fatjar which shadows Gson v2.6.2 dependency into a different classpath
** the fatjar is copied into the libs folder of app module
** app module compiles against shadowed Gson and also depends on Gson v2.3.1
** resulting app fatjar has com.google.gson.* and com.jwang.test.gson.*