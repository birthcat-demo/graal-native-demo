## 目标
* 使用GraalVM以及native-image
* 在Java22上使用Gradle 8.7

### GraalVM
如果修改了MSVC的安装目录,需要在默认目录创造一个vcvars64的bat执行传递
```shell
mkdir "C:\Program Files\Microsoft Visual Studio\2022\Community\VC\Auxiliary\Build>"
echo "F:\Visual Studio\VC\Auxiliary\Build\vcvars64.bat" %* > "C:\Program Files\Microsoft Visual Studio\2022\Community\VC\Auxiliary\Build\vcvarsall.bat"
```

### Java22
在Idea中设置Gradle使用Java21
在gradle.properties中设置org.gradle.java.installations.paths
在build.gradle设置toolchain=22