# TViews

Easy to use library for simple adding typefaces to views using xml.

## How to use?

You can use this library in 2 ways:

  - You can add special gradle plugin for automatically generating string.xml file with font names.
  - You can use this library without plugin.
  
For connecting this library just put this code in your project build.gradle

```
allprojects {
    repositories {
        jcenter()
    }
}
```

and add this dependency into your module build.gradle file

```
   compile 'com.vkraevskiy.tviews:tviews:1.0.1'
```

### How to connect plugin?

Add this repository in your porject build.gradle

```
buildscript {
    repositories {
        maven { url 'https://plugins.gradle.org/m2/' }
    }
    dependencies {
        classpath "gradle.plugin.com.vkraevskiy.tviews:tviews-plugin:1.0.1"
    }
}
```

and into your module build.gradle file

```
apply plugin: "com.vkraevskiy.tviews"
```

then sync gradle project.


## License
Copyright 2016 vkraevskiy

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
